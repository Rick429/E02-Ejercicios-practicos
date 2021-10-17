package com.salesianostriana.dam.e02ejpracticos2.repository;

import com.salesianostriana.dam.e02ejpracticos2.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
