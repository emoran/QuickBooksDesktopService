/**
 * QBWebConnectorSvcSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package com.emoran.testWS;

import com.emoran.InvoiceRet;
import com.emoran.QBXML;
import com.emoran.STQuickbooksActions;
import com.emoran.SendMailSSL;
import com.intuit.developer.*;

import sfdc.SalesforceController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 * QBWebConnectorSvcSkeleton java skeleton for the axisService
 */
public class QBWebConnectorSvcSkeleton {

    static boolean stop = false;
    static String requestType="";

    private final Logger log = LoggerFactory.getLogger(QBWebConnectorSvcSkeleton.class);
    private String authenticatedUserID;
    public static List<String> requestQueue = new ArrayList<String>();
    public SendMailSSL emails = new SendMailSSL();

    /**
     * Prepares and send QBXML request for execute on Quickbooks Company data.
     *
     * @param sendRequestXML
     * @return sendRequestXMLResponse
     */
    public SendRequestXMLResponse sendRequestXML(SendRequestXML sendRequestXML) {
    	SendRequestXMLResponse sendRequestXMLResponse = new SendRequestXMLResponse();
        System.out.println("Inside QB Web service");
    	return sendRequestXMLResponse;
    }


    /**
     * Received when there are error while connection to Quickbooks.
     *
     * @param connectionError
     * @return connectionErrorResponse
     */

    public ConnectionErrorResponse connectionError(ConnectionError connectionError) {
        //log.info("Connection error: " + connectionError.toString());
        ConnectionErrorResponse connectionErrorResponse = new ConnectionErrorResponse();
        connectionErrorResponse.setConnectionErrorResult("");
        return connectionErrorResponse;
    }


    /**
     * Notify Webconnector about server (this webservice) version.
     *
     * @param serverVersion
     * @return serverVersionResponse
     */

    public ServerVersionResponse serverVersion(ServerVersion serverVersion) {
        //log.info("serverVersion: " + serverVersion.toString());
        ServerVersionResponse serverVersionResponse = new ServerVersionResponse();
        serverVersionResponse.setServerVersionResult("1.0");
        return serverVersionResponse;
    }


    /**
     * Provides information about version of WebConnector.
     * Allow to request user to update WebConnector if current version of WebConnector does not meet our requirements.
     *
     * @param clientVersion
     * @return clientVersionResponse
     */

    public ClientVersionResponse clientVersion(ClientVersion clientVersion) {
        //log.info("clientVersion: " + clientVersion.toString());
        // create empty response for continue.
        ClientVersionResponse clientVersionResponse = new ClientVersionResponse();
        return clientVersionResponse;
    }


    /**
     * Action on close connection with Quickbooks.
     *
     * @param closeConnection
     * @return closeConnectionResponse
     */

    public CloseConnectionResponse closeConnection(CloseConnection closeConnection) {
        //log.info("closeConnection: " + closeConnection.toString());
        CloseConnectionResponse closeConnectionResponse = new CloseConnectionResponse();
        closeConnectionResponse.setCloseConnectionResult("Close connection.");
        return closeConnectionResponse;
    }


    /**
     * Return errors.
     *
     * @param getLastError
     * @return getLastErrorResponse
     */

    public GetLastErrorResponse getLastError(GetLastError getLastError) {
        log.info("getLastError: " + getLastError.toString());
        GetLastErrorResponse lastErrorResponse = new GetLastErrorResponse();
        // return empty: no errors.
        return lastErrorResponse;
    }


    /**
     * Authenticate user in our webservice.
     *
     * @param authenticate
     * @return authenticateResponse
     */

    public AuthenticateResponse authenticate(Authenticate authenticate) {
      AuthenticateResponse authenticateResponse = new AuthenticateResponse();
      ArrayOfString arrayOfString = new ArrayOfString();
      authenticatedUserID = UUID.randomUUID().toString();
      arrayOfString.addString(authenticatedUserID);
      stop = false;
      arrayOfString.addString("");
      authenticateResponse.setAuthenticateResult(arrayOfString);
      return authenticateResponse;
    }


    /**
     * Auto generated method signature
     *
     * @param receiveResponseXML
     * @return receiveResponseXMLResponse
     * @throws JAXBException 
     */
    public ReceiveResponseXMLResponse receiveResponseXML(ReceiveResponseXML receiveResponseXML) {    	
    	
    	try{
    		System.out.println("RAW RESPONSE:"+receiveResponseXML.getResponse());
        	
    		/*
    			JAXBContext jaxbContext = JAXBContext.newInstance(QBXML.class);
            	Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();    	
        		
        		QBXML mainDocument = (QBXML) jaxbUnmarshaller.unmarshal(new StringReader(receiveResponseXML.getResponse()));    		
            	
        		//UPDATE QUICKBOOKS INVOICE 
        		if(mainDocument.QBXMLMsgsRs.InvoiceQueryRs != null){
        			if(mainDocument.QBXMLMsgsRs.InvoiceQueryRs.InvoiceRet.size()>0){
            			System.out.println("Result contains Invoice query records");
            			
            			for(InvoiceRet invoiceRecord:mainDocument.QBXMLMsgsRs.InvoiceQueryRs.InvoiceRet){
            				if(invoiceRecord.IsPaid.equals("true")){
            					System.out.println("Updating invoice status: "+invoiceRecord.DataExtRet.DataExtValue);
            					SalesforceController.updateLineItemsInST(invoiceRecord.DataExtRet.DataExtValue,"Payment Received");        					
            					String updating_invoice_payload = STQuickbooksActions.updateInvoicePayload(invoiceRecord.TxnID,"true");
            					System.out.println("Adding request to queue");
            					requestQueue.add(updating_invoice_payload);   					
            					
            				}
            			}        			
            		}
        		}
        	
        		if(mainDocument.QBXMLMsgsRs.InvoiceAddRs !=null){
        			System.out.println("Response is for push data Into QuickBooks .");
        			System.out.println(":::::::: InternalId: "+mainDocument.QBXMLMsgsRs.InvoiceAddRs.InvoiceRet.TxnID+" Invoice created with reference Number: "+mainDocument.QBXMLMsgsRs.InvoiceAddRs.InvoiceRet.RefNumber+" SalesforceId to Update: "+mainDocument.QBXMLMsgsRs.DataExtAddRs.DataExtRet.DataExtValue);
        	    	SalesforceController.updateLineItems(mainDocument.QBXMLMsgsRs.InvoiceAddRs.InvoiceRet.TxnID,mainDocument.QBXMLMsgsRs.DataExtAddRs.DataExtRet.DataExtValue);
        		}
    		*/
    		
    	}
    	catch(Exception er){
    		er.printStackTrace(System.out);
    		
    		StringWriter sw = new StringWriter();
    		PrintWriter pw = new PrintWriter(sw);
    		er.printStackTrace(pw);
    		String sStackTrace = sw.toString(); // stack trace as a string
    		
    		//emails.sendNotificationEmail("ERROR updating record: " + sStackTrace,com.emoran.Utils.getTodaysDate("yyyy-MM-dd")+"- ST_QBD Exception reading XML Response");
    	}
    	
        
        return new ReceiveResponseXMLResponse();
    }

}
