import React from 'react';
import { Container } from 'react-bootstrap';
import { FaGithub, FaLinkedin } from 'react-icons/fa';
import './../styles/Footer.css'; 

const Footer = () => {
  return (
    <footer className="text-dark text-center py-4 mt-auto">
      <div className="container">
        <div className="derechos">
            <small>&copy; 2025 Reservas App. Todos los derechos reservados.</small>
        </div>
        <div className="mb-2">
          <a
            href="https://github.com/Scana22"
            target="_blank"
            rel="noopener noreferrer"
            className="text-white mx-3"
            style={{ fontSize: '1.5rem' }}
          >
            <FaGithub />
          </a>
          <a
            href="https://www.linkedin.com/in/tu-usuario/"
            target="_blank"
            rel="noopener noreferrer"
            className="text-white mx-3"
            style={{ fontSize: '1.5rem' }}
          >
            <FaLinkedin />
          </a>
        </div>
        
      </div>
    </footer>
  );
}

export default Footer;
