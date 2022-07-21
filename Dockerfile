FROM openjdk:8
ADD target/mysql-employee.jar mysql-employee.jar
ENTRYPOINT ["java","-jar","mysql-employee.jar"]