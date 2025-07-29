import React from 'react';
import { useNavigate } from 'react-router-dom';

const AdminPanel = () => {
    const navigate = useNavigate();

    const manejarClickAgregar = () => {
        navigate('/admin/agregar');
    };

    return (
        <div className="container mt-4 text-center">
            <h2>Panel de Administración</h2>
            <button className="btn btn-success mt-3" onClick={manejarClickAgregar}>
                Agregar producto
            </button>
        </div>
    );
};

export default AdminPanel;
