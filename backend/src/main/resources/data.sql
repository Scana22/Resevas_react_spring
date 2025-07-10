/* Archivo de prueba para Postman */
CREATE TABLE IF NOT EXISTS RESERVA (
    id SERIAL PRIMARY KEY,
    nombre_cliente VARCHAR(100) NOT NULL,
    fecha_entrada DATE NOT NULL,
    fecha_salida DATE NOT NULL,
    cantidad_personas INT NOT NULL
);
INSERT INTO RESERVA (nombre_cliente, fecha_entrada, fecha_salida, cantidad_personas)
VALUES ('Carlos', '2025-07-10', '2025-07-15', 2);
