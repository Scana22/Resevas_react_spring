package com.proyecto_final.hotel_reservas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.proyecto_final.hotel_reservas.model.Alojamiento;

public interface AlojamientoRepository extends JpaRepository<Alojamiento, Long>{
    boolean existsByNombre(String nombre);
}
