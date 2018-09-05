# Facade Design Pattern

## Introduction
- The basic notion here is to provide a unified interface for a set of interfaces in the sub system.
- As the name suggests, it means the face of the building. The people walking past the road can only see this glass face 
of the building. They do not know anything about it, the wiring, the pipes and other complexities.
- Its purpose is to hide internal complexity behind a single interface that appears simple on the outside

## Code Example
In this code example we have created two classes namely _MySQLHelper_ and _MongoDBHelper_ which are used to generate two types 
of reports (HTML and PDF) based on the table / collection name that is passed as the parameter. Now in order to use this, the 
client needs to create the connection of the database type and then pass this connection and the table name or collection name 
to the corresponding function to generate HTML or PDf report. These are shown in the first two tests _testMySQLHelper_ and _testMongoDBHelper_.
So, in order to hide the complexity, we create the helper facade class _DatabaseFacadeHelper_ which has the enum values of the type of database and the 
type of the report to be generated, and also receives the table name or collection name. 
This way the client needs to directly call this function and mention which database, the report type and the name of the table or
collection for which the report needs to be generated thus hiding all the complexity of the code behind the scenes.

## Benefits
1. We can use the facade pattern to collate all the complex method calls and related code blocks and channelizes it through one single Facade class.
In this way with respect to client there is only one single call. 
2. It makes easier to use and maintain creating a more structured environment and reduces dependencies between libraries or other packages.

## Drawbacks
One of the drawback is that the subsystem methods are connected to the Facade layer. If the structure of the subsystem 
changes then it will require subsequent change to the Facade layer and client methods.

## Note:
Facade pattern might be confused with mediator pattern. Mediator also abstracts the functionality of the subsystem in similar manner to facade.
However there is a subtle difference between both these patterns. In case of Mediator pattern the subsystem is aware of the mediator, however 
in case of Facade the subsystem does not know anything about the facade. It’s a one way communication from Facade to subsystem.
   
## References
1. https://www.journaldev.com/1557/facade-design-pattern-in-java
2. https://www.geeksforgeeks.org/facade-design-pattern-introduction/
3. https://dzone.com/articles/fa%C3%A7ade-design-pattern-%E2%80%93-design