package com.example.foods.service.impl;

import com.example.foods.entidades.menu.Restaurante;
import com.example.foods.repository.menu.RestauranteRepository;
import com.example.foods.service.RestauranteService;
import org.springframework.stereotype.Service;

@Service
public class RestauranteServiceImpl implements RestauranteService {

    RestauranteRepository restauranteRepository;

    @Override
    public String registrarRestaurante(Restaurante restaurante) {

        restauranteRepository.save(restaurante);

        return "exito";
    }
}
