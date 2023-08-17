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

# Description 📁

This project showcases a Spring-based web application that provides a comprehensive solution for user authentication, authorization, and efficient data management within a secure environment. The primary goal of this project is to create a seamless user experience while ensuring the utmost security of user information and interactions.

# Key Features 🔑
* User Authentication and Authorization: The project employs Spring Security, a powerful framework, to implement robust user authentication and role-based authorization. This ensures that only authorized users can access specific parts of the application.
* Enhanced Data Validation: The application integrates email validation and password matching to ensure the accuracy of user-provided information during registration and password reset processes.
* Data Transfer Objects (DTOs): It utilizes Data Transfer Objects (DTOs) to efficiently exchange data between different layers of the application. This promotes encapsulation and minimizes unnecessary data exposure.
* Flexible Database Management: Hibernate, a widely-used ORM framework, is integrated for seamless database management. This allows developers to interact with the database using Java objects, making data manipulation and storage more intuitive.
* Maintainable Codebase: The project adheres to SOLID principles, emphasizing modularity, extensibility, and maintainability. Proper separation of concerns and dependency injection techniques are employed to create a clean and organized codebase.

# Project Overview  📖 📝
The project includes the following key components and features:
- User registration and login using Spring Security.
- Email validation and password matching.
- Use of Data Transfer Objects (DTOs) for data exchange between layers.
- Data Access Object (DAO) interfaces and implementations for data persistence.
- Integration of Hibernate for ORM and database management.
- Implementation of SOLID principles for maintainable and scalable code.
- Detailed README.md providing project setup, installation, and configuration instructions.

# Requirements  ⚠️
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
   ```
   

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
 
# Configuration : ⚠️

The project is configured with 
- Spring
- Spring Security 
- Hibernate 
- and other dependencies. The ***pom.xml*** file contains detailed configurations for these dependencies.
- 
 #  Email and Password Validation 🔧

The project includes email validation and password matching. For email validation, a custom annotation @Email is used, and for password matching, @MatchPassword annotation is used. Details can be found in respective classes.

# EmailValidator 🔨

The EmailValidator class is used for email validation. The @Email annotation is used to mark methods that accept email addresses. The validate() method is used for email address validation.

# PasswordMatcher ✒️

The PasswordMatcher class is used for password matching. The @MatchPassword annotation is used to mark methods that accept passwords. The matches() method is used for comparing two passwords.



# SOLID Principles ⚙️

The project adheres to SOLID principles to ensure maintainable and scalable code. It includes appropriate separation of concerns, interfaces, and dependency injection to promote modularity and flexibility.

# Contact ♨️📬

Feel free to contact the author for any questions or feedback:

- Author: [Rostyslav](https://www.linkedin.com/in/rostyslav-onyshchenko-7ab348281/)
- Email: [rospsix@gmail.com]
# License ☑️
This project is distributed under the MIT License. Feel free to modify and adapt it to your needs.


![8180a5694ee62b8f85d609bb4c044b5e.jpg](https://assets.leetcode.com/users/images/ae20d093-37e7-44b3-82d4-fcaabb24ad16_1692213827.025218.jpeg)
