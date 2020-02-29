# Read a json file and get a cheapest offer
In this case I have a json file. 
Firstly I could read the file and convert into a Java List.
Secondly I wrote a method in terms of Java 8 and the task was implemented by Java 8(getCheapestOfferByStream) and a test case was implemented too 
in this method(test_GetCheapestOfferByStream_ShouldBeOK) I tried to calculate the time of process that I would be able to compare by another way.
After that I wrote another method in terms of traditional that means without using java 8(getCheapestOfferByManual) and I tried to calculate the time of process too.
In fact I implemented this task with 2 ways.
Finally I realised that traditional way is faster than Java 8.
But the method in java 8 is clear and concise and maintaining this method is better than traditional method.

## the pre-requisites
* You have to install Java 8.
* You have to install Maven 3.

## Technologies: 
* Spring REST(use to write test method)
* Jackson(use to convert json to Object)
* Lombok (I use Lombok framework in this project. you do not need to write getter and setter method for each class.The project can be run in IDE but is better to install plugin of Lombok)  

### Run test methods:
```
Use "mvn clean package" to run the tests.
```

### Run in development envirenment:
To run the project with **spring-boot:run** in development environment.


### Run in production environment:
Use java -jar file with the below command:  
**java -jar -Dspring.profiles.active=prod jarName.jar**

## Task lists
You can use these following stack technology to make the application more enterprise:
- [ ] Spring Web
- [ ] Spring Data
- [ ] Spring Security
- [ ] Spring Cloud
- [ ] Spring Session
- [ ] Spring Oauth2
- [ ] Circuit breaker
- [ ] Spring Cache
- [ ] Spring for apache kafka
- [ ] Spring Integration
- [ ] Spring Batch
- [ ] Swagger