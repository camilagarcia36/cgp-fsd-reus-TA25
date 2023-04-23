DROP TABLE IF EXISTS almacenes;
DROP TABLE IF EXISTS cajas;

CREATE TABLE almacenes(
	id int AUTO_INCREMENT,
	capacidad int,
	nombre varchar(100),
	PRIMARY KEY (id)
);

CREATE TABLE cajas(
	id int AUTO_INCREMENT,
	valor int,
	contenido varchar(100),
	almacen int,
	PRIMARY KEY (id),
	CONSTRAINT FK_1 FOREIGN KEY (almacen) REFERENCES almacenes (id)
);

INSERT INTO almacenes (capacidad, nombre) values (100,'alm1');
INSERT INTO almacenes (capacidad, nombre) values (200,'alm2');
INSERT INTO almacenes (capacidad, nombre) values (200,'alm3');
INSERT INTO almacenes (capacidad, nombre) values (200,'alm4');


INSERT INTO cajas (valor, contenido, almacen) values (10,'agua',1);
INSERT INTO cajas (valor, contenido, almacen) values (11,'zumos',2);
INSERT INTO cajas (valor, contenido, almacen) values (12,'perifericos',3);
INSERT INTO cajas (valor, contenido, almacen) values (13,'textil',4);
