import React from 'react';

export const Header = () => {
  return (
    <nav className="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
      <div className="container-fluid">
        
        <a className="navbar-brand d-flex align-items-center" href="/">
          <img src="/logo192.png" alt="Logo" width="30" height="30" className="d-inline-block align-top me-2" />
          Hotel App
        </a>

        <div className="d-flex">
          <button className="btn btn-outline-light me-2" disabled>Crear cuenta</button>
          <button className="btn btn-outline-light" disabled>Iniciar sesión</button>
        </div>
      </div>
    </nav>
  );
}


