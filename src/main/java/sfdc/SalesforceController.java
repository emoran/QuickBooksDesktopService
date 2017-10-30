package sfdc;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.emoran.Invoice;
import com.emoran.STQuickbooksActions;
import com.emoran.SendMailSSL;
import com.emoran.Invoice.InvoiceLineAdd;
import com.sforce.soap.partner.Connector;
import com.sforce.soap.partner.PartnerConnection;
import com.sforce.soap.partner.QueryResult;
import com.sforce.soap.partner.SaveResult;
import com.sforce.soap.partner.sobject.SObject;
import com.sforce.ws.ConnectionException;
import com.sforce.ws.ConnectorConfig;
import com.sforce.ws.bind.XmlObject;

public class SalesforceController {
	
	static final String USERNAME = "username";
	static final String PASSWORD = "poasswordANDtoken";
	static PartnerConnection connection;
	
	public static void salesforceLogin(){
		// TODO Auto-generated method stub
		ConnectorConfig config = new ConnectorConfig();
	    config.setUsername(USERNAME);
	    config.setPassword(PASSWORD);
	    //config.setTraceMessage(true);
	    
	    try {	        
	        connection = Connector.newConnection(config);	        
	        System.out.println("Auth EndPoint: "+config.getAuthEndpoint());
	        System.out.println("Service EndPoint: "+config.getServiceEndpoint());
	        System.out.println("Username: "+config.getUsername());
	        System.out.println("SessionId: "+config.getSessionId());
	        
	      } catch (ConnectionException e1) {
	          e1.printStackTrace();
	      }  
	}	
	
