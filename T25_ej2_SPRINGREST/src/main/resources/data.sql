DROP TABLE IF EXISTS Departamentos;
DROP TABLE IF EXISTS Empleados;

CREATE TABLE Departamentos(
id int AUTO_INCREMENT,
nombre nvarchar(100),
presupuesto int,
PRIMARY KEY(id)
);

CREATE TABLE Empleados(
id int AUTO_INCREMENT,
dni varchar(9) NOT NULL UNIQUE,
nombre nvarchar(100),
apellidos nvarchar(255),
Departamento long,
PRIMARY KEY (id),
CONSTRAINT FK_1 FOREIGN KEY (Departamento) REFERENCES Departamentos (id)
);


INSERT INTO Departamentos (nombre, presupuesto) VALUES ('Recursos Humanos', 15000);
INSERT INTO Departamentos (nombre, presupuesto) VALUES ('IT', 1300);
INSERT INTO Departamentos (nombre, presupuesto) VALUES ('Desarrollo', 1200);

INSERT INTO Empleados (dni, nombre, apellidos, Departamento) VALUES('23489789L', 'Ferran', 'Garcia', 1);
INSERT INTO Empleados (dni, nombre, apellidos, Departamento) VALUES('66666097H', 'Marc', 'Gimenez', 2);