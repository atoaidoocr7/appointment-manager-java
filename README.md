# Appointment Manager Java (SpringBoot)


## Components
1. SpringBoot REST API
2. MongoDB Atlas Database


## Running the Code

Make sure you have the Java Development Kit (JDK) installed before proceeding.
1. Clone the repository
2. Navigate to src/main/resources/application.properties 
3. Replace the value of spring.data.mongodb.uri with your own DB_URI (Follow DB Set Up instructions below)
4. Next run mvn install to install all the dependencies
5. Next navigate to the  AppointmentManagementApplication.java file and run it
6. You should see the following message at the bottom of the console with no errors :      Tomcat started on port(s): 5000 (http) with context path ''



## How to Configure the MongoDB Atlas Database

1. Navigate to https://www.mongodb.com/atlas/database
2. Log in or Sign up if first time user
3. After signing navigate to the left tab and click on security to configure IP address access
4. Click on allow access from anywhere
5. After configuring IP settings, on the left tab, under security, click on database access
6. In database access screen, If it is your first time, click on add new database user, else click add new user on the top right or just use an existing user.
7. Create a user name and password and click add user at the bottom right. Save your password as we will need it when connecting to the database from the SpringBoot application
8. You should be back on the home page now, if not navigate to the home page
9. Click on build database
10. Click on the free tier and leave everything else on default
11. Home page should now look like this.
12. Click on connect
13. Next, click on "Connect your application"
14. You should get a screen with a connection uri that looks like this: mongodb+srv://ato-aidoo:password@cluster0.wxuiqrr.mongodb.net/?retryWrites=true&w=majority
15. In the connection uri, replace the string "password" with your actual password 





