import React from "react";

export const Buscador = () => {
    return (
        <div className="bg-secondary text-white py-4">
            <div className="container text-center">
                <h2 className="mb-4">Busca ofertas en hoteles, casas y mucho más</h2>
                <form className="d-flex justify-content-center gap-2 flex-wrap">
                <input type="text" placeholder="¿A dónde vamos?" className="form-control w-25" />
                <input type="text" placeholder="Check in - Check out" className="form-control w-25" />
                <button className="btn btn-info text-white">Buscar</button>
                </form>
            </div>
        </div>
    )
}
