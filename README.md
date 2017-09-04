Instructions to run the first program:

1) Extract the content of sixt-assignment1.zip file. You will see a folder named "sixt-assignment1".

2) The folder contains sixt-assignment1.jar file and src/ folder
 
3) src/ folder contains all the source code and unit test cases. junit-4.12 library has been used to run the test cases. The file and class names are self-explanatory.

Example output:

Command: java -jar sixt-assignment1.jar anagram nagaram
Output: true

Command: java -jar sixt-assignment1.jar anagram nagarama
Output: false


================================================================

Instructions to run the second program:

1) Extract the content of sixt-assignment2.zip file. You will see a folder named "sixt-interview".

2) The folder will contain sixt-assignment-2.war file, pom.xml and src/ folder, containing all the source code and unit test cases.

3) I have build the solution as a maven based, spring boot application. The rest api endpoints are as follows:

a) (POST) http://localhost:8080/sixt-assignment-2/vulnerability-scripts    (This will add a script with given script id and dependencies)

       Sample Request Body:

     {
	"scriptId": 3,
	"dependencies" : [1, 2]
     }	

b) (GET) http://localhost:8080/sixt-assignment-2//vulnerability-scripts  (This will fetch all the scripts stored in database)

c) (GET) http://localhost:8080/sixt-assignment-2/vulnerability-scripts/4 (This will fetch the script with id 4)

d) (GET)  http://localhost:8080/sixt-assignment-2/execution-plan

     This will give the the execution plan to run all the scripts stored in the db.

     Sample output:

     {
    	"executionOrder": [
        		4,
        		3,
       		2,
        		1
   	 ]
     }

   If it is not possible to find such execution plan (due to circular dependency among the scripts), this api will throw an exception with proper error message.

e) (DELETE) http://localhost:8080/sixt-assignment-2//vulnerability-scripts  (This will delete all the scripts stored in database)

f) (DELETE) http://localhost:8080/sixt-assignment-2/vulnerability-scripts/4 (This will delete the script with id 4)

4) Mongo database has been used to store the scripts. It should be running on the default port 27017.

5) The code follows proper MVC architecture with separator directories for controllers, services, models. The classes and the test cases are self-explanatory.

6) The sixt-assignment-2.war file can be deployed to a server (e.g. Tomcat server) in order to use the above-mentioned APIs.




