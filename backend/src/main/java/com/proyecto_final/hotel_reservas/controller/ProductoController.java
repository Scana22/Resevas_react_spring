package com.proyecto_final.hotel_reservas.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto_final.hotel_reservas.model.Producto;
import com.proyecto_final.hotel_reservas.repository.ProductoRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/productos")
@CrossOrigin(origins = "*") // necesario para permitir peticiones desde React
public class ProductoController {

    private final ProductoRepository productoRepository;

    public ProductoController (ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @PostMapping("path")
    public ResponseEntity<?> crearProducto(@RequestBody Producto producto) {
        if (productoRepository.existsByNombre(producto.getNombre())) {
            return ResponseEntity.badRequest().body("El nombre ya está en uso.");
        }
        Producto guardado = productoRepository.save(producto);
        return ResponseEntity.ok(Map.of(
        "mensaje", "Producto creado exitosamente.",
        "producto", guardado
        ));
    }
    
}
