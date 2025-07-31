/* Archivo de prueba para Postman */
CREATE TABLE IF NOT EXISTS USUARIOS(
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    contrasena VARCHAR(100) NOT NULL,
    fecha_registro TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS CATEGORIAS(
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    descripcion TEXT,
);

CREATE TABLE IF NOT EXISTS ALOJAMIENTOS(
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion TEXT NOT NULL,
    precio_por_noche DECIMAL(10, 2) NOT NULL,
    categoria_id INT NOT NULL,
    FOREIGN KEY (categoria_id) REFERENCES CATEGORIAS(id),
);

CREATE TABLE IF NOT EXISTS RESERVA(
    id SERIAL PRIMARY KEY,
    usuario_id INT NOT NULL,
    FOREIGN KEY (usuario_id) REFERENCES USUARIOS(id),
    alojamiento_id INT NOT NULL,
    FOREIGN KEY (alojamiento_id) REFERENCES ALOJAMIENTOS(id),
    fecha_entrada DATE NOT NULL,
    fecha_salida DATE NOT NULL,
    cantidad_personas INT NOT NULL
);


INSERT INTO USUARIOS (nombre, email, contrasena)
VALUES ('Agustin Scanavino', 'aguscanavino@gmail.com', 'password123');
INSERT INTO USUARIOS (nombre, email, contrasena)    
VALUES ('Juan Perez', 'juanperez@gmail.com', 'password456');


INSERT INTO ALOJAMIENTOS (nombre, descripcion, precio_por_noche, categoria_id)
VALUES ('Hotel Playa', 'Un hotel con vista al mar', 150.00, 1);
INSERT INTO ALOJAMIENTOS (nombre, descripcion, precio_por_noche, categoria_id)
VALUES ('Cabaña en el Bosque', 'Una cabaña acogedora en el bosque', 100.00, 2);

INSERT INTO RESERVA (usuario_id, alojamiento_id, fecha_entrada, fecha_salida, cantidad_personas)
VALUES (1, 1, '2025-06-01', '2025-06-05', 2);
INSERT INTO RESERVA (usuario_id, alojamiento_id, fecha_entrada, fecha_salida, cantidad_personas)
VALUES (2, 2, '2025-07-10', '2025-07-15', 4);

INSERT INTO CATEGORIAS (nombre, descripcion)
VALUES ('Hoteles', 'Alojamientos con servicios completos');
INSERT INTO CATEGORIAS (nombre, descripcion)
VALUES ('Cabañas', 'Alojamientos en la naturaleza');

