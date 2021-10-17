package com.salesianostriana.dam.e02ejpracticos2;
import com.salesianostriana.dam.e02ejpracticos2.model.Producto;
import com.salesianostriana.dam.e02ejpracticos2.repository.ProductoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class MainDePrueba {

    private final ProductoRepository repository;

    @PostConstruct
    public void test() {

        Producto producto = Producto.builder()
                .nombre("Coca cola")
                .precio(1.99)
                .build();

        repository.save(producto);

        repository
                .findAll()
                .forEach(System.out::println);


    }

}