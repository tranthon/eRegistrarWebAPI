# eRegistrarWebAPI
A Spring Web application, named "eRegistrarWebAPI", which is a RESTful WebAPI for your online Student Registration system for a University.

4 REST APIs endpoints:

http://localhost/eregistrar/api/student/list - Displays JSON array of Students data.
http://localhost/eregistrar/api/student/register - Register a new Student into the system
http://localhost/eregistrar/api/student/get/1 - Read/display a Student data for student with ID, 1.
http://localhost/eregistrar/api/student/get/1 - Retrieves and Updates Student data for student with ID, 1.
http://localhost/eregistrar/api/student/delete/3 - Delete the student data for student with ID, 3.
The specification for Student data, is as follows:

{

   studentId : (should be the primary key field)

   studentNumber: e.g. 000-61-0001 (required)

   FirstName: e.g. Anna (required)

   MiddleName: (optional)

   LastName: e.g. Smith (required)

   cgpa: e.g. 3.78 (optional)

   enrollmentDate: e.g. 2019-5-12 (required)

   isInternational: (values: "Yes", "No") (required) - Hint: Implement/present this data in a drop-down list or Radio button
