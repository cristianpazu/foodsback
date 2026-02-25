package com.example.foods.service.impl;

import com.example.foods.entidades.menu.Menu;
import com.example.foods.entidades.menu.Restaurante;
import com.example.foods.repository.menu.RestauranteRepository;
import com.example.foods.service.RestauranteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestauranteServiceImpl implements RestauranteService {
    @Autowired
    RestauranteRepository restauranteRepository;

    @Override
    public Restaurante registrarRestaurante(Restaurante restaurante) {

        Restaurante restaurante1 =   restauranteRepository.save(restaurante);

        return restaurante1;
    }

    @Override
    public Restaurante traerRestaurantesId(Integer id) {
        try {
            Restaurante traerId = restauranteRepository.findById(id).orElseThrow();

            return traerId;
        }catch (Exception e){
            throw new RuntimeException("No se encontraron la informacion");
        }

    }

    @Override
    public List<Restaurante> traerRestaurantes() {
        try{


            List<Restaurante> restaurante = restauranteRepository.findAll();

            if (restaurante.isEmpty()){
                throw new RuntimeException("La lista esta vacia");
            }

            return restaurante;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
