
Heroku
username: stephen.a.jacob@gmail.com
password: Tramp123

https://github.com/stephenajacob/BestRouteApp.git


-- Table: port

-- CREATE TYPE country AS ENUM ('IRELAND', 'BRITAIN', 'CONTINENT');

DROP TABLE port;

CREATE TABLE port
(
  id serial NOT NULL,
  name character varying,
  country character varying,
  latitude double precision,
  longitude double precision,
  CONSTRAINT pk PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE port
  OWNER TO postgres;
 

  
  INSERT INTO port (name, country, latitude, longitude) values ('Larne', 'IRELAND', 54.8461, -5.80516);
  INSERT INTO port (name, country, latitude, longitude) values ('Belfast', 'IRELAND', 54.636150, -5.882950);
  INSERT INTO port (name, country, latitude, longitude) values ('Dublin', 'IRELAND', 53.349617, -6.197362);
  INSERT INTO port (name, country, latitude, longitude) values ('Rosslare', 'IRELAND', 52.251668, -6.336032);
  
  INSERT INTO port (name, country, latitude, longitude) values ('CairnRyan', 'ENGLAND', 54.962, -5.016217);
  INSERT INTO port (name, country, latitude, longitude) values ('Heysham', 'ENGLAND', 54.04199, -2.894475);
  INSERT INTO port (name, country, latitude, longitude) values ('Liverpool', 'ENGLAND', 53.450067, -3.0037195);
  INSERT INTO port (name, country, latitude, longitude) values ('Birkenhead', 'ENGLAND', 53.38999, -3.023009);
  

  SELECT * FROM port;
  
  
  
  
  INSERT INTO crossing (from_port, to_port, time) values (1, 12, 1.75);
  
  // create a table using foreign keys from another table
  
  DROP TABLE crossing;
  
  CREATE TABLE crossing
(
  id serial NOT NULL,
  from_port integer NOT NULL REFERENCES port (id),
  to_port integer NOT NULL REFERENCES port (id),
  time decimal NOT NULL,
  CONSTRAINT cPK PRIMARY KEY (id)
) ;


 INSERT INTO crossing (from_port, to_port, time) values (1, 5, 1.5);
 INSERT INTO crossing (from_port, to_port, time) values (1, 5, 1.5);
 INSERT INTO crossing (from_port, to_port, time) values (1, 5, 1.5);
 INSERT INTO crossing (from_port, to_port, time) values (1, 5, 1.5);
 INSERT INTO crossing (from_port, to_port, time) values (1, 5, 1.5);
 
 
 
 INSERT INTO crossing (from_port, to_port, time) values (1, 6, 1.75);
 INSERT INTO crossing (from_port, to_port, time) values (2, 5, 2.9);
 INSERT INTO crossing (from_port, to_port, time) values (3, 6, 5.3);
 INSERT INTO crossing (from_port, to_port, time) values (3, 7, 5.6);

 SELECT * FROM crossing; 


