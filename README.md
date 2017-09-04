{\rtf1\ansi\ansicpg1252\cocoartf1404\cocoasubrtf470
{\fonttbl\f0\fswiss\fcharset0 Helvetica;\f1\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red63\green63\blue63;\red249\green249\blue249;\red63\green63\blue63;
\red249\green249\blue249;}
\margl1440\margr1440\vieww28300\viewh17700\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 Instructions to run the first program:\
\
1) Extract the content of 
\f1\fs22 \CocoaLigature0 sixt-assignment1.zip file. You will see a folder named "sixt-assignment1".\
\
2) The folder contains sixt-assignment1.jar file and src/ folder\
 \
3) src/ folder contains all the source code and unit test cases. junit-4.12 library has been used to run the test cases. The file and class names are self-explanatory.\
\
Example output:\
\
\pard\tx560\tx1120\tx1680\tx2240\tx2800\tx3360\tx3920\tx4480\tx5040\tx5600\tx6160\tx6720\pardirnatural\partightenfactor0
\cf0 Command: java -jar sixt-assignment1.jar anagram nagaram\
Output: true\
\
Command: java -jar sixt-assignment1.jar anagram nagarama\
Output: false\
\
\
================================================================\
\
Instructions to run the second program:\
\
1) 
\f0\fs24 \CocoaLigature1 Extract the content of 
\f1\fs22 \CocoaLigature0 sixt-assignment2.zip file. You will see a folder named "sixt-interview".\
\
2) The folder will contain sixt-assignment-2.war file, pom.xml and src/ folder, containing all the source code and unit test cases.\
\
3) I have build the solution as a maven based, spring boot application. The rest api endpoints are as follows:\
\
a) (POST) 
\f0\fs24 \cf2 \cb3 \expnd0\expndtw0\kerning0
\CocoaLigature1 \outl0\strokewidth0 \strokec2 http://localhost:8080/\cf4 \cb5 \outl0\strokewidth0 sixt-assignment-2/\cf2 \cb3 \outl0\strokewidth0 \strokec2 vulnerability-scripts    (This will add a script with given script id and dependencies)\
\
       Sample Request Body:\
\
     \{\
	"scriptId": 3,\
	"dependencies" : [1, 2]\
     \}	\
\
b) 
\f1\fs22 \cf0 \cb1 \kerning1\expnd0\expndtw0 \CocoaLigature0 \outl0\strokewidth0 (GET) 
\f0\fs24 \cf4 \cb5 \expnd0\expndtw0\kerning0
\CocoaLigature1 http://localhost:8080/sixt-assignment-2//vulnerability-scripts  (This will fetch all the scripts stored in database)\
\
c) 
\f1\fs22 \cf0 \cb1 \kerning1\expnd0\expndtw0 \CocoaLigature0 (GET) 
\f0\fs24 \cf2 \cb3 \expnd0\expndtw0\kerning0
\CocoaLigature1 \outl0\strokewidth0 \strokec2 http://localhost:8080/sixt-assignment-2/vulnerability-scripts/4 (This will fetch the script with id 4)\
\
d) (GET)  http://localhost:8080/sixt-assignment-2/execution-plan\
\
     This will give the the execution plan to run all the scripts stored in the db.\
\
     Sample output:\
\
     \{\
    	"executionOrder": [\
        		4,\
        		3,\
       		2,\
        		1\
   	 ]\
     \}\
\
   If it is not possible to find such execution plan (due to circular dependency among the scripts), this api will throw an exception with proper error message.\
\
\pard\tx560\tx1120\tx1680\tx2240\tx2800\tx3360\tx3920\tx4480\tx5040\tx5600\tx6160\tx6720\pardirnatural\partightenfactor0
\cf4 \cb5 \outl0\strokewidth0 e) 
\f1\fs22 \cf0 \cb1 \kerning1\expnd0\expndtw0 \CocoaLigature0 (DELETE) 
\f0\fs24 \cf4 \cb5 \expnd0\expndtw0\kerning0
\CocoaLigature1 http://localhost:8080/sixt-assignment-2//vulnerability-scripts  (This will delete all the scripts stored in database)\
\
f) 
\f1\fs22 \cf0 \cb1 \kerning1\expnd0\expndtw0 \CocoaLigature0 (DELETE) 
\f0\fs24 \cf4 \cb5 \expnd0\expndtw0\kerning0
\CocoaLigature1 http://localhost:8080/sixt-assignment-2/vulnerability-scripts/4 (This will delete the script with id 4)\
\
4) Mongo database has been used to store the scripts. It should be running on the default port 27017.\
\
5) The code follows proper MVC architecture with separator directories for controllers, services, models. The classes and the test cases are self-explanatory.\
\
6) The 
\f1\fs22 \cf0 \cb1 \kerning1\expnd0\expndtw0 \CocoaLigature0 sixt-assignment-2.war file can be deployed to a server (e.g. Tomcat server) in order to use the above-mentioned APIs.
\f0\fs24 \cf4 \cb5 \expnd0\expndtw0\kerning0
\CocoaLigature1 \
\pard\tx560\tx1120\tx1680\tx2240\tx2800\tx3360\tx3920\tx4480\tx5040\tx5600\tx6160\tx6720\pardirnatural\partightenfactor0
\cf2 \cb3 \outl0\strokewidth0 \strokec2 \
\

\f1\fs22 \cf0 \cb1 \kerning1\expnd0\expndtw0 \CocoaLigature0 \outl0\strokewidth0 \
}