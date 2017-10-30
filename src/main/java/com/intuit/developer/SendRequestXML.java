/**
 * SendRequestXML.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */


package com.intuit.developer;


/**
 * SendRequestXML bean class
 */
@SuppressWarnings({"unchecked", "unused"})

public class SendRequestXML implements org.apache.axis2.databinding.ADBBean {
    @Override
    public String toString() {
        return "SendRequestXML{" +
                "localTicket='" + localTicket + '\'' +
                ", localTicketTracker=" + localTicketTracker +
                ", localStrHCPResponse='" + localStrHCPResponse + '\'' +
                ", localStrHCPResponseTracker=" + localStrHCPResponseTracker +
                ", localStrCompanyFileName='" + localStrCompanyFileName + '\'' +
                ", localStrCompanyFileNameTracker=" + localStrCompanyFileNameTracker +
                ", localQbXMLCountry='" + localQbXMLCountry + '\'' +
                ", localQbXMLCountryTracker=" + localQbXMLCountryTracker +
                ", localQbXMLMajorVers=" + localQbXMLMajorVers +
                ", localQbXMLMinorVers=" + localQbXMLMinorVers +
                '}';
    }

    public static final javax.xml.namespace.QName MY_QNAME =
            new javax.xml.namespace.QName("http://developer.intuit.com/", "sendRequestXML", "ns1");


    /**
     * field for Ticket
     */


    protected String localTicket;

    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localTicketTracker = false;

    public boolean isTicketSpecified() {
        return localTicketTracker;
    }


    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getTicket() {
        return localTicket;
    }


    /**
     * Auto generated setter method
     *
     * @param param Ticket
     */
    public void setTicket(String param) {
        localTicketTracker = param != null;

        this.localTicket = param;


    }


    /**
     * field for StrHCPResponse
     */


    protected String localStrHCPResponse;

    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localStrHCPResponseTracker = false;

    public boolean isStrHCPResponseSpecified() {
        return localStrHCPResponseTracker;
    }


    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getStrHCPResponse() {
        return localStrHCPResponse;
    }


    /**
     * Auto generated setter method
     *
     * @param param StrHCPResponse
     */
    public void setStrHCPResponse(String param) {
        localStrHCPResponseTracker = param != null;

        this.localStrHCPResponse = param;


    }


    /**
     * field for StrCompanyFileName
     */


    protected String localStrCompanyFileName;

    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localStrCompanyFileNameTracker = false;

    public boolean isStrCompanyFileNameSpecified() {
        return localStrCompanyFileNameTracker;
    }


    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getStrCompanyFileName() {
        return localStrCompanyFileName;
    }


    /**
     * Auto generated setter method
     *
     * @param param StrCompanyFileName
     */
    public void setStrCompanyFileName(String param) {
        localStrCompanyFileNameTracker = param != null;

        this.localStrCompanyFileName = param;


    }


    /**
     * field for QbXMLCountry
     */


    protected String localQbXMLCountry;

    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localQbXMLCountryTracker = false;

    public boolean isQbXMLCountrySpecified() {
        return localQbXMLCountryTracker;
    }


    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getQbXMLCountry() {
        return localQbXMLCountry;
    }


    /**
     * Auto generated setter method
     *
     * @param param QbXMLCountry
     */
    public void setQbXMLCountry(String param) {
        localQbXMLCountryTracker = param != null;

        this.localQbXMLCountry = param;


    }


    /**
     * field for QbXMLMajorVers
     */


    protected int localQbXMLMajorVers;


    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getQbXMLMajorVers() {
        return localQbXMLMajorVers;
    }


    /**
     * Auto generated setter method
     *
     * @param param QbXMLMajorVers
     */
    public void setQbXMLMajorVers(int param) {

        this.localQbXMLMajorVers = param;


    }


    /**
     * field for QbXMLMinorVers
     */


    protected int localQbXMLMinorVers;


    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getQbXMLMinorVers() {
        return localQbXMLMinorVers;
    }


    /**
     * Auto generated setter method
     *
     * @param param QbXMLMinorVers
     */
    public void setQbXMLMinorVers(int param) {

        this.localQbXMLMinorVers = param;


    }


    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                                                      final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {


        org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
        return factory.createOMElement(dataSource, MY_QNAME);

    }

