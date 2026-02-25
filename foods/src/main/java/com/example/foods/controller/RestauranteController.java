package com.example.foods.controller;

import com.example.foods.entidades.menu.Restaurante;
import com.example.foods.service.RestauranteService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/restaurante")
public class RestauranteController {

    RestauranteService restauranteService;

@PostMapping("/registrar/restaurante")
    public ResponseEntity<Restaurante> registrarRestaurante(@RequestBody Restaurante restaurante){
        return ResponseEntity.ok(restauranteService.registrarRestaurante(restaurante));
    }


    @GetMapping("/traer/restaurante-id/{id}")
    public ResponseEntity<Restaurante> consultarRestauranteID(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(restauranteService.traerRestaurantesId(id));
    }

        @GetMapping("/traer/restaurante")
        public ResponseEntity<List<Restaurante>> treaerRestaurantes() {
            return ResponseEntity.ok(restauranteService.traerRestaurantes());

        }
}
