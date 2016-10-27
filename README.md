# notesJava

This project(notesDemoJava) uses Spring, Spring MVC, Hibernate, Jackson and MySql to build a RESTful API, following is the process. Spring is a powerful J2EE framework to build web application. Spring MVC is useful to provide a RESTful API.

The design process is from database to classes and from classes to controller.

From the document of new-hire-coding-chanllenge-java.docx, one user can have many notes and note access should be restricted the owner of the note.

For that case, I have my database design method. I design two tables in the database, user and note. The table note has one foreign key uid to reference table user. The relationship bewteen note and user is many-to-one.

From the database design, There are two classes in this project, note.java and user.java in notesDemoJava. many-to-one relationship is declared in the Note.hbm.xml. notesDemoJava provides CRUD operation for notes.

Following is the process:

1. add jar files for Spring, Spring MVC, Hivernate, Jackson and MySql.

2. Integrate Spring with Hibernate, 
	test spring manage session and transaction.

3. Integrate Spring with Spring MVC, both of them can provide IOC container, remove duplicate beans instance.
   Spring MVC for annotation @Controller
   Spring for annotation exclude @Controller
   test
   
4. Integrate Spring MVC with Jackson to provide RESTful Json response.
   useing annotation @ResponseBody and @RequestMapping
   test
	
5. Build POJO files for note and user, and add hibernate configuration files.
   add validation in POJO class by annotation
   
6. Build many-to-one relationship for note and user

7. Complete CRUD operation for notes, note is restricted by user
   Postman test CRUD operation, support JSON for requests and responses.
   
8. Demonstration:
   GET 		http://localhost:8080/notesDemoJava/notes
   GET 		http://localhost:8080/notesDemoJava/notes/{id}
   DELETE 	http://localhost:8080/notesDemoJava/notes/{id}
   PUT 		http://localhost:8080/notesDemoJava/notes{id}
   POST 	http://localhost:8080/notesDemoJava/notes
	
9. Hibernate is a ORM framework to manage object and table in database.
   Spring framework use many design pattern like sigleton, factory, dynamic proxy

10.TODO
   add basic HTTP Authentication / JJWT token 
   
	
	
	
	
	

	
	
	
	
	


	
