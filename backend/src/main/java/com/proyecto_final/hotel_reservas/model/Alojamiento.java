package com.proyecto_final.hotel_reservas.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "alojamientos")
@NoArgsConstructor
@AllArgsConstructor
public class Alojamiento {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String nombre;

    @Column (nullable = false, columnDefinition = "TEXT")
    private String descripcion;

    @Column(nullable = false)
    private double precioPorNoche;

    @Column(nullable = false)
    private String imagenPortada;

    @ElementCollection
    private List<String> imagenesSecundarias;

    @ManyToOne
    @JoinColumn(name = "categoria_id", nullable = false)
    private Categoria categoria;

    @OneToMany(mappedBy = "reserva")
    private List<Reserva> reservas;

    


}
