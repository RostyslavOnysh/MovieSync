#  :shipit: Movie-Sync Project

## Project Description 🚀
- [Description](#description)
- [Project Overview](#project-overview)
- [Requirements](#requirements)
- [How to Install](#how-to-install)
- [Configuration](#configuration)
- [SOLID Principles](#solid-principles)
- [Contact](#contact)
- [License](#license)

## Description
This project showcases a Spring-based web application that focuses on user authentication, authorization, and data management. It employs Spring Security for user authentication and access control, Hibernate for database management, and includes features like email validation and password matching.

## Project Overview
The project includes the following key components and features:
- User registration and login using Spring Security.
- Email validation and password matching.
- Use of Data Transfer Objects (DTOs) for data exchange between layers.
- Data Access Object (DAO) interfaces and implementations for data persistence.
- Integration of Hibernate for ORM and database management.
- Implementation of SOLID principles for maintainable and scalable code.
- Detailed README.md providing project setup, installation, and configuration instructions.

## Requirements
Before starting work on the project, make sure you have the following components installed:

- 🔺 Java Development Kit (JDK) version 11 or higher.
- 🔺 Maven (4.0.0): Tool for project building and dependency management.
- 🔺 Git
- 🔺 MySQL: Database used for data storage.
- 🔺 Properly configured pom.xml file containing the following dependencies :
* spring-context
* spring-orm
* spring-webmvc
* commons-dbcp2
* hibernate-core
* hibernate-java8
* mysql-connector-java
* javax.servlet-api
* jackson-databind
* jackson-datatype-jsr310
* hibernate-validator
* spring-security-core
* spring-security-config
* spring-security-web

```xml
<dependencies>
      <dependency>
          <groupId>org.springframework</groupId>
          <artifactId>spring-context</artifactId>
          <version>${spring.version}</version>
      </dependency>
      <dependency>
          <groupId>org.springframework</groupId>
          <artifactId>spring-orm</artifactId>
          <version>${spring.version}</version>
      </dependency>
      <dependency>
          <groupId>org.springframework</groupId>
          <artifactId>spring-webmvc</artifactId>
          <version>${spring.version}</version>
      </dependency>
      <dependency>
          <groupId>org.apache.commons</groupId>
          <artifactId>commons-dbcp2</artifactId>
          <version>2.8.0</version>
      </dependency>
      <dependency>
          <groupId>org.hibernate</groupId>
          <artifactId>hibernate-core</artifactId>
          <version>${hibernate.version}</version>
      </dependency>
      <dependency>
          <groupId>org.hibernate</groupId>
          <artifactId>hibernate-java8</artifactId>
          <version>${hibernate.version}</version>
      </dependency>
      <dependency>
          <groupId>mysql</groupId>
          <artifactId>mysql-connector-java</artifactId>
          <version>8.0.22</version>
      </dependency>
      <dependency>
          <groupId>javax.servlet</groupId>
          <artifactId>javax.servlet-api</artifactId>
          <version>4.0.1</version>
          <scope>provided</scope>
      </dependency>
      <dependency>
          <groupId>junit</groupId>
          <artifactId>junit</artifactId>
          <version>4.12</version>
          <scope>compile</scope>
      </dependency>
      <dependency>
          <groupId>com.fasterxml.jackson.core</groupId>
          <artifactId>jackson-databind</artifactId>
          <version>2.14.1</version>
      </dependency>
      <dependency>
          <groupId>com.fasterxml.jackson.datatype</groupId>
          <artifactId>jackson-datatype-jsr310</artifactId>
          <version>2.13.0</version>
      </dependency>
      <dependency>
          <groupId>org.hibernate</groupId>
          <artifactId>hibernate-validator</artifactId>
          <version>6.1.6.Final</version>
      </dependency>
      <dependency>
          <groupId>org.springframework.security</groupId>
          <artifactId>spring-security-core</artifactId>
          <version>5.5.0</version>
      </dependency>

      <dependency>
          <groupId>org.springframework.security</groupId>
          <artifactId>spring-security-config</artifactId>
          <version>5.5.0</version>
      </dependency>

      <dependency>
          <groupId>org.springframework.security</groupId>
          <artifactId>spring-security-web</artifactId>
          <version>5.5.0</version>
      </dependency>

  </dependencies>
```

### For the detailed pom.xml file, you can find it in the project folder 📕.

## How to Install
Follow these steps to install and run the project:
1. Clone the repository:
   ```shell
   git clone git@github.com:RostyslavOnysh/MovieSync.git
   

# Connection class 📡
db.properties To use the program correctly, you must replace the fields in the db.properties file::
```bash
#MYSQL
db.driver=com.mysql.cj.jdbc.Driver
db.url=jdbc:mysql:YOUR_DB_ADDRESS
db.user=USERNAME
db.password=PASSWORD

# Hibernate properties
hibernate.show_sql=true
hibernate.hbm2ddl.auto=create
hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```
 
# Configuration :

The project is configured with 
- Spring
- Spring Security 
- Hibernate 
- and other dependencies. The ***pom.xml*** file contains detailed configurations for these dependencies.
 #  Email and Password Validation 🔧

The project includes email validation and password matching. For email validation, a custom annotation @Email is used, and for password matching, @MatchPassword annotation is used. Details can be found in respective classes.

# EmailValidator 🔨

The EmailValidator class is used for email validation. The @Email annotation is used to mark methods that accept email addresses. The validate() method is used for email address validation.

# PasswordMatcher ✒️

The PasswordMatcher class is used for password matching. The @MatchPassword annotation is used to mark methods that accept passwords. The matches() method is used for comparing two passwords.



# SOLID Principles

The project adheres to SOLID principles to ensure maintainable and scalable code. It includes appropriate separation of concerns, interfaces, and dependency injection to promote modularity and flexibility.

# Contact ♨️

Feel free to contact the author for any questions or feedback:

Author: [Rostyslav]
Email: [rospsix@gmail.com]
# License ☑️
This project is distributed under the MIT License. Feel free to modify and adapt it to your needs.
