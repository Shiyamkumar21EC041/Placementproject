create database Demo4
use Demo4
CREATE TABLE Tab4(
std_reg INT PRIMARY KEY,
std_name VARCHAR(50) NOT NULL,
std_cgp DECIMAL(10,2)
);
INSERT INTO Tab4(std_reg,std_name,std_cgp)
VALUES(101,'jj',800),
(102,'hdjh',900),
(103,'jsgus',700);
SELECT * FROM Tab4;

DELETE FROM Tab4
WHERE std_reg=101;

ALTER TABLE Tab4
ADD std_depart VARCHAR(50);
SELECT*FROM Tab4
ORDER BY std_name ASC;

