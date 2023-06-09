# JavaEE_BlaBlaCar
Project for carpulling with JakartaEE.

## Technologies
JakartaEE, JSP, HTML, CSS

## Getting Started
To start service you need Tomcat 9 installed

Than do following:
1. Clone this repository
2. Build war file: 
```
mvn clean install
```
3. Configure  your IDE to run war file on Tomcat server. How to do that? you can read [here](https://www.baeldung.com/tomcat-deploy-war#IntelliJ)


## Usage
There are several endpoints with different levels of access: 
1. Customer - can search different trips
2. Driver - can add trip to bd

## Paterns and technologies
To manage endpoints I use [front controller](https://www.oracle.com/java/technologies/front-controller.html) pattern.

Database is inmemory that save data in HashSet with usins Singletone pattern. To access to db I use DAO pattern. Finally, to make pages dynamic I use JSP technology


