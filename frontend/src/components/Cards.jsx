import React from 'react'

const tipos = [
  { nombre: "Hoteles", imagen: "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/0c/49/2b/78/fachada.jpg?w=1200&h=-1&s=1", cantidad: "+1000 hoteles" },
  { nombre: "Hostels", imagen: "https://via.placeholder.com/300x200", cantidad: "+1000 hoteles" },
  { nombre: "Departamentos", imagen: "https://via.placeholder.com/300x200", cantidad: "+1000 hoteles" },
  { nombre: "Bed and breakfast", imagen: "https://via.placeholder.com/300x200", cantidad: "+1000 hoteles" },
];

export const Cards = () => {
  return (
    <div className="container py-4">
      <h4 className="mb-4">Buscar por tipo de alojamiento</h4>
      <div className="row">
        {tipos.map((tipo, i) => (
          <div className="col-md-3 mb-4" key={i}>
            <div className="card h-100 shadow-sm">
              <img src={tipo.imagen} alt={tipo.nombre} className="card-img-top" />
              <div className="card-body">
                <h5 className="card-title">{tipo.nombre}</h5>
                <p className="card-text text-muted">{tipo.cantidad}</p>
              </div>
            </div>
          </div>
        ))}
      </div>
    </div>
  );
}
