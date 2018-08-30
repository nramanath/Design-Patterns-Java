# Proxy Design Pattern

## Introduction

- Proxy means "in place of" or "on behalf of" in the literal meaning
- A design pattern that is used to create a place holder or surrogate for another object in order to provide restricted or 
customised access. (control the access to the object)

## Types
There are different types of proxies

#### 1. Remote proxy
They are responsible for representing the object located remotely. Talking to the real object might involve marshalling 
and unmarshalling of data and talking to the remote object. All that logic is encapsulated in these proxies and the client 
application need not worry about them.

#### 2. Virtual proxy
These proxies will provide some default and instant results if the real object is supposed to take some time to produce
results. These proxies initiate the operation on real objects and provide a default result to the application. Once the
real object is done, these proxies push the actual data to the client where it has provided dummy data earlier.

#### 3. Protection proxy
If an application does not have access to some resource then such proxies will talk to the objects in applications that 
have access to that resource and then get the result back.

#### 4. Smart proxy
A smart proxy provides additional layer of security by interposing specific actions when the object is accessed. An example 
can be to check if the real object is locked before it is accessed to ensure that no other object can change it.

## Benefits
- One of the advantages of Proxy pattern is security.
- This pattern avoids duplication of objects which might be huge size and memory intensive. This in turn increases the 
performance of the application.
- The remote proxy also ensures about security by installing the local code proxy (stub) in the client machine and then 
accessing the server with help of the remote code.

## Drawbacks
- If the actual class is directly accessed instead of the proxy layer class, then it creates
disparate behaviour of the application

## Code Example
In this code example, we have created a class which is used to execute system commands.
This usually possess a security threat, since the user can run commands like 'rm' commands.
In order to create a security restriction we create a class on top of this original class and 
control the access of this class.
Steps in creating a proxy pattern:  
1. An interface is created by the name *CommandExecutor* with the function *executeCommand*
2. First implementation is the actual implementation of the interface with any controls or restrictions. 
This class is *CommandExecutorImpl*
3. The next class is the proxy class which again implements the same interface and this class is
*CommandExecutorProxy*. This class holds an object of the interface object and this is initialized with
the actual implementation *CommandExecutorImpl* 
4. The restrictions is set up as needed like security or smartness to the code logic and based on it
we call the corresponding actual implementation of the class as needed. 
5. In our case, if the user is not admin and if the user is trying to execute restricted commands, then 
prevent access to it. 

## References
1. https://www.journaldev.com/1572/proxy-design-pattern
2. https://www.geeksforgeeks.org/proxy-design-pattern/