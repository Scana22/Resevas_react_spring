import React, { useState, useEffect } from 'react';
import axios from 'axios';

function Recomendaciones() {
  const [alojamientos, setAlojamientos] = useState([]);

  useEffect(() => {
    // Hacemos la petición a la API para obtener los alojamientos recomendados
    axios.get('http://localhost:8080/alojamientos/recomendaciones')
      .then(response => {
        setAlojamientos(response.data);
      })
      .catch(error => {
        console.error("Hubo un error al obtener las recomendaciones", error);
      });
  }, []);

  // Función para seleccionar aleatoriamente un alojamiento
  const obtenerAlojamientosAleatorios = (cantidad) => {
    const aleatorios = [];
    for (let i = 0; i < 2; i++) {
      const indiceAleatorio = Math.floor(Math.random() * alojamientos.length);
      aleatorios.push(alojamientos[indiceAleatorio]);
    }
    return aleatorios;
  };

  // Obtener los alojamientos aleatorios para mostrar
  const alojamientosAleatorios = obtenerAlojamientosAleatorios(4);

  return (
    <div className="container py-5">
      <h2 className="text-center mb-4">Recomendaciones</h2>
      <div className="row row-cols-1 row-cols-md-2 row-cols-lg-4 g-4">
        {alojamientosAleatorios.length > 0 ? (
          alojamientosAleatorios.map((alojamiento, index) => (
            <div key={index} className="col">
              <div className="card h-100">
                <img 
                  src={alojamiento.imagen} 
                  className="card-img-top" 
                  alt={alojamiento.nombre} 
                />
                <div className="card-body">
                  <h5 className="card-title">{alojamiento.nombre}</h5>
                  <p className="card-text">{alojamiento.descripcion}</p>
                  <p className="card-text"><strong>${alojamiento.precio} por noche</strong></p>
                </div>
              </div>
            </div>
          ))
        ) : (
          <p>Cargando recomendaciones...</p>
        )}
      </div>
    </div>
  );
}

export default Recomendaciones;
