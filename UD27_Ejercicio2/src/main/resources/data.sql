CREATE DATABASE IF NOT EXISTS ud27_ejercicio2;
USE ud27_ejercicio2;

CREATE TABLE cientificos (
    dni VARCHAR(8) NOT NULL,
    nom_apels VARCHAR(255),
    PRIMARY KEY (dni)
);

CREATE TABLE proyecto (
    id CHAR(4),
    nombre VARCHAR(255),
    horas INT,
    PRIMARY KEY (id)
);

CREATE TABLE asignado_a (
    id INT AUTO_INCREMENT,
    cientifico_id VARCHAR(8),
    proyecto_id CHAR(4),
    PRIMARY KEY (id),
    FOREIGN KEY (cientifico_id)
        REFERENCES cientificos (dni)
        ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (proyecto_id)
        REFERENCES proyecto (id)
        ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE usuarios (
    id INT AUTO_INCREMENT,
    username VARCHAR(155),
    password VARCHAR(155),
    PRIMARY KEY (id)
);
    
INSERT INTO cientificos VALUES
('0000000S', 'Gordon Freeman'),
('1111111S', 'Michael Newman'),
('2222222S', 'Rogrigo García'),
('3333333S', 'Redbull Daalas'),
('4444444S', 'Maravillas Martínez'),
('5555555S', 'Núria Style'),
('6666666S', 'Arrebato Liendre'),
('7777777S', 'Xavier Cassanyes'),
('8888888S', 'Razones Grandes'),
('9999999S', 'Remiendos Menta');

INSERT INTO proyecto VALUES
('0000', 'Métodos numéricos', 8),
('0001', 'Métodos Algebraicos', 10),
('03R0', 'Radioactividad en portales', 4),
('005Y', 'Motores de combustión híbrida', 40),
('RY00', 'Motores de combustión externa', 80),
('0020', 'Motor Wanker', 250),
('0400', 'Las posibilidades de Rust en industria aeroespacial', 8),
('6000', 'Explosivos de tierra', 8),
('8000', 'La lluvia de ácido', 8),
('9000', 'La lluvia de oro', 8);

INSERT INTO asignado_a (cientifico_id, proyecto_id) VALUES
('0000000S', '03R0'),
('1111111S', '0000'),
('2222222S', '8000'),
('3333333S', '005Y'),
('4444444S', '9000'),
('5555555S', '0001'),
('6666666S', '6000'),
('7777777S', '0400'),
('8888888S', 'RY00'),
('9999999S', '0020');
