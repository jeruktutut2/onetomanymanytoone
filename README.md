create database: 
CREATE DATABASE IF NOT EXISTS toko;

create table user:
CREATE TABLE user (
	id varchar(36) NOT NULL,
	name varchar(255) DEFAULT NULL,
	username varchar(255) NOT NULL,
	password varchar(255) NOT NULL,
	created_by varchar(36) DEFAULT NULL,
	created_date datetime DEFAULT NULL,
	updated_by varchar(36) DEFAULT NULL,
	updated_date datetime DEFAULT NULL,
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO user VALUES 
('4a4f9360-0113-11e9-8eb2-f2801f1b9fd1','admin1','admin1','$2a$10$d9zAWQ827RNJarHvKDjUju9SSl6Iv7OYYc1UhZOFWmH8QzsUWvjiu','',NOW(),NULL,NULL),
('4a4f95f4-0113-11e9-8eb2-f2801f1b9fd1','admin2','admin2','$2a$10$d9zAWQ827RNJarHvKDjUju9SSl6Iv7OYYc1UhZOFWmH8QzsUWvjiu','',NOW(),NULL,NULL),
('4a4f975c-0113-11e9-8eb2-f2801f1b9fd1','admin3','admin3','$2a$10$d9zAWQ827RNJarHvKDjUju9SSl6Iv7OYYc1UhZOFWmH8QzsUWvjiu','',NOW(),NULL,NULL);

CREATE TABLE permission (
	id varchar(36) NOT NULL,
	permission varchar(255) NOT NULL,
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE user_permission (
	id varchar(36) NOT NULL,
	id_user varchar(36) NOT NULL,
	id_permission varchar(36) NOT NULL,
	PRIMARY KEY (`id`),
	CONSTRAINT id_user FOREIGN KEY (id_user) REFERENCES user (id),
	CONSTRAINT id_permission FOREIGN KEY (id_permission) REFERENCES permission (id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO permission 
VALUES ('1ef4a24e-0133-11e9-8eb2-f2801f1b9fd1','CREATE_USER'),
('4f425f86-0133-11e9-8eb2-f2801f1b9fd1','READ_USER'),
('4f426224-0133-11e9-8eb2-f2801f1b9fd1','UPDATE_USER'),
('1ef4a4e2-0133-11e9-8eb2-f2801f1b9fd1','DELETE_USER');

INSERT INTO user_permission 
VALUES ('ed1d2a56-0133-11e9-8eb2-f2801f1b9fd1','4a4f9360-0113-11e9-8eb2-f2801f1b9fd1','1ef4a24e-0133-11e9-8eb2-f2801f1b9fd1'),
('ed1d2e52-0133-11e9-8eb2-f2801f1b9fd1','4a4f9360-0113-11e9-8eb2-f2801f1b9fd1','4f425f86-0133-11e9-8eb2-f2801f1b9fd1'),
('ed1d2cfe-0133-11e9-8eb2-f2801f1b9fd1','4a4f9360-0113-11e9-8eb2-f2801f1b9fd1','4f426224-0133-11e9-8eb2-f2801f1b9fd1'),
('ed1d2f7e-0133-11e9-8eb2-f2801f1b9fd1','4a4f9360-0113-11e9-8eb2-f2801f1b9fd1','1ef4a4e2-0133-11e9-8eb2-f2801f1b9fd1'),
('ed1d30b4-0133-11e9-8eb2-f2801f1b9fd1','4a4f95f4-0113-11e9-8eb2-f2801f1b9fd1','1ef4a24e-0133-11e9-8eb2-f2801f1b9fd1'),
('ed1d3488-0133-11e9-8eb2-f2801f1b9fd1','4a4f95f4-0113-11e9-8eb2-f2801f1b9fd1','4f426224-0133-11e9-8eb2-f2801f1b9fd1'),
('ed1d35c8-0133-11e9-8eb2-f2801f1b9fd1','4a4f95f4-0113-11e9-8eb2-f2801f1b9fd1','1ef4a4e2-0133-11e9-8eb2-f2801f1b9fd1'),
('ed1d36ea-0133-11e9-8eb2-f2801f1b9fd1','4a4f975c-0113-11e9-8eb2-f2801f1b9fd1','4f425f86-0133-11e9-8eb2-f2801f1b9fd1');
