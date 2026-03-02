CREATE TABLE students (
                          id INT PRIMARY KEY,
                          name VARCHAR(50),
                          age INT,
                          marks INT
);

INSERT INTO students VALUES (1,'Charan',22,85);
INSERT INTO students VALUES (2,'Ravi',21,75);
INSERT INTO students VALUES (3,'Anu',23,90);
INSERT INTO students VALUES (4,'Kiran',20,60);

-- WHERE clause
SELECT * FROM students WHERE marks > 70;
SELECT * FROM students WHERE age = 21;

-- ORDER BY
SELECT * FROM students ORDER BY marks ASC;
SELECT * FROM students ORDER BY marks DESC;

-- UPDATE
UPDATE students
SET marks = 95
WHERE name = 'Charan';

-- DELETE
DELETE FROM students
WHERE id = 4;