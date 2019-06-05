
CREATE TABLE firstname (
    firstname VARCHAR(50)
);

INSERT INTO firstname (firstname) VALUES ('Victoria');
INSERT INTO firstname (firstname) VALUES ('Bradley');
INSERT INTO firstname (firstname) VALUES ('Miles');
INSERT INTO firstname (firstname) VALUES ('Alex');
INSERT INTO firstname (firstname) VALUES ('Larry');
INSERT INTO firstname (firstname) VALUES ('Dave');
INSERT INTO firstname (firstname) VALUES ('Ruth');
INSERT INTO firstname (firstname) VALUES ('Mark');
INSERT INTO firstname (firstname) VALUES ('Robert');
INSERT INTO firstname (firstname) VALUES ('Brooke');

CREATE TABLE lastname (
    lastname VARCHAR(50)
);

INSERT INTO lastname (lastname) VALUES ('Woolford');
INSERT INTO lastname (lastname) VALUES ('Schliep');
INSERT INTO lastname (lastname) VALUES ('Bertemes');
INSERT INTO lastname (lastname) VALUES ('Mckenzie');
INSERT INTO lastname (lastname) VALUES ('Clement');
INSERT INTO lastname (lastname) VALUES ('Meere');
INSERT INTO lastname (lastname) VALUES ('Rutherford');
INSERT INTO lastname (lastname) VALUES ('Harley');
INSERT INTO lastname (lastname) VALUES ('Done');
INSERT INTO lastname (lastname) VALUES ('Marley');
INSERT INTO lastname (lastname) VALUES ('Johnson');
INSERT INTO lastname (lastname) VALUES ('Brooks');

CREATE TABLE patient (
    id INTEGER AUTO_INCREMENT KEY,
    firstname VARCHAR(50),
    lastname VARCHAR(50),
    enroll_start DATE,
    enroll_end DATE
);
