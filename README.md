Todo List Manager Web Application

A Java Spring Boot Backend Project

Steps to Run:
1) Download and extract the ZIP file, then open the project as a Maven project in Eclipse or IntelliJ IDEA.
2) Install and run Docker Desktop.
3) Open the command prompt and run the following command to launch MySQL using Docker:
   docker run --detach --env MYSQL_ROOT_PASSWORD=dummypassword --env MYSQL_USER=todos-user --env MYSQL_PASSWORD=dummytodos --env MYSQL_DATABASE=todos --name mysql --publish 3306:3306 mysql:8-oracle
4) Navigate to MyfirstwebappApplication.java and run it as a Java application.
5) Open your web browser and go to: http://localhost:8080/
6) Use the following credentials:
   Username: harshit
   Password: dummy
7) Explore the application!

   ![Image](https://github.com/user-attachments/assets/068295a8-5191-42de-9399-7e4100d8dce9)
