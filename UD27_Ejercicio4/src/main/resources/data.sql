CREATE DATABASE IF NOT EXISTS ud27_ejercicio4;
USE ud27_ejercicio4;

CREATE TABLE facultad (
    codigo INT,
    nombre VARCHAR(100),
    PRIMARY KEY(codigo)
);
CREATE TABLE equipos (
    num_serie CHAR(4),
    nombre VARCHAR(100),
    facultad_id INT,
    PRIMARY KEY (num_serie),
    FOREIGN KEY (facultad_id)
        REFERENCES facultad (codigo)
        ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE investigadores (
    dni VARCHAR(8),
    nom_apels VARCHAR(255),
    facultad_id INT,
    PRIMARY KEY (dni),
    FOREIGN KEY (facultad_id)
        REFERENCES facultad (codigo)
        ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE reserva (
    id INT AUTO_INCREMENT,
    investigador_id VARCHAR(8),
    equipo_id CHAR(4),
    comienzo DATETIME,
    fin DATETIME,
    PRIMARY KEY (id),
    FOREIGN KEY (investigador_id)
        REFERENCES investigadores (dni)
        ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (equipo_id)
        REFERENCES equipos (num_serie)
        ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE usuarios (
    id INT AUTO_INCREMENT,
    username VARCHAR(155),
    password VARCHAR(155),
    PRIMARY KEY (id)
);

INSERT INTO facultad(codigo, nombre) VALUES 
(1, "Fisica"),
(2, "Matemáticas"),
(3, "Química"),
(4, "Psicología"),
(5, "Derecho"),
(6, "Biología"),
(7, "Ingenieria Forestal"),
(8, "Economía"),
(9, "Ingeniería Informática"),
(10, "Turismo");

INSERT INTO investigadores (dni, nom_apels, facultad_id) VALUES
("4557878B", "Michael Scott", 4),
("1278997C", "Dwight Schrute", 7),
("4459898D", "Pamela Beesly", 10),
("4798863E", "Phyllis Vance", 6),
("4778863R", "Ryan Howard", 5),
("1458789A", "Kevin Malone", 2),
("2557888E", "Jim Halpert", 1),
("4555996C", "Kelly Kapoor", 10),
("7889882T", "Toby Flenderson", 9),
("1456897D", "Angela Martin", 3);

INSERT INTO equipos (num_serie, nombre, facultad_id) VALUES
('AA', "Equipo1", 1),
('BB', "Equipo2", 2),
('CC', "Equipo3", 3),
('DD', "Equipo4", 4), 
('EE', "Equipo5", 5),
('FF', "Equipo6", 6),
('GG', "Equipo7", 7),
('LL', "Equipo8", 8),
('MM', "Equipo9", 9),
('NN', "Equipo10", 10);

INSERT INTO reserva (investigador_id, equipo_id, comienzo, fin) VALUES
("4557878B", 'AA', '2020-03-15', '2021-03-01'),
("1278997C", 'BB', '2021-03-15', '2021-04-01'),
("4459898D", 'DD', '2022-05-02', '2023-02-28'),
("4798863E", 'MM', '2019-12-01', '2020-07-10'),
("4778863R", 'AA', '2020-03-15', '2020-04-30'),
("1458789A", 'CC', '2005-08-22', '2005-12-01'),
("2557888E", 'DD', '2022-05-02', '2023-02-28'),
("4555996C", 'NN', '2019-04-10', '2021-03-01'),
("7889882T", 'LL', '2020-01-01', '2023-03-01'),
("1456897D", 'GG', '2018-11-10', '2021-05-01');