CREATE DATABASE IF NOT EXISTS ud27_ejercicio1;
USE ud27_ejercicio1;

CREATE TABLE piezas (
    codigo INT AUTO_INCREMENT,
    nombre VARCHAR(100),
    PRIMARY KEY (codigo)
);

CREATE TABLE proveedores (
    id CHAR(4),
    nombre VARCHAR(100),
    PRIMARY KEY (id)
);

CREATE TABLE suministra (
    id INT AUTO_INCREMENT,
    id_pieza INT,
    id_proveedor CHAR(4),
    precio INT,
    PRIMARY KEY (id),
    CONSTRAINT id_pieza FOREIGN KEY (id_pieza)
        REFERENCES piezas (codigo)
        ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT id_proveedor FOREIGN KEY (id_proveedor)
        REFERENCES proveedores (id)
        ON DELETE CASCADE ON UPDATE CASCADE
);
DROP TABLE usuarios;
CREATE TABLE usuarios (
    id INT AUTO_INCREMENT,
    username VARCHAR(155),
    password VARCHAR(155),
    PRIMARY KEY (id)
);

INSERT INTO usuarios (username, password) 
VALUES('palmira', '$2a$10$2sZ/K/d9ZRMxqiQwfUJXoefMZyGZVOVgrnKGCR2NwmQN3FEYab3PW');

INSERT INTO piezas(nombre) 
VALUES ('Tuerca'),
		('Tornillo'),
		('Punta'),
		('Arandela'),
		('Valvula');

INSERT INTO proveedores(id, nombre) 
VALUES ('4Tue','LasTuercas'),
		('PePe','FerreteríaPepe'),
		('GaDa','Gandalf El Blanco'),
		('S.Hw','SuperFerreteria'),
		('6Ho9','Valvula caliente');

INSERT INTO suministra(id_pieza, id_proveedor, precio) 
VALUES (1,'PePe',20),
		(2,'GaDa',20),
		(2,'S.Hw',20),
		(4,'S.Hw',20),
		(5,'6Ho9',20);
        