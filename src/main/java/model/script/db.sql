create database pladesamling;
use pladesamling;

drop table if exists kunstner;
drop table if exists plade;

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



INSERT INTO plade (pladenavn, indspillet_year, kunstner_idkunstner) VALUES 
('Dancing Queen' , '1977', 1);

INSERT INTO kunstner (kunstner_navn, country) VALUES 
('ABBA', 'Sweden');

select * from kunstner;
select * from plade;