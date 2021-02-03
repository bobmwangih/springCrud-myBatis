# springCrud-myBatis
This web application demonstrates the Integration of Spring MVC and Mybatis connecting to a MySQL database and demonstrates the database operations such as Create, Read, Update and Delete.
## Requirements

1. Java - 1.8 +

2. Maven 

3. Mysql 

4. Tomcat server 7.0 +

## Steps to Setup

**1. Clone the application**

`git clone https://github.com/bobmwangih/springCrud-myBatis.git`

**2. Create Mysql database**

`create database springMVCmybatis`

**3. Run the following sql command to initialize your table in the db**

` 	

	USE springMVCmybatis;

	CREATE TABLE employee (
	
	id int not null primary key auto_increment,
 	
    	name varchar(50) not null,
 
    	email varchar(50) not null,
 
    	gender varchar(50) not null,
  
    	address varchar(50) not null
	); 

`

**4. Change mysql username and password as per your installation**

+ open `src/main/java/myBatisResources/myBatis-config.xml`

+ change `username` and `password` as per your mysql installation

**5. Build and run the app on a tomcat server**

The app will start running at <http://localhost:8080/springMVC-myBatis/>.

## Cheers!

