package com.salesianostriana.dam.e02ejpracticos2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Data @Builder
@Table(name = "product")
public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "name", nullable = false)
    private String nombre;
    @Column(name = "price", nullable = false)
    private double precio;
    @Column(name = "image")
    private String imagen;
    @Column(name = "description")
    private String descripcion;

}
