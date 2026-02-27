package com.example.foods.service;

import com.example.foods.entidades.dto.RestauranteDTO;
import com.example.foods.entidades.menu.Restaurante;

import java.util.List;

public interface RestauranteService {

    Restaurante registrarRestaurante(Restaurante restaurante);

    Restaurante traerRestaurantesId(Integer id);

    List<Restaurante> traerRestaurantes();

    RestauranteDTO traerMenuTodo(Integer id);

}
