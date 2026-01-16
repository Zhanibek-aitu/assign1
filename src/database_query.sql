CREATE TABLE instructor(
   id INT PRIMARY KEY,
   name VARCHAR(30),
   info VARCHAR(30),
   course_id VARCHAR(30)
);
CREATE TABLE student(
    id INT PRIMARY KEY,
    name VARCHAR(30),
    info VARCHAR(30),
    group_id VARCHAR(30)
);
CREATE TABLE instructor(
   id INT PRIMARY KEY,
   name VARCHAR(30),
   info VARCHAR(30),
   course_id VARCHAR(30)
);
CREATE TABLE university(
   id INT PRIMARY KEY,
   name VARCHAR(50),
   location VARCHAR(100)
);