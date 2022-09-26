# Programmer's Friend Log Binding for SLF4J

The Programmer's Friend (PF) libraries are all logging against their own logging API provided by component *pf-logging*.  
That has the advantage of not having a fixed dependency to any of the multiple logging frameworks in the Java world.

However, when using PF libraries in any application, the logging of the PF libraries should be routed to loggers of the
logging framework the application is using.

Therefore PF provides binding libraries for the most prominent logging frameworks.

This component is providing the binding to the [Simple Logging Facade for Java (SLF4J)](http://www.slf4j.org/).  
It is compiled with **Java 6**.

## Usage

In order to route all PF logging to _slf4j_, put _pf-logbind-slf4j-x.x.x.jar_ on the classpath and activate it with
the following system property:

> -Dorg.pfsw.logging.binding=SLF4J

Alternatively you can activate the log binding programmatically by executing (very early at startup!) the following:

```java
org.pfsw.logging.LoggerFactoryProvider.setDefaultFactoryName("SLF4J")
```

## Dependency Management

You can find this library in *Programmer's Friend* maven repository ``http://pfsw.org/maven/repo/``
or on *jcenter*.

The library itself has _runtime_ dependencies to **org.pfsw:pf-logging:3.1.0** and **org.slf4j:slf4j-api:1.17.30**.


Include the library into your project:

**Gradle:**

```
runtime group: 'org.pfsw', name: 'pf-logbind-slf4j', version: '1.1.0'
```

**Maven:**

```
<dependency>
    <groupId>org.pfsw</groupId>
    <artifactId>pf-logbind-slf4j</artifactId>
    <version>1.1.0</version>
    <scope>runtime</scope>
</dependency>
```


## Build

The library can be build with its associated gradle wrapper:

``./gradlew clean build``

