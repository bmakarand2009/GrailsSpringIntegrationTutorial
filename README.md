GrailsSpringIntegrationTutorial
===============================

Grails SpringIntegration HelloWorld 

This is a simple Spring Integration HelloWorld Tutorial, Important Files to look are

grails-app/conf/spring/resource.xml -- this is where all the Spring SI channels and beans are defined

HelloWorldIf.java - this file defines the Gateway which acts as a Starting point of the Spring SI call

Understanding Summary

Step1. HeloWorldIf.java interface creates a bean based on it as defined in resources.xml, 
Step2: the gateway then passes the request to input channel
Step3: Service activator picks the request from input channel, invokes the HelloWorlSerivce.sayHello() on it and gives to Output Channel
Step4: In the Controller,we recieve the output from the Output channel.


Configuration Needed for Spring SI

1. Dependancies
I have added the dependancy jars in the lib folder, mainly spring-integration-core.jar(add the verison u want)
or 
you can define in it BuildConfig.grooy, somehow my IDE was not identifying the jars eventhough they were getting downloaded, hence went with the first approach


2. RESOURCES.XML
Define all your Spring SI configuration, channels, endpoints, gateway etc in resources.xml

3. use the annotations and define the java interface in case u plan to use the Gateway

4. Access the channels and beans. Checkout Helloworld controller if you need some reference