	/**
	 * 
	 * @return
	 */
	public List<String> getApprovedSisteTrakerInvoiceItems(){	
		List<String> invoicesToCreate = new ArrayList<String>();
		
		try{  
			QueryResult queryResults = connection.query("QUERY_TO_PARENT__INVOICE_OBJECT");						
			//Collecting Projects Id's in Hashset
			Set<String> projectIds = new HashSet<String>();
			if (queryResults.getSize() > 0) {
				for (SObject financeRecord: queryResults.getRecords()) {
					projectIds.add((String)financeRecord.getField("relationship_field_to_Invoice"));	
				}				
			}
			if(projectIds.size() > 0){
				List<Invoice> invoiceRecords = getProjectsWithFinanceItems(projectIds);					
				if(invoiceRecords.size() > 0){
					for(Invoice invoiceRecordToCreate:invoiceRecords){
						String quickBooksInsertInvoicePayload = STQuickbooksActions.createInvoiceWithCustomFields(invoiceRecordToCreate);
						invoicesToCreate.add(quickBooksInsertInvoicePayload);
					}
				}
			}
			else{
				System.out.println("NO RECORDS TO PROCESS");
			}
			

		}
		catch(Exception e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return invoicesToCreate;
	}
	
	/**
	 * 
	 * @param setProjectsId
	 * @return
	 */
	public List<Invoice> getProjectsWithFinanceItems(Set<String> setProjectsId){
		List<Invoice> invoiceArray = new ArrayList<Invoice>();
		
		String idSeparated = com.emoran.Utils.stringValueToCommaSeparatedf(setProjectsId);
		
		try {
			QueryResult queryResults = connection.query("Query_to_invoice_object_with_Subquery_to_lineitems where Id IN ("+idSeparated+")");
			if (queryResults.getSize() > 0) {
				for (SObject projectWithItemsApproved: queryResults.getRecords()) {
					//PROJECT LEVEL
					System.out.println("Invoice Name: "+projectWithItemsApproved.getField("Name"));
					
					SObject relatedQueryObject = (SObject) projectWithItemsApproved.getChild("strk__Site__r");
					
										
					Invoice invoiceRecord = new Invoice();
					invoiceRecord.fullCustomerName = (String)relatedQueryObject.getField("Name");
					invoiceRecord.memo = (String)projectWithItemsApproved.getField("Name");
					invoiceRecord.pONumber = (String)projectWithItemsApproved.getField("Name");
					invoiceRecord.refNumber = (String)projectWithItemsApproved.getField("Name");
					invoiceRecord.txnDate = com.emoran.Utils.getTodaysDate("yyyy-MM-dd");
					
					
					//Accessing to a low level array information
					List<XmlObject> itemLevelArray = new ArrayList<XmlObject>();
					Iterator<XmlObject> itemLevel = projectWithItemsApproved.getChildren("relation_ship_field_to_access_child_records__r");					
					while (itemLevel.hasNext()) {
						itemLevelArray.add(itemLevel.next());
				    }
					List<InvoiceLineAdd> lineItemArray = new ArrayList<InvoiceLineAdd>();
					Set<String> arrayItems = new HashSet<String>();
					//Subquery data Information
					for(XmlObject itemlevelRecord:itemLevelArray){
						//LINEITEM LEVEL

						List<XmlObject> itemLevelArray2 = new ArrayList<XmlObject>();
						Iterator<XmlObject> records = itemlevelRecord.getChildren("records");						
						while (records.hasNext()) {
							itemLevelArray2.add(records.next());
					    }
						
						for(XmlObject r:itemLevelArray2){
							arrayItems.add((String)r.getField("Id"));
							Invoice.InvoiceLineAdd lineItem = new InvoiceLineAdd();
							lineItem.itemFullName = "04 Concrete";
							lineItem.description = (String)r.getField("description__c");
							lineItem.quantity = 1;
							lineItem.rate = Double.valueOf((String)r.getField("Amount__c"));
							lineItemArray.add(lineItem);
						}
					}	
					
					String externalIds = com.emoran.Utils.stringValueToCommaSeparatedf(arrayItems);
					
					invoiceRecord.salesforceId = externalIds.replaceAll("'", "");//!important
					invoiceRecord.invoiceLineAddArray = lineItemArray;
					invoiceArray.add(invoiceRecord);
				}
			}			
		} 
		catch (ConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
		return invoiceArray;
	}
	
	// updates the 5 newly created Accounts
	public static void updateLineItems(String internalInvoiceId,String lineItemsToUpdate) {
		salesforceLogin();
		String[] salesforceIds = lineItemsToUpdate.split(",");
		
		List<SObject> sObjectList = new ArrayList<SObject>();
	   
	    //SObject[] records = new SObject[100];
	    
		for(String record:salesforceIds){
			record = record.trim();
			System.out.println("### Updating Line  Item with Id: "+record);
			
			try{
		    	
		    	SObject invoiceLineItem = new SObject();
		    	invoiceLineItem.setType("LineIteM__c");
		    	invoiceLineItem.setId(record);
		    	invoiceLineItem.setField("Id", internalInvoiceId);
		    	invoiceLineItem.setField("status","Created in QuickBooks");
		    	invoiceLineItem.setField("Date",Calendar.getInstance());
		    	sObjectList.add(invoiceLineItem);
		    	
		    	SObject[] records = new SObject[sObjectList.size()]; 
		    	sObjectList.toArray(records);
		       	      
		    	// update the records in Salesforce.com
		    	SaveResult[] saveResults = connection.update(records);
		    	SendMailSSL emails = new SendMailSSL();
		    	// check the returned results for any errors
		    	for (int i=0; i< saveResults.length; i++) {
		    	  if (saveResults[i].isSuccess()) {
		    		  System.out.println(i+". Record Updated: " + saveResults[i].getId());		    		  
		    		  emails.sendNotificationEmail("Successfully updated record - Id: " + saveResults[i].getId(),com.emoran.Utils.getTodaysDate("yyyy-MM-dd")+"- ST_QBD Line Item Updated");
		    	  } 
		    	  else {
		    		  System.out.println(i+" Error Updating Line");
		    		  com.sforce.soap.partner.Error[] errors = saveResults[i].getErrors();
		    		  for (int j=0; j< errors.length; j++) {
	    	            System.out.println("Error Updating Line Item: " + errors[j].getMessage());
	    	            emails.sendNotificationEmail("ERROR updating record: " + errors[j].getMessage(),com.emoran.Utils.getTodaysDate("yyyy-MM-dd")+"- ST_QBD Exception updating record.");
	    	          }
		    	  }    
		      }
		      
		    } 
		    catch (Exception e) {
		    	e.printStackTrace();
		    }    
		}    
	}
	
	public static void updateLineItemsInST(String ids,String invoice_Status){
		salesforceLogin();
		String[] salesforceIds = ids.split(",");
		
		List<SObject> sObjectList = new ArrayList<SObject>();
		
		for(String record:salesforceIds){
			record = record.trim();
			try{
		    	
		    	SObject invoiceLineItem = new SObject();
		    	invoiceLineItem.setType("strk__Finance__c");
		    	invoiceLineItem.setId(record);
		    	invoiceLineItem.setField("strk__Invoice_Status__c", "Payment Received");
		    	sObjectList.add(invoiceLineItem);
		    	
		    	SObject[] records = new SObject[sObjectList.size()]; 
		    	sObjectList.toArray(records);
		       	      
		    	// update the records in Salesforce.com
		    	SaveResult[] saveResults = connection.update(records);
		    	SendMailSSL emails = new SendMailSSL();
		    	// check the returned results for any errors
		    	for (int i=0; i< saveResults.length; i++) {
		    	  if (saveResults[i].isSuccess()) {
		    		  System.out.println(i+". Successfully updated record - Id: " + saveResults[i].getId());
		    		  
		    		  emails.sendNotificationEmail("Successfully updated record - Id: " + saveResults[i].getId(),com.emoran.Utils.getTodaysDate("yyyy-MM-dd")+"- ST_QBD Line Item Updated");
		    	  } 
		    	  else {
		    		  System.out.println("Something went wrong");
		    		  com.sforce.soap.partner.Error[] errors = saveResults[i].getErrors();
		    		  for (int j=0; j< errors.length; j++) {
	    	            System.out.println("ERROR updating record: " + errors[j].getMessage());
	    	            emails.sendNotificationEmail("ERROR updating record: " + errors[j].getMessage(),com.emoran.Utils.getTodaysDate("yyyy-MM-dd")+"- ST_QBD Error Updating Line Item");
	    	          }
		    	  }    
		      }
		      
		    } 
		    catch (Exception e) {
		    	e.printStackTrace();
		    }    
		}    
	}

}
