                                                                SCALABLE TRACKING NUMBER GENERATOR API
                                                                ======================================

          
Setup instructions

 MonogDB DB
 ==========

 1) Download and install MongoDB (version 7.x or higher) and and MongoDB compass  into the local system.

 2) Launch MongoDB compass and make a local connection and test the connection.

 3) Add a Database name : parcelservice and a collection : parcel to this database using compass.

 Spring boot Application setup and launch
 =======================================
 
 1) Download / Checkout the project trackingnumgenerator from my Github repository  https://github.com/rajurc/qwetzal/
 
 2) Import / Open this in any IDE like IntelliJ Idea or Eclipse.
 
 3) Start the application by running the Spring boot bootstrap/main class from the IDE.
 
 4) The output console shows application launched and started successfully.

Testing REST API
=================
 
1) Download ,Install and setup (register or sign in ) Postman app  in the local system
 
2) Create a collection and add a request under it in Postman.

3) Test the REST  API as shown in the screenshot for GET request. Screenshots of REST API and Mongo collection during my test in local environment is attached for reference.

Notes:
=====

1) Currently, getter and setter not working properly using Lombok library in my IntelliJ IDE. So getter and setter methods added to the Entity / Model class explicitily to make the application running and working

2) Logic to generate the unique 16 digit Tracking number matching the regular expression is implemented in the Service layer.

3) The JSON reponse is partially or fully returning the fields based on the passed request parameter to the request. Tracking number and ObjectId are always returned irrespective of the number of request params passed.
In this JSON response, the created timestamp is not explicitily implemented i.e during the generation of tracking number. We can set a instant timestamp and add a field to map this timestamp created in the Model class and set that and return in the Response. As of now , if we pass created_at in the Req param, that is returned. Likewise if we pass other params , those params are returned in the response. Please check the API screenshot attached / added to this repository as a .rar file.

4) This API supports / accepts zero or more than one request paramater. The controller request mapping method is coded in such a way.

Deployment
==========

This app is not deployed to any free cloud currently. We can write a Dockerfile and docker compose to build and  deploy to the target cloud location.
So the API is not available publicly to test. Please test by running the app in local and test using any API tools like Postman.

Performance and Scalability
===========================

1) Efficiency & concurrency:  Since the application is in spring boot and deploying as a docker image to any cloud platform, we can support high performance application with multiple concurrent requests support.
Also, since we use Mongodb, the application supports good performance.

2) Scalability: Since we use Mongodb, the application can scale horizontally. MongoDb supports sharding of the instances and scale horizontally.


Deliverables
============

Source code with README.md file and necessary screenshots are provided.
