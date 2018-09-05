# Structural Design Patterns

## Introduction
Structural Design patterns provides the different patterns of creating class structures through inheritance (is-a relationship)
and composition (has-a relationship). Each design pattern is created for a specific purpose and they evolved over a period
of time in order to facilitate re-usability, impose security, enable smartness etc
 
## [Proxy Design Pattern](https://github.com/nramanath/Design-Patterns-Java/blob/master/src/main/java/designpatterns/structural/proxy/ProxyDesignPatternNotes.md)
Proxy pattern intent is to “Provide a surrogate or placeholder for another object to control access to it”. The definition 
itself is very clear and proxy pattern is used when we want to provide controlled access of a functionality.

## [Facade Design Pattern](https://github.com/nramanath/Design-Patterns-Java/blob/master/src/main/java/designpatterns/structural/facade/FacadeDesignPatternNotes.md)
The Facade design pattern intent is to abstract the complexity of the system especially when there are multiple interfaces
that are used to perform an operation. The basic notion here is to provide a unified interface for a set of interfaces in the sub system.
This way as the complexity of the interfaces in the sub systems increases, the client using these interfaces need not worry about 
the complexity since this is now being handled by a higher level wrapper interface which is the facade class.