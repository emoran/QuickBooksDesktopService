/**
 * QBWebConnectorSvcMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package com.emoran.testWS;

/**
 * QBWebConnectorSvcMessageReceiverInOut message receiver
 */

public class QBWebConnectorSvcMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver {


    public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext,
                                    org.apache.axis2.context.MessageContext newMsgContext)
            throws org.apache.axis2.AxisFault {

        try {

            // get the implementation class for the Web Service
            Object obj = getTheImplementationObject(msgContext);

            QBWebConnectorSvcSkeleton skel = (QBWebConnectorSvcSkeleton) obj;
            //Out Envelop
            org.apache.axiom.soap.SOAPEnvelope envelope = null;
            //Find the axisOperation that has been set by the Dispatch phase.
            org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
            if (op == null) {
                throw new org.apache.axis2.AxisFault(
                        "Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
            }

            String methodName;
            if ((op.getName() != null) && ((methodName =
                    org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)) {


                if ("sendRequestXML".equals(methodName)) {

                    com.intuit.developer.SendRequestXMLResponse sendRequestXMLResponse1 = null;
                    com.intuit.developer.SendRequestXML wrappedParam = (com.intuit.developer.SendRequestXML) fromOM(
                            msgContext.getEnvelope().getBody().getFirstElement(),
                            com.intuit.developer.SendRequestXML.class, getEnvelopeNamespaces(msgContext.getEnvelope()));

                    sendRequestXMLResponse1 =


                            skel.sendRequestXML(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext), sendRequestXMLResponse1, false,
                            new javax.xml.namespace.QName("http://developer.intuit.com/", "sendRequestXML"));
                } else if ("connectionError".equals(methodName)) {

                    com.intuit.developer.ConnectionErrorResponse connectionErrorResponse3 = null;
                    com.intuit.developer.ConnectionError wrappedParam = (com.intuit.developer.ConnectionError) fromOM(
                            msgContext.getEnvelope().getBody().getFirstElement(),
                            com.intuit.developer.ConnectionError.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    connectionErrorResponse3 =


                            skel.connectionError(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext), connectionErrorResponse3, false,
                            new javax.xml.namespace.QName("http://developer.intuit.com/", "connectionError"));
                } else if ("serverVersion".equals(methodName)) {

                    com.intuit.developer.ServerVersionResponse serverVersionResponse5 = null;
                    com.intuit.developer.ServerVersion wrappedParam = (com.intuit.developer.ServerVersion) fromOM(
                            msgContext.getEnvelope().getBody().getFirstElement(),
                            com.intuit.developer.ServerVersion.class, getEnvelopeNamespaces(msgContext.getEnvelope()));

                    serverVersionResponse5 =


                            skel.serverVersion(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext), serverVersionResponse5, false,
                            new javax.xml.namespace.QName("http://developer.intuit.com/", "serverVersion"));
                } else if ("clientVersion".equals(methodName)) {

                    com.intuit.developer.ClientVersionResponse clientVersionResponse7 = null;
                    com.intuit.developer.ClientVersion wrappedParam = (com.intuit.developer.ClientVersion) fromOM(
                            msgContext.getEnvelope().getBody().getFirstElement(),
                            com.intuit.developer.ClientVersion.class, getEnvelopeNamespaces(msgContext.getEnvelope()));

                    clientVersionResponse7 =


                            skel.clientVersion(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext), clientVersionResponse7, false,
                            new javax.xml.namespace.QName("http://developer.intuit.com/", "clientVersion"));
                } else if ("closeConnection".equals(methodName)) {

                    com.intuit.developer.CloseConnectionResponse closeConnectionResponse9 = null;
                    com.intuit.developer.CloseConnection wrappedParam = (com.intuit.developer.CloseConnection) fromOM(
                            msgContext.getEnvelope().getBody().getFirstElement(),
                            com.intuit.developer.CloseConnection.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    closeConnectionResponse9 =


                            skel.closeConnection(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext), closeConnectionResponse9, false,
                            new javax.xml.namespace.QName("http://developer.intuit.com/", "closeConnection"));
                } else if ("getLastError".equals(methodName)) {

                    com.intuit.developer.GetLastErrorResponse getLastErrorResponse11 = null;
                    com.intuit.developer.GetLastError wrappedParam = (com.intuit.developer.GetLastError) fromOM(
                            msgContext.getEnvelope().getBody().getFirstElement(),
                            com.intuit.developer.GetLastError.class, getEnvelopeNamespaces(msgContext.getEnvelope()));

                    getLastErrorResponse11 =


                            skel.getLastError(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext), getLastErrorResponse11, false,
                            new javax.xml.namespace.QName("http://developer.intuit.com/", "getLastError"));
                } else if ("authenticate".equals(methodName)) {

                    com.intuit.developer.AuthenticateResponse authenticateResponse13 = null;
                    com.intuit.developer.Authenticate wrappedParam = (com.intuit.developer.Authenticate) fromOM(
                            msgContext.getEnvelope().getBody().getFirstElement(),
                            com.intuit.developer.Authenticate.class, getEnvelopeNamespaces(msgContext.getEnvelope()));

                    authenticateResponse13 =


                            skel.authenticate(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext), authenticateResponse13, false,
                            new javax.xml.namespace.QName("http://developer.intuit.com/", "authenticate"));
                } else if ("receiveResponseXML".equals(methodName)) {

                    com.intuit.developer.ReceiveResponseXMLResponse receiveResponseXMLResponse15 = null;
                    com.intuit.developer.ReceiveResponseXML wrappedParam =
                            (com.intuit.developer.ReceiveResponseXML) fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.intuit.developer.ReceiveResponseXML.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));

                    receiveResponseXMLResponse15 =


                            skel.receiveResponseXML(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext), receiveResponseXMLResponse15, false,
                            new javax.xml.namespace.QName("http://developer.intuit.com/", "receiveResponseXML"));

                } else {
                    throw new RuntimeException("method not found");
                }


                newMsgContext.setEnvelope(envelope);
            }
        } catch (Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    //
    private org.apache.axiom.om.OMElement toOM(com.intuit.developer.SendRequestXML param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(com.intuit.developer.SendRequestXML.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(com.intuit.developer.SendRequestXMLResponse param,
                                               boolean optimizeContent) throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(com.intuit.developer.SendRequestXMLResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(com.intuit.developer.ConnectionError param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(com.intuit.developer.ConnectionError.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(com.intuit.developer.ConnectionErrorResponse param,
                                               boolean optimizeContent) throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(com.intuit.developer.ConnectionErrorResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(com.intuit.developer.ServerVersion param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(com.intuit.developer.ServerVersion.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(com.intuit.developer.ServerVersionResponse param,
                                               boolean optimizeContent) throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(com.intuit.developer.ServerVersionResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(com.intuit.developer.ClientVersion param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(com.intuit.developer.ClientVersion.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(com.intuit.developer.ClientVersionResponse param,
                                               boolean optimizeContent) throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(com.intuit.developer.ClientVersionResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(com.intuit.developer.CloseConnection param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(com.intuit.developer.CloseConnection.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(com.intuit.developer.CloseConnectionResponse param,
                                               boolean optimizeContent) throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(com.intuit.developer.CloseConnectionResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(com.intuit.developer.GetLastError param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(com.intuit.developer.GetLastError.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(com.intuit.developer.GetLastErrorResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(com.intuit.developer.GetLastErrorResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(com.intuit.developer.Authenticate param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(com.intuit.developer.Authenticate.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(com.intuit.developer.AuthenticateResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(com.intuit.developer.AuthenticateResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(com.intuit.developer.ReceiveResponseXML param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(com.intuit.developer.ReceiveResponseXML.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(com.intuit.developer.ReceiveResponseXMLResponse param,
                                               boolean optimizeContent) throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(com.intuit.developer.ReceiveResponseXMLResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                                          com.intuit.developer.SendRequestXMLResponse param,
                                                          boolean optimizeContent,
                                                          javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                    .addChild(param.getOMElement(com.intuit.developer.SendRequestXMLResponse.MY_QNAME, factory));


            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private com.intuit.developer.SendRequestXMLResponse wrapsendRequestXML() {
        com.intuit.developer.SendRequestXMLResponse wrappedElement = new com.intuit.developer.SendRequestXMLResponse();
        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                                          com.intuit.developer.ConnectionErrorResponse param,
                                                          boolean optimizeContent,
                                                          javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                    .addChild(param.getOMElement(com.intuit.developer.ConnectionErrorResponse.MY_QNAME, factory));


            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private com.intuit.developer.ConnectionErrorResponse wrapconnectionError() {
        com.intuit.developer.ConnectionErrorResponse wrappedElement =
                new com.intuit.developer.ConnectionErrorResponse();
        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                                          com.intuit.developer.ServerVersionResponse param,
                                                          boolean optimizeContent,
                                                          javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                    .addChild(param.getOMElement(com.intuit.developer.ServerVersionResponse.MY_QNAME, factory));


            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private com.intuit.developer.ServerVersionResponse wrapserverVersion() {
        com.intuit.developer.ServerVersionResponse wrappedElement = new com.intuit.developer.ServerVersionResponse();
        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                                          com.intuit.developer.ClientVersionResponse param,
                                                          boolean optimizeContent,
                                                          javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                    .addChild(param.getOMElement(com.intuit.developer.ClientVersionResponse.MY_QNAME, factory));


            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private com.intuit.developer.ClientVersionResponse wrapclientVersion() {
        com.intuit.developer.ClientVersionResponse wrappedElement = new com.intuit.developer.ClientVersionResponse();
        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                                          com.intuit.developer.CloseConnectionResponse param,
                                                          boolean optimizeContent,
                                                          javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                    .addChild(param.getOMElement(com.intuit.developer.CloseConnectionResponse.MY_QNAME, factory));


            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private com.intuit.developer.CloseConnectionResponse wrapcloseConnection() {
        com.intuit.developer.CloseConnectionResponse wrappedElement =
                new com.intuit.developer.CloseConnectionResponse();
        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                                          com.intuit.developer.GetLastErrorResponse param,
                                                          boolean optimizeContent,
                                                          javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                    .addChild(param.getOMElement(com.intuit.developer.GetLastErrorResponse.MY_QNAME, factory));


            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private com.intuit.developer.GetLastErrorResponse wrapgetLastError() {
        com.intuit.developer.GetLastErrorResponse wrappedElement = new com.intuit.developer.GetLastErrorResponse();
        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                                          com.intuit.developer.AuthenticateResponse param,
                                                          boolean optimizeContent,
                                                          javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                    .addChild(param.getOMElement(com.intuit.developer.AuthenticateResponse.MY_QNAME, factory));


            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private com.intuit.developer.AuthenticateResponse wrapauthenticate() {
        com.intuit.developer.AuthenticateResponse wrappedElement = new com.intuit.developer.AuthenticateResponse();
        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                                          com.intuit.developer.ReceiveResponseXMLResponse param,
                                                          boolean optimizeContent,
                                                          javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                    .addChild(param.getOMElement(com.intuit.developer.ReceiveResponseXMLResponse.MY_QNAME, factory));


            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private com.intuit.developer.ReceiveResponseXMLResponse wrapreceiveResponseXML() {
        com.intuit.developer.ReceiveResponseXMLResponse wrappedElement =
                new com.intuit.developer.ReceiveResponseXMLResponse();
        return wrappedElement;
    }


    /**
     * get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }


    private Object fromOM(org.apache.axiom.om.OMElement param, Class type, java.util.Map extraNamespaces)
            throws org.apache.axis2.AxisFault {

        try {

            if (com.intuit.developer.SendRequestXML.class.equals(type)) {

                return com.intuit.developer.SendRequestXML.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (com.intuit.developer.SendRequestXMLResponse.class.equals(type)) {

                return com.intuit.developer.SendRequestXMLResponse.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (com.intuit.developer.ConnectionError.class.equals(type)) {

                return com.intuit.developer.ConnectionError.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (com.intuit.developer.ConnectionErrorResponse.class.equals(type)) {

                return com.intuit.developer.ConnectionErrorResponse.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (com.intuit.developer.ServerVersion.class.equals(type)) {

                return com.intuit.developer.ServerVersion.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (com.intuit.developer.ServerVersionResponse.class.equals(type)) {

                return com.intuit.developer.ServerVersionResponse.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (com.intuit.developer.ClientVersion.class.equals(type)) {

                return com.intuit.developer.ClientVersion.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (com.intuit.developer.ClientVersionResponse.class.equals(type)) {

                return com.intuit.developer.ClientVersionResponse.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (com.intuit.developer.CloseConnection.class.equals(type)) {

                return com.intuit.developer.CloseConnection.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (com.intuit.developer.CloseConnectionResponse.class.equals(type)) {

                return com.intuit.developer.CloseConnectionResponse.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (com.intuit.developer.GetLastError.class.equals(type)) {

                return com.intuit.developer.GetLastError.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (com.intuit.developer.GetLastErrorResponse.class.equals(type)) {

                return com.intuit.developer.GetLastErrorResponse.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (com.intuit.developer.Authenticate.class.equals(type)) {

                return com.intuit.developer.Authenticate.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (com.intuit.developer.AuthenticateResponse.class.equals(type)) {

                return com.intuit.developer.AuthenticateResponse.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (com.intuit.developer.ReceiveResponseXML.class.equals(type)) {

                return com.intuit.developer.ReceiveResponseXML.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (com.intuit.developer.ReceiveResponseXMLResponse.class.equals(type)) {

                return com.intuit.developer.ReceiveResponseXMLResponse.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());


            }

        } catch (Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
        return null;
    }


    /**
     * A utility method that copies the namepaces from the SOAPEnvelope
     */
    private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env) {
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
        }
        return returnMap;
    }

    private org.apache.axis2.AxisFault createAxisFault(Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

}//end of class
    