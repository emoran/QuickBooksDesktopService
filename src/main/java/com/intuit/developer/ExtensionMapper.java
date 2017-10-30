/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */


package com.intuit.developer;

/**
 * ExtensionMapper class
 */
@SuppressWarnings({"unchecked", "unused"})

public class ExtensionMapper {

    public static Object getTypeObject(String namespaceURI, String typeName, javax.xml.stream.XMLStreamReader reader)
            throws Exception {


        if ("http://developer.intuit.com/".equals(namespaceURI) && "ArrayOfString".equals(typeName)) {

            return ArrayOfString.Factory.parse(reader);


        }


        throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
    }

}
    