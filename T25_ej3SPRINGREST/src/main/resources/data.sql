DROP TABLE IF EXISTS almacenes;
DROP TABLE IF EXISTS cajas;

CREATE TABLE almacenes(
	codigo INT AUTO_INCREMENT,
	lugar VARCHAR(100) DEFAULT NULL,
    capacidad INT DEFAULT NULL,
	PRIMARY KEY(codigo)
);

CREATE TABLE cajas(
	numreferencia INT AUTO_INCREMENT,
	contenido VARCHAR(100) DEFAULT NULL,
	valor INT DEFAULT NULL,
    almacen INT,
	PRIMARY KEY(numreferencia),
	CONSTRAINT almacen_fk FOREIGN KEY (almacen) REFERENCES almacenes (codigo)
);


INSERT INTO almacenes (lugar, capacidad) values ('vendrell', 1200);
INSERT INTO almacenes (lugar, capacidad) values ('calafell', 3333);
INSERT INTO almacenes (lugar, capacidad) values ('segur', 2222);
INSERT INTO almacenes (lugar, capacidad) values ('bcn', 1200);



INSERT INTO cajas (contenido,valor, almacen) values ('agua',120, 3);
INSERT INTO cajas (contenido,valor, almacen) values ('pan',120, 2);
INSERT INTO cajas (contenido,valor, almacen) values ('trigo',120, 1);
INSERT INTO cajas (contenido,valor, almacen) values ('sal',120, 4);