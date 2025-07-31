Proyecto Integrador - Sistema de Reservas
Descripción

Este proyecto es una aplicación de reservas que permite a los usuarios gestionar reservas de diferentes recursos (por ejemplo, salas, equipos, etc.) de manera eficiente. El sistema está compuesto por dos partes principales:

    Backend: Desarrollado en Java con el framework Spring Boot, proporcionando una API RESTful para gestionar las reservas, usuarios, y otros datos relacionados.

    Frontend: Desarrollado con React, interactuando con la API del backend para ofrecer una interfaz de usuario moderna y dinámica.

Tecnologías Utilizadas

    Backend:

        Java

        Spring Boot (REST API)

        Spring Security (autenticación y autorización)

        JWT (JSON Web Token) para la autenticación

        JPA/Hibernate (gestión de la base de datos)

        MySQL (base de datos)

    Frontend:

        React.js

        Axios (para hacer peticiones HTTP)

        React Router (gestión de rutas)

        Bootstrap (para el diseño de la interfaz)

    Otras Herramientas:

        Git (control de versiones)

Requisitos

Para ejecutar el Backend

    Tener instalado Java 11+.

    Tener instalado Maven.

    Tener instalado MySQL o MariaDB.

    Clonar este repositorio y acceder al directorio del backend.

Para ejecutar el Frontend

    Tener instalado Node.js y npm.

    Clonar este repositorio y acceder al directorio del frontend.

    Ejecutar npm install para instalar las dependencias.

Funcionalidades

Backend

    Autenticación con JWT:

        Los usuarios pueden registrarse y luego iniciar sesión usando un nombre de usuario y contraseña.

        Al iniciar sesión correctamente, se genera un JWT que se devuelve al cliente.

        El token debe incluirse en los encabezados de las solicitudes de autenticación para acceder a los recursos protegidos de la API.

    Gestión de Usuarios:

        Registro de nuevos usuarios.

        Inicio de sesión con verificación de credenciales.

        Recuperación de contraseñas (si es implementada).

    Gestión de Reservas:

        Los usuarios pueden crear, editar y eliminar reservas.

        Los administradores pueden gestionar todas las reservas.

    Roles y permisos:

        El sistema tiene diferentes roles (Usuario, Administrador).

        Los administradores tienen permisos para gestionar usuarios y ver todas las reservas.

Frontend

    Registro e inicio de sesión:

        Los usuarios pueden registrarse o iniciar sesión mediante un formulario. Al iniciar sesión, se almacena el token JWT en el almacenamiento local del navegador.

    Gestión de reservas:

        Los usuarios pueden realizar reservas, ver sus reservas existentes y editar o eliminarlas.

    Protección de rutas:

        Las rutas de administración y gestión de reservas están protegidas por autenticación JWT, por lo que los usuarios deben estar autenticados para acceder a ellas.

Contribuciones

Si deseas contribuir a este proyecto, por favor sigue estos pasos:

    Haz un fork del repositorio.

    Crea una nueva rama (git checkout -b feature/nueva-caracteristica).

    Realiza tus cambios y haz un commit (git commit -am 'Agrega nueva funcionalidad').

    Haz push a la rama (git push origin feature/nueva-caracteristica).

    Abre un Pull Request.
