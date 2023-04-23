DROP TABLE IF EXISTS salas;
DROP TABLE IF EXISTS peliculas;

CREATE TABLE peliculas(
	id INT AUTO_INCREMENT,
	nombre VARCHAR(100),
    calificacion INT,
	PRIMARY KEY(id)
);

CREATE TABLE salas(
	id INT AUTO_INCREMENT,
	nombre VARCHAR(100),
	pelicula INT,
	PRIMARY KEY(id),
	CONSTRAINT pelicula_fk FOREIGN KEY (pelicula) REFERENCES peliculas(id)
);


INSERT INTO peliculas(nombre, calificacion) VALUES ('La La Land', 9), ('El Padrino', 10), ('Inception', 8);

INSERT INTO salas(nombre, pelicula) VALUES ('Sala 1', 1), ('Sala 2', 2), ('Sala 3', 3);