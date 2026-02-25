package com.example.foods.repository.menu;

import com.example.foods.entidades.menu.Menu;
import com.example.foods.entidades.menu.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestauranteRepository extends JpaRepository<Restaurante, Integer> {
}
