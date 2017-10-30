# QuickBooksDesktopService
Project will create a webservice interfase between QuickBooks Desktop and Salesforce, basically exposes the web service in JAVA axis.

Main action are:

- Expose a webservice that Quickbooks Desktop can use to check request and responses.
- The process allows to send data to salesforce
- Create a Invoice with LineItems with custom Fields in QuickBooks desktop

In order to make it work you can build the project with: *mvn clean install* commnad then you need to copy you .war file to your web apps folder
were tomcat server has been installed and you service will be available in http://localhost/emoran-1.0-SNAPSHOT/services/QBWebConnectorSvc?wsdl
