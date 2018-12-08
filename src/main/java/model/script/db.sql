create database pladesamling;
use pladesamling;

drop table if exists kunstner;
drop table if exists plade;
drop table if exists user;

create table kunstner(
idkunstner int(4) primary key auto_increment,
kunstner_navn varchar(20),
country varchar(20)
);

create table plade(
id int(3) not null auto_increment,
pladenavn varchar(25) not null,
indspillet_year int(4),
kunstner_idkunstner int(4) not null,
PRIMARY KEY (id,pladenavn),
FOREIGN KEY (kunstner_idkunstner) REFERENCES kunstner(idkunstner)
);


INSERT INTO kunstner (kunstner_navn, country) VALUES 
('ABBA', 'Sweden');

INSERT INTO plade (pladenavn, indspillet_year, kunstner_idkunstner) VALUES 
('Dancing Queen' , '1977', 1);

INSERT INTO plade (pladenavn, indspillet_year, kunstner_idkunstner) VALUES 
('Take a chance' , '1985', 1);

select * from kunstner;
select * from plade;
select * from kunstner, plade where plade.kunstner_idkunstner = kunstner.idkunstner;

INSERT INTO kunstner (kunstner_navn, country) VALUES 
('Lukas Graham', 'Denmark');

INSERT INTO plade (pladenavn, indspillet_year, kunstner_idkunstner) VALUES 
('7 years' , '2015', 2);

create table user(
id int(5) primary key auto_increment,
name varchar(20) unique,
password varchar(20)
);

INSERT INTO user (name, password) VALUES ('jan', 'pass');
INSERT INTO user (name, password) VALUES ('test', 'test123');
SELECT * FROM user;