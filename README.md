Demo project for Docker Springboot MySQLDB

1)create image using below docker command where "Dockerfile" exists. Check the image name from docker-compose.yml file at line no. 15
docker build -t springboot-mysql-employee-app .

2)list images using below docker command
docker images

3)run docker-compose.yml file where "docker-compose.yml" exists
docker-compose up

Important point:
check the finalName attribute in pom.xml for final jar name.
check then Dockerfile through which image will get create using above step 1.
