package com.example.foods.repository.menu;

import com.example.foods.entidades.menu.Menu;
import com.example.foods.entidades.menu.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductosRepository extends JpaRepository<Productos, Integer> {
}
