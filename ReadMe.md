<h1 align="center"> Cucumber Selenium project to perform 4 tests- 2 features of SignIn and Registration  </h1> <br>

<p align="center">
  Description: This is a demo project on java tech for testing ace online shoe portal to perform 4 tests :2 related to SignIn Portal and 2 related to new user registration  
</p>


## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Requirements](#requirements)
- [Quick Start](#quick-start)


## Introduction

## Manual Verification:

perform GET API - validate response code and response body
GET
![img.png](img.png)

POST API- validate response code and response body - to update the status of the Task
POST:
![img_1.png](img_1.png)

POST API- validate response code and response body - to create a Task
PUT:
![img_3.png](img_3.png)

POST API - test executions of Zephyr
![img_5.png](img_5.png)




## Features
1. SignIn Validation: 
<br>  a. Validation to check if the text fields are present on SignIn anding Page
<br> b. Validation to check if the buttons are present on SignIn landing page
2. New User Registration: 
<br> a. Validation to check if the new user registration landing page is successful
<br> b. Validation to check if the new user registration process is successful

## Test Requirements
The tests need to be validated for the response code returned back as well as the response body


### Local
* [Java 11 SDK](https://www.oracle.com/au/java/technologies/javase/jdk11-archive-downloads.html)
* [Maven](https://maven.apache.org/download.cgi)
* [ChromeDriver](https://chromedriver.chromium.org/downloads)



## Execution modes ## 🤖 Starting up

mvn test - for running the test