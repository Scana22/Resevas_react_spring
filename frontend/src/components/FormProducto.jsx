import React, { useState } from 'react';
import axios from 'axios';
import { useNavigate } from 'react-router-dom';

const FormularioProducto = () => {
    const [nombre, setNombre] = useState('');
    const [descripcion, setDescripcion] = useState('');
    const [imagenPortada, setImagenPrincipal] = useState('');
    const [imagenesSecundarias, setImagenesSecundarias] = useState(['', '']);

    const [mensaje, setMensaje] = useState('');
    const [error, setError] = useState('');

    const navigate = useNavigate();

    const handleSubmit = async (event) => {
        event.preventDefault();

        // Nuevo array con las imagenes validas, si es que hay
        const imagenesValidas = imagenesSecundarias.filter(img => img.trim() !== '');

        // Crea el objeto a enviar al backend
        const nuevoProducto = {
            nombre,
            descripcion,
            imagenPortada,
            imagenesSecundarias: imagenesValidas
        };

        try {
            // Enviamos POST a Spring Boot
            const res = await axios.post('http://localhost:8080/productos', nuevoProducto);
            // Si todo sale bien, mostramos un mensaje
            setMensaje(res.data.mensaje || 'Producto guardado correctamente.');
            setError('');

            setNombre('');
            setDescripcion('');
            setImagenPrincipal('');
            setImagenesSecundarias(['', '']);

            // Luego de mostrar el mensaje, esperamos 1.5 segundos antes de redirigir
            setTimeout(() => {
                navigate('/admin'); // Redirige al panel de administración
            }, 1500); // espera 1.5 segundos antes de redirigir

        } catch (err) {
            // Si hay error, lo mostramos
            console.error(err); // Esto te da el detalle real del error
            setError(err.response?.data?.mensaje || 'Error al guardar el producto.');
            setMensaje('');
        }
    };

    return (
        <div className="container mt-4">
            <h2>Agregar nuevo producto</h2>


            {mensaje && <div className="alert alert-success">{mensaje}</div>}
            {error && <div className="alert alert-danger">{error}</div>}

            <form onSubmit={handleSubmit}>
                <div className="mb-3">
                    <label className="form-label" >Nombre</label>
                    <input
                        type="text"
                        className="form-control"
                        value={nombre}
                        onChange={(e) => setNombre(e.target.value)}
                        placeholder='Campo obligatorio'
                        required
                    />
                </div>

                <div className="mb-3">
                    <label className="form-label">Descripción</label>
                    <textarea
                        className="form-control"
                        rows="4"
                        value={descripcion}
                        onChange={(e) => setDescripcion(e.target.value)}
                        placeholder='Campo obligatorio'
                        required
                    />
                </div>

                <div className="mb-3">
                    <label className="form-label">Imagen principal (URL)</label>
                    <input
                        type="url"
                        className="form-control"
                        value={imagenPortada}
                        onChange={(e) => setImagenPrincipal(e.target.value)}
                        placeholder='Campo obligatorio'
                        required
                    />
                </div>

                <div className="mb-3">
                    <label className="form-label">Imagen secundaria 1 (opcional)</label>
                    <input
                        type="url"
                        className="form-control"
                        value={imagenesSecundarias[0]}
                        onChange={(e) => {
                            const nuevas = [...imagenesSecundarias];
                            nuevas[0] = e.target.value;
                            setImagenesSecundarias(nuevas);
                        }}
                    />
                </div>

                <div className="mb-3">
                    <label className="form-label">Imagen secundaria 2 (opcional)</label>
                    <input
                        type="url"
                        className="form-control"
                        value={imagenesSecundarias[1]}
                        onChange={(e) => {
                            const nuevas = [...imagenesSecundarias];
                            nuevas[1] = e.target.value;
                            setImagenesSecundarias(nuevas);
                        }}
                    />
                </div>

                <button type="submit" className="btn btn-primary">Guardar producto</button>
            </form>
        </div>
    );
};

export default FormularioProducto;


/* setTimeout(() => {
        navigate('/admin');
    }, 1500); // espera 1.5 segundos antes de redirigir */