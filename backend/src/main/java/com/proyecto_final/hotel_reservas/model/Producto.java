package com.proyecto_final.hotel_reservas.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Producto {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String nombre;

    @Column (nullable = false, columnDefinition = "TEXT")
    private String descripcion;

    @Column(nullable = false)
    private String imagenPortada;

    @ElementCollection
    private List<String> imagenesSecundarias;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagenPortada() {
        return imagenPortada;
    }

    public void setImagenPortada(String imagenPortada) {
        this.imagenPortada = imagenPortada;
    }

    public List<String> getImagenesSecundarias() {
        return imagenesSecundarias;
    }

    public void setImagenesSecundarias(List<String> imagenesSecundarias) {
        this.imagenesSecundarias = imagenesSecundarias;
    }

    


}
