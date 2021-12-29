
## Summative 1 Assessment - Spring Boot and REST

In this assessment, you will build a simple REST web service. It will provide quote-of-the-day, word-of-the-day, and magic 8-ball services. In addition, you will produce a 1-3 minute video summary of the project. The requirements and features are detailed below. 

## Structure

Your solution must have the following structural elements:

- Your solution must be in an IntelliJ project called `Summative-1-Lastname-Firstname`.
- Your project must be built using Spring Boot and Spring MVC. Initialize your project using `start.spring.io`.
- Your project must have a series of tests using MockMvc.
- Your project must have an in-memory DAO that follows the pattern demonstrated previously in this module.
- Your REST API must accept and return data in JSON format where appropriate.
- Your REST API must be documented with Swagger. Save the `.yaml` file in the root of your project directory.


## Requirements and Features

This web service is a quote-of-the-day, word-of-the-day, and magic 8-ball service. You must implement and document the following REST APIs:

- Quote API:
  - URI: /quote
  - Method: GET
  - Request Body: None
  - Response Body: Quote

- Quote Object instance variables:
  - id
  - author
  - quote

- Word API
  - URI: /word
  - Method: GET
  - Request Body: None
  - Response Body: Definition

- Definition Object instance variables:
  - id
  - word
  - definition

- Magic 8-ball API:
  - URI: /magic
  - Method: POST
  - Request Body: Question
  - Response Body: Answer

- Answer Object instance variables:
  - id
  - question
  - answer


### Additional Requirements

- Your service must contain at least 10 quotes. Quotes must be served up at random.
- Your service must contain at least 10 words and their corresponding definitions. Words and definitions must be served up at random.
- Your service must contain at least 6 different magic 8-ball responses. 8-ball answers must be served up at random.
    - The POST request for the magic 8-ball endpoint should include a user-provided question.
    > Note: The students are not being asked to provide Entity/Model validations or validation responses in this summative. This means that
    > it is possible to submit the magic 8-Ball POST request without a question and a response will still be returned.

## Video Summary Requirement

- Create a 1-3 minute video summary highlighting your project. Be sure to highlight the sections of the project that are important
in meeting the project requirements. Be sure to provide the following video requirements:
    * Video should be created in MP4 format.
    * Video should include a screen capture recording to display the important sections of the project.


## Submission
Once you have your summative assessment, follow the submission steps listed below: 



### **General set up and format requirements: 10%**

1. Your solution must reside in an IntelliJ project called `Summative-1-Assessment-Lastname-Firstname`.
2. The project must be built using Spring Boot and Spring MVC. Initialize your project using start.spring.io.
3. The project must have an in-memory DAO that follows the pattern shown in this module.
4. The REST API must accept and return data in JSON format where appropriate.
5. The REST API must be documented with Swagger. Save the .yaml file in the root of your project directory.
6. Provide a 1-3 minute Video Summary of the project.


### **Quote API Code: 30%**

1. Code is clean. (Follows general patterns as presented in class.)
1. Quote API:

    - URI: /quote
    - Method: GET
    - Request Body: None
    - Response Body: Quote

1. Quote Object instance variables:
     - id
     - author
     - quote

1. Your service must contain at least 10 quotes.
1. Quotes must be served up at random.
1. Uses mockMvc to test Quote API.


### **Word API Code: 30%**

1. Code is clean. (Follows general patterns as presented in class.)

2. Word API:

    - URI: /quote
    - Method: GET
    - Request Body: None
    - Response Body: Definition

1. Definition Object instance variables:
     - id
     - word
     - definition

1. Your service must contain at least 10 words and their corresponding definition.
2. Words and definitions must be served up at random.
3. Uses mockMvc to test Word API.


### **Magic 8-Ball API Code: 30%**
1. Code is clean. (Follows general patterns as presented in class.)
2. Magic 8-ball API:

    - URI: /quote
    - Method: POST
    - Request Body: Question
    - Response Body: Answer

1. Answer Object instance variables:
     - id
     - question
     - answer

1. Your service must contain at least 6 different magic 8-ball responses.
2. 8-ball answers must be served up at random.
3. Uses mockMvc to test Magic 8-ball API.
4. This POST request should include a user-provided question
> Note: The students are not being asked to provide Entity/Model validations or validation responses in this summative. This means that
> it is possible to submit the magic 8-Ball POST request without a question and a response will still be returned.

---

© 2021 Trilogy Education Services, a 2U, Inc. brand. All Rights Reserved.
