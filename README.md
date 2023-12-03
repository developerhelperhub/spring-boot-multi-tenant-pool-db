# Multi-Tenant DB Pool Pattern Spring Boot Integration

This project helps us how can we implement the multi-tenant DB pool design pattern with spring boot. 

#Initial DB Script

We have to execute the below script in the DB first before running the application

src/main/resources/init-db-script.sql

#Curl Command 
curl --location 'http://localhost:8080/person/list' \
--header 'TenantId: B'


###Reference Multi-Tenant pool example 

https://spring.io/guides/gs/accessing-data-jpa/

https://spring.io/blog/2022/07/31/how-to-integrate-hibernates-multitenant-feature-with-spring-data-jpa-in-a-spring-boot-application

https://dotnettutorials.net/lesson/spring-boot-interceptor/

https://www.baeldung.com/spring-extract-custom-header-request

