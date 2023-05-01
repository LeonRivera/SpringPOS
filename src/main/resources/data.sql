INSERT INTO model (field_varchar, field_decimal, field_date) 
VALUES ('Leon', 90.69, '2008-7-04');
INSERT INTO model (field_varchar, field_decimal, field_date) 
VALUES ('Felipe', 95.431, '2001-7-04');
INSERT INTO model (field_varchar, field_decimal, field_date) 
VALUES ('Rivera', 123.123, '2012-7-04');

INSERT INTO categoria (nombre_categoria) 
VALUES ('Frutas y Verduras');
INSERT INTO categoria (nombre_categoria) 
VALUES ('Lacteos');



INSERT INTO product (codigo, nombre, precio, fecha_creado, categoria_id) 
VALUES ('75066062', 'Cigarros Chesterfield', 90.69, '2008-7-04',  1);
INSERT INTO product (codigo, nombre, precio, fecha_creado, categoria_id) 
VALUES ('2', 'Boing 200Ml', 10.60, '2022-2-04',  1);
INSERT INTO product (codigo, nombre, precio, fecha_creado, categoria_id) 
VALUES ('3', 'Chetos 50g', 12.00, '2022-3-04',  1);
INSERT INTO product (codigo, nombre, precio, fecha_creado, categoria_id, cantidad) 
VALUES ('4', 'Aguacate', 40, '2022-2-04', 1, 100);



--SELECT * FROM model ;