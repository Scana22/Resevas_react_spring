package com.proyecto_final.hotel_reservas.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.proyecto_final.hotel_reservas.model.Alojamiento;
import com.proyecto_final.hotel_reservas.repository.AlojamientoRepository;

@Service
public class AlojamientoService {

    @Autowired
    private AlojamientoRepository alojamientoRepository;
    
    public List<Alojamiento> listarAlojamientos() {
        return alojamientoRepository.findAll();
    }

    @PreAuthorize("hasRole('ADMIN')")
    public Alojamiento guardarAlojamiento(Alojamiento alojamiento) {
        return alojamientoRepository.save(alojamiento);
    }
    
    @GetMapping("/alojamientos/recomendados")
    public List<Alojamiento> obtenerAlojamientosRecomendados(int cantidad) {
        List<Alojamiento> alojamientos = alojamientoRepository.findAll();
        //Filtrar alojamientos recomendados
        Random rand = new Random();
        return rand.ints(0, alojamientos.size())
                .distinct()
                .limit(cantidad)
                .mapToObj(alojamientos::get)
                .toList();
    }
}
