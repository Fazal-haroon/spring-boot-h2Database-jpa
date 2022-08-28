# spring-boot-h2Database-jpa-crud-application
Spring boot, H2 database, Hibernate Validation, Loggers(in Controller), Lombok, Exception Handling and JPA Repository
<br>
<br>
For testing you can use postman client or Insomnia client
<br>
H2 Database is in-memory database. Data save Temporory not permenant saved
<br>
JDBC URL: jdbc:h2:mem:databaseapp
<br>
Username: sa
<br>
Password: password
<br>
As shown in the screenshot attach below of Configuration file.
<br>
![image](https://user-images.githubusercontent.com/36573782/187084667-7b1fd116-e062-44c6-ae23-e5fedb0f7acb.png)
<br>
H2 Console URL: http://localhost:8082/h2-console
<br>
![image](https://user-images.githubusercontent.com/36573782/187084670-762869e8-dcdc-43d0-85a3-1047ae43afe1.png)
<br>
Create Department
<br>
![image](https://user-images.githubusercontent.com/36573782/187088977-ca5709ae-f77f-412f-8686-631696582230.png)
<br>
Fetch all Department
<br>
![image](https://user-images.githubusercontent.com/36573782/187088991-7f7bd38e-dfd8-42e9-94d2-bbcd19e7bbfa.png)
<br>
Fetch department by specific id
<br>
![image](https://user-images.githubusercontent.com/36573782/187088997-94c93dd8-f9cb-4f0f-a386-0feb977059dd.png)
<br>
Delete Department
<br>
![image](https://user-images.githubusercontent.com/36573782/187089006-764a9ebc-1066-4bac-b78e-62ad8d4db051.png)
<br>
Update Department
<br>
![image](https://user-images.githubusercontent.com/36573782/187089243-30fc69d5-4b6c-44ce-9119-823f180b00c7.png)
<br>
Custom Endpoint(Fetch Data By Name)
<br>
![image](https://user-images.githubusercontent.com/36573782/187090271-bc721380-ba59-460c-8020-ee4cca41f726.png)
<br>
Custom Endpoint(Fetch Data by Name as well as Ignore Case)
<br>
![image](https://user-images.githubusercontent.com/36573782/187090430-ead6a861-1b33-4710-8e06-0c2b5ed39914.png)
<br>
We added Hibernate Validation on Department name. here We send null
![image](https://user-images.githubusercontent.com/36573782/187091336-37ba5054-2616-449e-9be3-fc3560bb505a.png)
<br>
Here we send nothing for department name
<br>
![image](https://user-images.githubusercontent.com/36573782/187091376-696d9139-16df-4012-a143-d9364446e901.png)


