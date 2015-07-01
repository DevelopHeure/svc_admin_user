delete from user;
delete from business_profile;

insert into business_entity (id, name) values
(1,'Agence Mérignac'),
(2,'Agence Mériadec');

insert into business_profile (id, name) values
(1,'N1 Bienvenue'),
(2,'N2 Réclamation');

insert into user(id, name, email,profile_id,entity_id) values 
(1,'hervé darritchon','herve.darritchon@orange.com',1,1),
(2,'john doe','john.doe@orange.com',null,2),
(3,'jane smith','jane.smith@orange.com',null,null);