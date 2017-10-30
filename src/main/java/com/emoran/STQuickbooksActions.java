package com.emoran;

public class STQuickbooksActions {
	
	public static String createInvoiceWithItems(Invoice invoiceWithItemsRecord){
		String payload = "";
		payload+="<?xml version=\"1.0\" encoding=\"utf-8\"?>";
		payload+="<?qbxml version=\"10.0\"?>";
		payload+="<QBXML>";
		payload+="<QBXMLMsgsRq onError=\"stopOnError\">";
		payload+="<InvoiceAddRq requestID=\"2\">";
		payload+="	<InvoiceAdd>";
		payload+="		<CustomerRef>";
		payload+="			<FullName>"+invoiceWithItemsRecord.fullCustomerName+"</FullName>";
		payload+="		</CustomerRef>";
		payload+="		<TxnDate>"+invoiceWithItemsRecord.txnDate+"</TxnDate>";//2007-12-14 createdDate
		payload+="		<RefNumber>"+invoiceWithItemsRecord.refNumber+"</RefNumber>";
		payload+="		<BillAddress>";
		payload+="			<Addr1>56 Cowles Road</Addr1>";
		payload+="			<City>Willington</City>";
		payload+="			<State>CT</State>";
		payload+="			<PostalCode>06279</PostalCode>";
		payload+="			<Country>United States</Country>";
		payload+="		</BillAddress>";
		payload+="		<PONumber>"+invoiceWithItemsRecord.pONumber+"</PONumber>";
		payload+="		<Memo>"+invoiceWithItemsRecord.memo+"</Memo> ";		        
		
		for(Invoice.InvoiceLineAdd invoiceLine:invoiceWithItemsRecord.invoiceLineAddArray){
			payload+="		<InvoiceLineAdd>";
			payload+="			<ItemRef>";
			payload+="				<FullName>"+invoiceLine.itemFullName+"</FullName>";//04 Concrete
			payload+="			</ItemRef>";
			payload+="			<Desc>"+invoiceLine.description+"</Desc>";
			payload+="			<Quantity>"+invoiceLine.quantity+"</Quantity>";
			payload+="			<Rate>"+invoiceLine.rate+"</Rate>";
			payload+="		</InvoiceLineAdd> ";
		}
		
		payload+="	</InvoiceAdd>";
		payload+="</InvoiceAddRq>";
		payload+="</QBXMLMsgsRq>";
		payload+="</QBXML>";
		return payload;
	}
	
	/**
	 * 
	 * @param invoiceWithItemsRecord
	 * @return
	 */
	public static String createInvoiceWithCustomFields(Invoice invoiceWithItemsRecord){
		String payload = "";
		payload+="<?xml version=\"1.0\" encoding=\"utf-8\"?>";
		payload+="<?qbxml version=\"11.0\"?>";
		payload+="<QBXML>";
		payload+="    <QBXMLMsgsRq onError=\"continueOnError\">";
		payload+="        <InvoiceAddRq>";
		payload+="            <InvoiceAdd defMacro=\"TxnID:Invoice19993557\">";
		payload+="                <CustomerRef>";
		payload+="                    <FullName>"+invoiceWithItemsRecord.fullCustomerName+"</FullName>";
		payload+="                </CustomerRef>";
		payload+="                <TxnDate>"+invoiceWithItemsRecord.txnDate+"</TxnDate>";
		payload+="                <RefNumber>"+invoiceWithItemsRecord.refNumber+"</RefNumber>";
		payload+="                <BillAddress>";
		payload+="                    <Addr1>LAQUANDUS  HARDIN</Addr1>";
		payload+="                    <Addr2>17118 s locust dr</Addr2>";
		payload+="                    <City>hazel crest</City>";
		payload+="                    <State>IL</State>";
		payload+="                    <PostalCode>60429</PostalCode>";
		payload+="                </BillAddress>";
		payload+="                <IsToBePrinted>true</IsToBePrinted>";
		
		for(Invoice.InvoiceLineAdd item:invoiceWithItemsRecord.invoiceLineAddArray){
			payload+="                <InvoiceLineAdd>";
			payload+="                    <ItemRef>";
			payload+="                        <FullName>"+item.itemFullName+"</FullName>";
			payload+="                    </ItemRef>";
			payload+="                    <Desc>"+item.description+"</Desc>";
			payload+="                    <Quantity>"+item.quantity+"</Quantity>";
			payload+="                    <Rate>"+item.rate+"</Rate>";
			payload+="                </InvoiceLineAdd>";
		}
		payload+="            </InvoiceAdd>";		
		payload+="        </InvoiceAddRq>";
		payload+="       <DataExtAddRq requestID=\"86290\">";
		payload+="            <DataExtAdd>";
		payload+="                <OwnerID>0</OwnerID>";
		payload+="                <DataExtName>salesforceid</DataExtName>";
		payload+="                <TxnDataExtType>Invoice</TxnDataExtType>";
		payload+="                <TxnID useMacro=\"TxnID:Invoice19993557\" />";
		payload+="                <DataExtValue>"+invoiceWithItemsRecord.salesforceId+"</DataExtValue>";
		payload+="            </DataExtAdd>";
		payload+="       </DataExtAddRq>";
		payload+="    </QBXMLMsgsRq>";
		payload+="</QBXML>";
		return payload;
	}
	
	public void getInvoices(){
		
	}
	
	public static String queryAllInvoices(){
		
		String queryInvoices = "";
		queryInvoices+="<?xml version=\"1.0\" encoding=\"utf-8\"?>";
		queryInvoices+="<?qbxml version=\"8.0\"?>";
		queryInvoices+="<QBXML>";
		queryInvoices+="	<QBXMLMsgsRq onError=\"stopOnError\">";
		queryInvoices+="		<InvoiceQueryRq requestID=\"2\">";	
		queryInvoices+="			<OwnerID>0</OwnerID>";
		queryInvoices+="		</InvoiceQueryRq>";
		queryInvoices+="	</QBXMLMsgsRq>";
		queryInvoices+="</QBXML>";
		
		return queryInvoices;
	}
	
	public static String updateInvoicePayload(String invoiceId,String status){
		String queryInvoices = "";
		queryInvoices+="<?xml version=\"1.0\" encoding=\"utf-8\"?>";
		queryInvoices+="<?qbxml version=\"8.0\"?>";
		queryInvoices+="<QBXML>";
		queryInvoices+="<QBXMLMsgsRq onError=\"stopOnError\">";
		queryInvoices+="<InvoiceModRq requestID=\"1\">";	
		queryInvoices+="<InvoiceMod defMacro=\"TxnID:Invoice19993557\">";
		queryInvoices+="<TxnID>"+invoiceId+"</TxnID>";
		queryInvoices+="</InvoiceMod>";
		queryInvoices+="</InvoiceModRq>";
		queryInvoices+="<DataExtModRq requestID=\"86290\">";
		queryInvoices+="<DataExtMod>";
		queryInvoices+=" <OwnerID>0</OwnerID>";
		queryInvoices+="<DataExtName>st_status</DataExtName>";
		queryInvoices+="<TxnDataExtType>Invoice</TxnDataExtType>";
		queryInvoices+="<TxnID useMacro=\"TxnID:Invoice19993557\" />";
		queryInvoices+="<DataExtValue>"+status+"</DataExtValue>";
		queryInvoices+="</DataExtMod>";
		queryInvoices+="</DataExtModRq>";
		queryInvoices+="</QBXMLMsgsRq>";
		queryInvoices+="</QBXML>";
		
		return queryInvoices;
	}
}
