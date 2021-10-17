package com.salesianostriana.dam.e02ejpracticos;

import com.salesianostriana.dam.e02ejpracticos.model.Pais;
import com.salesianostriana.dam.e02ejpracticos.repository.PaisRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class MainDePrueba {

    private final PaisRepository repository;

    @PostConstruct
    public void test() {

        Pais pais = Pais.builder()
                .nombre("España")
                .build();

        repository.save(pais);

        repository
                .findAll()
                .forEach(System.out::println);


    }

}