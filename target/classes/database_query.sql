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
INSERT INTO university(name,location, id) VALUES
('Astana Information Technology University', 'Astana, Mangilik El, 020000', 522),
('Suleyman Demirel University', 'Kaskelen, Abylai khan, 1/1', 302);
INSERT INTO student(name,info,id,group_id) VALUES
('Gordan Freeman','Ph.D Student',255004,'SE-2505'),
('Alyx Vance', 'Bachelor',255005,'CS-2505');
INSERT INTO instructor(name,info,id,course_id) VALUES
('Orazova Arailym', 'Senior Lecturer', 1,1),
('Askar Khaimuldin', 'Senior Lecturer', 2,3);
UPDATE student SET group_id='CS-2506' WHERE id=255005;