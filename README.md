# Employee-Management-Application

> The Employee Management System is a web-based application developed using Spring Boot for the backend and HTML, CSS, and JavaScript or Thymeleaf for the frontend. This project is designed to simplify and automate the management of employee records, providing functionalities for creating, reading, updating, and deleting employee data.
> The application was developed at [GUVI](https://www.guvi.in/) as part of the Java Full Stack Developer Course.

# 👉 [Click here](https://drive.google.com/file/d/14_vaHVXKEqLB42BHz-0Q6GLuqAHvFDbR/view?usp=sharing) to go through detail explanation of this application

# Features

- Add New Employee: Create and save employee details such as name, email, job title, and department.
- View Employee List: Display all employees with their details in a structured table format.
- Update Employee Details: Edit and update the information of an existing employee.
- Delete Employee Record: Remove employee records as needed.

# Technology used 

- Java
- MySQL
- Spring Boot
- Spring data JPA
- Spring Validation
- thymleaf
- RESTful api
- Hibernate
- Swagger
- Lombok
- Maven
- Postman
- GitHub

# Overview of Our work

## **Swagger Module** 
![Swagger Module*](https://github.com/pranav13vishal/Employee-Management-Application/blob/38f7508e9c3ef5b621e83a9e5707bcf6bd368974/assets/swagger.png)

## **User Module**
*Employee details can be used for CRED operations*
</br>
![User Module](https://github.com/pranav13vishal/Employee-Management-Application/blob/38f7508e9c3ef5b621e83a9e5707bcf6bd368974/assets/user.png)

# How To Run Our Project In Your Machine

1. Clone our Project into your system
    - Go to the folder location you want to clone
    - Open terminal 
    - Run command ``` git clone https://github.com/pranav13vishal/Employee-Management-Application.git ```
2. Open your preferred Integrated Development Environment (IDE) such as Spring Tool Suite (STS) or IntelliJ IDEA.
3. Import the cloned project into your IDE:
   - In IntelliJ IDEA, click on "File" in the top menu, then select "Open"
4. Select the project directory where you cloned the repository and click "OK" or "Open" to import the project.
5. You can run this project with MySQL db 
    -Update the username and password as per your local database config.
```
    spring.datasource.url=jdbc:mysql://localhost:3306/YOUR_DATABASE_NAME
    spring.datasource.username=YOUR_DATABASE_USERNAME
    spring.datasource.password=YOUR_DATABASE_PASSWORD
```
6. Build the project and run 
7. To access database
    - For MySQL, you can use ```MySQL Workbench``` as shown in explanation video
8. Open Swagger UI ```http://localhost:8080/swagger-ui/#/``` and execute the end points as in explanation video
    - comment all the clases under the controller
9. To view the thymleaf pages run the application and go to ```http://localhost:8080/``` 
    - comment all the clases under the controllerRestApi       

# THANK YOU EVERYONE FOR VISITING OUR PROJECT




