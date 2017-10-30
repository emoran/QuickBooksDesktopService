package com.emoran.test;

import static org.junit.Assert.*;

import javax.xml.bind.JAXBException;

import org.junit.Test;

import com.emoran.testWS.QBWebConnectorSvcSkeleton;
import com.intuit.developer.ReceiveResponseXML;

public class SckeletonTest {

	@Test
	public void test() throws JAXBException {
		
		ReceiveResponseXML receiveReponseData = new ReceiveResponseXML();
		receiveReponseData.setMessage("Yes");
		receiveReponseData.setResponse("<?xml version=\"1.0\"?><QBXML><QBXMLMsgsRs><InvoiceQueryRs><InvoiceRet><TxnID>1DA-1509046224</TxnID><TxnDate>2017-10-26</TxnDate><RefNumber>P-000008</RefNumber><IsPaid>false</IsPaid><DataExtRet><OwnerID>0</OwnerID><DataExtName>SalesforceId</DataExtName><DataExtType>STR255TYPE</DataExtType><DataExtValue>a06f40000010JCvAAM</DataExtValue></DataExtRet></InvoiceRet></InvoiceQueryRs><InvoiceAddRs requestID=\"2\" statusCode=\"0\" statusSeverity=\"Info\" statusMessage=\"Status OK\"><InvoiceRet><RefNumber>33333</RefNumber><TxnID>16-1508850864</TxnID></InvoiceRet></InvoiceAddRs><DataExtAddRs requestID=\"86290\" statusCode=\"0\" statusSeverity=\"Info\" statusMessage=\"Status OK\"><DataExtRet><OwnerID>0</OwnerID><DataExtName>salesforceid</DataExtName><DataExtType>STR255TYPE</DataExtType><DataExtValue>a06f40000010JCvAAM</DataExtValue></DataExtRet></DataExtAddRs></QBXMLMsgsRs></QBXML>");
		
		QBWebConnectorSvcSkeleton test1 = new QBWebConnectorSvcSkeleton();
		//test1.receiveResponseXML(receiveReponseData);
	}
	
	@Test
	public void testUpdateInvoiceInST() throws JAXBException {
		
		ReceiveResponseXML receiveReponseData = new ReceiveResponseXML();
		receiveReponseData.setMessage("Yes");
		receiveReponseData.setResponse("<?xml version=\"1.0\"?><QBXML><QBXMLMsgsRs><InvoiceQueryRs><InvoiceRet><TxnID>1DA-1509046224</TxnID><TxnDate>2017-10-26</TxnDate><RefNumber>P-000008</RefNumber><IsPaid>true</IsPaid><DataExtRet><OwnerID>0</OwnerID><DataExtName>SalesforceId</DataExtName><DataExtType>STR255TYPE</DataExtType><DataExtValue>a06f40000010JCvAAM</DataExtValue></DataExtRet></InvoiceRet></InvoiceQueryRs></QBXMLMsgsRs></QBXML>");
		
		QBWebConnectorSvcSkeleton test1 = new QBWebConnectorSvcSkeleton();
		//test1.receiveResponseXML(receiveReponseData);
	}

}