    public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
        serialize(parentQName, xmlWriter, false);
    }

    public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                          boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


        String prefix = null;
        String namespace = null;


        prefix = parentQName.getPrefix();
        namespace = parentQName.getNamespaceURI();
        writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

        if (serializeType) {


            String namespacePrefix = registerPrefix(xmlWriter, "http://developer.intuit.com/");
            if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":sendRequestXML", xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "sendRequestXML", xmlWriter);
            }


        }
        if (localTicketTracker) {
            namespace = "http://developer.intuit.com/";
            writeStartElement(null, namespace, "ticket", xmlWriter);


            if (localTicket == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("ticket cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localTicket);

            }

            xmlWriter.writeEndElement();
        }
        if (localStrHCPResponseTracker) {
            namespace = "http://developer.intuit.com/";
            writeStartElement(null, namespace, "strHCPResponse", xmlWriter);


            if (localStrHCPResponse == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("strHCPResponse cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localStrHCPResponse);

            }

            xmlWriter.writeEndElement();
        }
        if (localStrCompanyFileNameTracker) {
            namespace = "http://developer.intuit.com/";
            writeStartElement(null, namespace, "strCompanyFileName", xmlWriter);


            if (localStrCompanyFileName == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("strCompanyFileName cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localStrCompanyFileName);

            }

            xmlWriter.writeEndElement();
        }
        if (localQbXMLCountryTracker) {
            namespace = "http://developer.intuit.com/";
            writeStartElement(null, namespace, "qbXMLCountry", xmlWriter);


            if (localQbXMLCountry == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("qbXMLCountry cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localQbXMLCountry);

            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://developer.intuit.com/";
        writeStartElement(null, namespace, "qbXMLMajorVers", xmlWriter);

        if (localQbXMLMajorVers == Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("qbXMLMajorVers cannot be null!!");

        } else {
            xmlWriter.writeCharacters(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQbXMLMajorVers));
        }

        xmlWriter.writeEndElement();

        namespace = "http://developer.intuit.com/";
        writeStartElement(null, namespace, "qbXMLMinorVers", xmlWriter);

        if (localQbXMLMinorVers == Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("qbXMLMinorVers cannot be null!!");

        } else {
            xmlWriter.writeCharacters(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQbXMLMinorVers));
        }

        xmlWriter.writeEndElement();

        xmlWriter.writeEndElement();


    }

    private static String generatePrefix(String namespace) {
        if (namespace.equals("http://developer.intuit.com/")) {
            return "ns1";
        }
        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(String prefix, String namespace, String localPart,
                                   javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
        String writerPrefix = xmlWriter.getPrefix(namespace);
        if (writerPrefix != null) {
            xmlWriter.writeStartElement(namespace, localPart);
        } else {
            if (namespace.length() == 0) {
                prefix = "";
            } else if (prefix == null) {
                prefix = generatePrefix(namespace);
            }

            xmlWriter.writeStartElement(prefix, localPart, namespace);
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(String prefix, String namespace, String attName, String attValue,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
        if (xmlWriter.getPrefix(namespace) == null) {
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
        xmlWriter.writeAttribute(namespace, attName, attValue);
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(String namespace, String attName, String attValue,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }
    }


    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(String namespace, String attName, javax.xml.namespace.QName qname,
                                     javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

        String attributeNamespace = qname.getNamespaceURI();
        String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }

    /**
     * method to handle Qnames
     */

    private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
        String namespaceURI = qname.getNamespaceURI();
        if (namespaceURI != null) {
            String prefix = xmlWriter.getPrefix(namespaceURI);
            if (prefix == null) {
                prefix = generatePrefix(namespaceURI);
                xmlWriter.writeNamespace(prefix, namespaceURI);
                xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
                xmlWriter.writeCharacters(
                        prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            } else {
                // i.e this is the default namespace
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }
    }

    private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

        if (qnames != null) {
            // we have to store this data until last moment since it is not possible to write any
            // namespace data after writing the charactor data
            StringBuffer stringToWrite = new StringBuffer();
            String namespaceURI = null;
            String prefix = null;

            for (int i = 0; i < qnames.length; i++) {
                if (i > 0) {
                    stringToWrite.append(" ");
                }
                namespaceURI = qnames[i].getNamespaceURI();
                if (namespaceURI != null) {
                    prefix = xmlWriter.getPrefix(namespaceURI);
                    if ((prefix == null) || (prefix.length() == 0)) {
                        prefix = generatePrefix(namespaceURI);
                        xmlWriter.writeNamespace(prefix, namespaceURI);
                        xmlWriter.setPrefix(prefix, namespaceURI);
                    }

                    if (prefix.trim().length() > 0) {
                        stringToWrite.append(prefix).append(":")
                                .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    } else {
                        stringToWrite
                                .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            }
            xmlWriter.writeCharacters(stringToWrite.toString());
        }

    }


    /**
     * Register a namespace prefix
     */
    private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
            throws javax.xml.stream.XMLStreamException {
        String prefix = xmlWriter.getPrefix(namespace);
        if (prefix == null) {
            prefix = generatePrefix(namespace);
            javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
            while (true) {
                String uri = nsContext.getNamespaceURI(prefix);
                if (uri == null || uri.length() == 0) {
                    break;
                }
                prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
            }
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
        return prefix;
    }


    /**
     * databinding method to get an XML representation of this object
     */
    public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException {


        java.util.ArrayList elementList = new java.util.ArrayList();
        java.util.ArrayList attribList = new java.util.ArrayList();

        if (localTicketTracker) {
            elementList.add(new javax.xml.namespace.QName("http://developer.intuit.com/", "ticket"));

            if (localTicket != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTicket));
            } else {
                throw new org.apache.axis2.databinding.ADBException("ticket cannot be null!!");
            }
        }
        if (localStrHCPResponseTracker) {
            elementList.add(new javax.xml.namespace.QName("http://developer.intuit.com/", "strHCPResponse"));

            if (localStrHCPResponse != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStrHCPResponse));
            } else {
                throw new org.apache.axis2.databinding.ADBException("strHCPResponse cannot be null!!");
            }
        }
        if (localStrCompanyFileNameTracker) {
            elementList.add(new javax.xml.namespace.QName("http://developer.intuit.com/", "strCompanyFileName"));

            if (localStrCompanyFileName != null) {
                elementList
                        .add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStrCompanyFileName));
            } else {
                throw new org.apache.axis2.databinding.ADBException("strCompanyFileName cannot be null!!");
            }
        }
        if (localQbXMLCountryTracker) {
            elementList.add(new javax.xml.namespace.QName("http://developer.intuit.com/", "qbXMLCountry"));

            if (localQbXMLCountry != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQbXMLCountry));
            } else {
                throw new org.apache.axis2.databinding.ADBException("qbXMLCountry cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://developer.intuit.com/", "qbXMLMajorVers"));

        elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQbXMLMajorVers));

        elementList.add(new javax.xml.namespace.QName("http://developer.intuit.com/", "qbXMLMinorVers"));

        elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQbXMLMinorVers));


        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
                attribList.toArray());


    }


    /**
     * Factory class that keeps the parse method
     */
    public static class Factory {


        /**
         * static method to create the object
         * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
         * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
         * Postcondition: If this object is an element, the reader is positioned at its end element
         * If this object is a complex type, the reader is positioned at the end element of its outer element
         */
        public static SendRequestXML parse(javax.xml.stream.XMLStreamReader reader) throws Exception {
            SendRequestXML object = new SendRequestXML();

            int event;
            String nillableValue = null;
            String prefix = "";
            String namespaceuri = "";
            try {

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();


                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                    String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
                    if (fullTypeName != null) {
                        String nsPrefix = null;
                        if (fullTypeName.indexOf(":") > -1) {
                            nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                        }
                        nsPrefix = nsPrefix == null ? "" : nsPrefix;

                        String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                        if (!"sendRequestXML".equals(type)) {
                            //find namespace for the prefix
                            String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (SendRequestXML) ExtensionMapper.getTypeObject(nsUri, type, reader);
                        }


                    }


                }


                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();


                reader.next();


                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://developer.intuit.com/", "ticket")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "ticket" + "  cannot be null");
                    }


                    String content = reader.getElementText();

                    object.setTicket(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("http://developer.intuit.com/", "strHCPResponse")
                                .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "strHCPResponse" + "  cannot be null");
                    }


                    String content = reader.getElementText();

                    object.setStrHCPResponse(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("http://developer.intuit.com/", "strCompanyFileName")
                                .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "strCompanyFileName" + "  cannot be null");
                    }


                    String content = reader.getElementText();

                    object.setStrCompanyFileName(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("http://developer.intuit.com/", "qbXMLCountry")
                                .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "qbXMLCountry" + "  cannot be null");
                    }


                    String content = reader.getElementText();

                    object.setQbXMLCountry(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("http://developer.intuit.com/", "qbXMLMajorVers")
                                .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "qbXMLMajorVers" + "  cannot be null");
                    }


                    String content = reader.getElementText();

                    object.setQbXMLMajorVers(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("http://developer.intuit.com/", "qbXMLMinorVers")
                                .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "qbXMLMinorVers" + "  cannot be null");
                    }


                    String content = reader.getElementText();

                    object.setQbXMLMinorVers(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement())
                    // A start element we are not expecting indicates a trailing invalid property
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());


            } catch (javax.xml.stream.XMLStreamException e) {
                throw new Exception(e);
            }

            return object;
        }

    }//end of factory class


}
           
    