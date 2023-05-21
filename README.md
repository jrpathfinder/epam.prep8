# [JGMP-CEE Q4 2022 - Q1 2023] Spring Boot, REST-API

Description
Please, complete the following task.
 

1.  Download Java SE Development Kit 8 according to your OS and processor’s architecture.

2. Install Java Development Kit according to JDK installation instructions (see also PATH and CLASSPATH).

3. Download Apache Maven 3.6.0 according to your OS and processor’s architecture.

4. Install Apache Maven according to installation instructions.

5. Create maven project with 4 modules:

event-service-api;
event-service-dto; 
event-service-impl; 
event-service-rest.
6. event-service-dto module should contain Event class with following fields:

id;
title;
place;
speaker;
eventType;
dateTime.
7. event-service-api module should contain EventService interface with following methods:

createEvent(…);
updateEvent(…);
getEvent(…); * deleteEvent();
getAllEvents();
getAllEventsByTitle(…).
8. event-service-impl module should contain EventServiceImpl which implements EventService interface and responds with list of Events.

Note: feel free to use any database (filesystem, any db, in memory storage).

9. event-service-rest module should contain EventServiceController which provides REST API interface according to 2nd or 3rd level of REST API maturity and responds with list of Events.

10. Document methods in EventServiceController using Swagger 2 annotations.

11. Implement Application class with @SpringBootApplication annotation and main method.

12. Create runnable Spring Boot JAR with dependencies using spring-boot-maven-plugin.

13. Run event-service jar using SpringBoot and Analyse REST API with Swagger UI.

14. Provide sample requests to EventService, demonstrate it’s work using Swagger UI.

Note: implement REST APIs according to all Richardson Maturity Level as additional task.
