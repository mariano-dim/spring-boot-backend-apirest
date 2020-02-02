-- Authentication error in mysql, from 8.0.4

https://stackoverflow.com/questions/50387952/how-to-resolve-unable-to-load-authentication-plugin-caching-sha2-password-issu

ALTER USER 'student'@'localhost' IDENTIFIED WITH mysql_native_password BY 'pass123';


---Crear database and user

mysql> create database db_example; -- Creates the new database
mysql> create user 'springuser'@'%' identified by 'springpw'; -- Creates the user
mysql> grant all on db_ffx11.* to 'springuser'@'%'; -- Gives all privileges to the new user on the newly created database
