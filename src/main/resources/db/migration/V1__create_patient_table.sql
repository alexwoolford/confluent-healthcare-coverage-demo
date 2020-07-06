CREATE TABLE patient (
    id INTEGER AUTO_INCREMENT KEY,
    firstname VARCHAR(50),
    lastname VARCHAR(50),
    enroll_start DATE,
    enroll_end DATE
);

INSERT INTO patient (firstname, lastname) VALUES ('Donald', 'Trump');
INSERT INTO patient (firstname, lastname) VALUES ('Vladimir', 'Putin');
INSERT INTO patient (firstname, lastname) VALUES ('Boris', 'Johnson');
INSERT INTO patient (firstname, lastname) VALUES ('Mark', 'Zuckerberg');
INSERT INTO patient (firstname, lastname) VALUES ('Benjamin', 'Netanyahu');
INSERT INTO patient (firstname, lastname) VALUES ('Jair', 'Bolsonaro');
INSERT INTO patient (firstname, lastname) VALUES ('Farty', 'McFartface');

UPDATE patient
SET enroll_start = CURRENT_DATE - INTERVAL FLOOR(RAND() * 365) + 186 DAY;

UPDATE patient
SET enroll_end = enroll_start + INTERVAL 365 DAY;
