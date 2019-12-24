# Hibernate One to One Mapping Example with Spring Boot and JPA




## Setup the Application

1. Create a database named `hibernate_one_to_one_demo`.

2. Open `src/main/resources/application.properties` and change `spring.datasource.username` and `spring.datasource.password` properties as per your MySQL installation.

3. Type `mvn spring-boot:run` from the root directory of the project to run the application.

## Explanation

One to One mapping can be achived by
 
1.Using foreign key.

For example:

        ##(Bi-Directional)
        
 In this example we use User and his corresponding Profile which is tightly coupled.
 
        User <-------------------------> UserProfile
        
 Make a property userProfile in user model with annotation @OneToOne(cascade All ) and also join the column of
      userProfile table id as a name of column and the referenced column name with the id of user table.

 Similarly in UserProfile model make a property User with annotation @OneToOne(mappedBy="userProfile").  

2.Using shared primary key.

