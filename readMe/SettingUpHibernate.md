# Maven dependencies

We want the following dependencies:
- org.hibernate.hibernate-core 5.4.23.Final
- org.hibernate.javax.persistence.hibernate-jpa-2.1-api 1.0.2.Final
- org.hibernate.hibernate-entitymanager 5.4.23.Final
- jakarta.xml.bind.jakarta.xml.bind-api 2.3.2

We also want a driver to connect to a database. We will use MS SQL:
- com.microsoft.sqlserver.mssql-jdbc 9.4.0.jre8


# Connection properties: persistence.xml
This xml will hold properties that set up the persistence unit

1) Create folder META-INF in path: src\main\java\resources
2) Create persistence.xml file
3) Configure connection settings in the xml file

Then we want to setup our EntityManager that will handle the connection
- EntityManagerProducer has an example of this. We are able to override the properties of the persistence.xml file if we wish