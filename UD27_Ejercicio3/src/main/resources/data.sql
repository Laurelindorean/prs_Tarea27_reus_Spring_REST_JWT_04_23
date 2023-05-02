CREATE DATABASE IF NOT EXISTS ud27_ejercicio3;
USE ud27_ejercicio3;

CREATE TABLE cajeros (
    codigo INT AUTO_INCREMENT,
    nomapels VARCHAR(255),
    PRIMARY KEY (codigo)
);

CREATE TABLE productos (
    codigo INT AUTO_INCREMENT,
    nombre VARCHAR(100),
    precio INT,
    PRIMARY KEY (codigo)
);

CREATE TABLE maquinas_registradoras (
    codigo INT AUTO_INCREMENT,
    piso INT,
    PRIMARY KEY (codigo)
);

CREATE TABLE venta (
    id INT AUTO_INCREMENT,
    cajero_id INT,
    maquina_id INT,
    producto_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (cajero_id)
        REFERENCES cajeros (codigo)
        ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (maquina_id)
        REFERENCES maquinas_registradoras (codigo)
        ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (producto_id)
        REFERENCES productos (codigo)
        ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE usuarios (
    id INT AUTO_INCREMENT,
    username VARCHAR(155),
    password VARCHAR(155),
    PRIMARY KEY (id)
);

INSERT INTO cajeros (nomapels) VALUES
("Arya Stark"),
("Tyrion Lannister"),
("Jon Snow"),
("Bran Stark"),
("Rob Stark"),
("Cersei Lannister"),
("Daenerys Targaryen"),
("Jaime Lannister"),
("Theon Greyjoy"),
("Brienne de Tarth");

INSERT INTO productos (nombre, precio) VALUES
("Manzanas", 5),
("Peras", 3),
("Pimientos", 3),
("Pizza", 10),
("Pan", 2),
("Croquetas", 12),
("Macarrones con queso", 15),
("Patatas", 8),
("Chorizo", 4), 
("Lomo", 7);

INSERT INTO maquinas_registradoras (piso) VALUES
(1),(2),(3),(4),(5),(6),(7),(8),(9),(10);

INSERT INTO venta (cajero_id, maquina_id, producto_id) VALUES
(1,1,1),
(2,2,2),
(3,3,3),
(4,4,4),
(5,5,5),
(6,6,6),
(7,7,7),
(8,8,8),
(9,9,9),
(10,10,10);