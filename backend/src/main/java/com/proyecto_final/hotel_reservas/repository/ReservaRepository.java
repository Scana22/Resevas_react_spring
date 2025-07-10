package com.proyecto_final.hotel_reservas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto_final.hotel_reservas.model.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Long>{

}
