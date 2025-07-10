package com.proyecto_final.hotel_reservas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.proyecto_final.hotel_reservas.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{
    boolean existsByNombre(String nombre);
}
