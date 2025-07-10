package com.proyecto_final.hotel_reservas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto_final.hotel_reservas.model.Reserva;
import com.proyecto_final.hotel_reservas.service.ReservaService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/reservas")
// @CrossOrigin(origins = "http://localhost:3000") React local
public class ReservaController {
    @Autowired
    private ReservaService service;

    @GetMapping
    public List<Reserva> listar() { return service.listaReservas(); }

    @PostMapping public Reserva guardReserva (@RequestBody Reserva reserva) { return service.guardar(reserva);}

    @GetMapping("/{id}")
    public Reserva obtenReserva(@PathVariable Long id) { return service.obtener(id).orElse(null);}

    @DeleteMapping("/{id}")
    public void eliminarReserva(@PathVariable Long id) { service.eliminar(id);}
}
