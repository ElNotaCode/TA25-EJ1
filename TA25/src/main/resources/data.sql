DROP TABLE IF EXISTS fabricantes;
CREATE TABLE fabricantes(codigo_fabricante INT AUTO_INCREMENT PRIMARY KEY,
nombre NVARCHAR(100)
);

DROP TABLE IF EXISTS articulos;
CREATE TABLE articulos(codigo_articulo INT AUTO_INCREMENT PRIMARY KEY,
nombre NVARCHAR(100),
precio INT,
codigo_fabricante INT,
CONSTRAINT `codigo_fabricante` FOREIGN KEY (`codigo_fabricante`) REFERENCES `fabricantes` (`codigo_fabricante`)
);

INSERT INTO fabricantes(nombre) VALUES ('IBM');
INSERT INTO fabricantes(nombre) VALUES ('INTEL');
INSERT INTO fabricantes(nombre) VALUES ('NASA');

INSERT INTO articulos(nombre,precio,codigo_fabricante) VALUES ('RATON',10,1);
INSERT INTO articulos(nombre,precio,codigo_fabricante) VALUES ('LANZADERA',1000000,3);
INSERT INTO articulos(nombre,precio,codigo_fabricante) VALUES ('MONITOR',60,1);
INSERT INTO articulos(nombre,precio,codigo_fabricante) VALUES ('CPU',300,2);
INSERT INTO articulos(nombre,precio,codigo_fabricante) VALUES ('PROPULSOR',5000000,3);
INSERT INTO articulos(nombre,precio,codigo_fabricante) VALUES ('TECLADO',20,1);