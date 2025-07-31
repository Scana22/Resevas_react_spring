package com.proyecto_final.hotel_reservas.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto_final.hotel_reservas.model.Alojamiento;
import com.proyecto_final.hotel_reservas.repository.AlojamientoRepository;
import com.proyecto_final.hotel_reservas.service.AlojamientoService;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/alojamientos")
@RequiredArgsConstructor
public class AlojamientoController {

    private final AlojamientoService alojamientoService;

    @Autowired
    private final AlojamientoRepository alojamientoRepository;

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<?> crearProducto(@RequestBody Alojamiento alojamiento) {
        if (alojamientoRepository.existsByNombre(alojamiento.getNombre())) {
            return ResponseEntity.badRequest().body("El nombre ya está en uso.");
        }
        Alojamiento guardado = alojamientoRepository.save(alojamiento);
        return ResponseEntity.ok(Map.of(
        "mensaje", "Alojamiento creado exitosamente.",
        "alojamiento", guardado
        ));
    }

    @GetMapping("/recomendados")
    public List<Alojamiento> alojamientosRecomendados() {
        return alojamientoService.obtenerAlojamientosRecomendados(2);
    }
    
    
}
