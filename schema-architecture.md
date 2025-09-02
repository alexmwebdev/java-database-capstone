This Spring Boot application uses both MVC and REST controllers. Thymeleaf templates are used for the Admin and Doctor dashboards, while REST APIs serve all other modules. The application interacts with two databases

— MySQL (patient, doctor, appointment, and admin data)
— MongoDB (for prescriptions). 

All controllers route requests through a common service layer, which in turn delegates to the appropriate repositories. MySQL uses JPA entities while MongoDB uses document models.

1. User initiates a request through Thymeleaf (Admin or Doctor Dashboard) or Appointment or Patient RestAPIs

2. Spring Boot routes the request
   - MVC Controllers control the views in .html via Thymeleaf
   - REST Controllers handle HTTP API requests and provide response JSON

3. The controller invokes the appropriate Service Layer method  

4. The Service Layer calls the Repository Layer  

5. Repositories query data  

6. Data is bound to Java models  

7. Response is generated either in rendered HTML via Thymeleaf templates receiving models, or in JSON data via REST endpoints.