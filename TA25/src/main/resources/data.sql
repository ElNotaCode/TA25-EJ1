DROP TABLE IF EXISTS fabricantes;
CREATE TABLE fabricantes(codigo_fabricante INT AUTO_INCREMENT PRIMARY KEY,
nombre NVARCHAR(100)
);

DROP TABLE IF EXISTS articulos;
CREATE TABLE articulos(codigo_articulo INT AUTO_INCREMENT PRIMARY KEY,
nombre NVARCHAR(100),
precio INT DEFAULT 100,
codigo_fabricante INT,
KEY (codigo_fabricante),
FOREIGN KEY (codigo_fabricante) REFERENCES fabricantes(codigo_fabricante)
ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT INTO fabricantes(nombre) VALUES
('CIMPASA'),
('TICNOVA'),
('IBM'),
('INTEL'),
('AMD'),
('INDRA'),
('TSYSTEMS'),
('BOSTONTEC'),
('WIRESL'),
('NASA');

INSERT INTO articulos(nombre,precio,codigo_fabricante) VALUES
('RATON',10,1),
('TECLADO',30,2),
('PANTALLA',115,2),
('GRAFICA',300,5),
('PLACA BASE',350,4),
('AURICULARES',85,10),
('ALTAVOCES',10,9),
('IMPRESORA',60,1),
('WEBCAM',30,7),
('CPU',199,3);