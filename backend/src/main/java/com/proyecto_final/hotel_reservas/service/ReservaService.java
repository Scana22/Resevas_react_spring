package com.proyecto_final.hotel_reservas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.proyecto_final.hotel_reservas.model.Reserva;
import com.proyecto_final.hotel_reservas.repository.ReservaRepository;

public class ReservaService {
    @Autowired
    private ReservaRepository reservaRepository;

    public List<Reserva> listaReservas() { return reservaRepository.findAll();}

    public Reserva guardar(Reserva reserva) { return reservaRepository.save(reserva);}

    public Optional<Reserva> obtener(Long id) { return reservaRepository.findById(id);}

    public void eliminar(Long id) { reservaRepository.deleteById(id);}

}
