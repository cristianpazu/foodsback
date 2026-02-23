package com.example.foods.repository.menu;

import com.example.foods.entidades.menu.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Integer> {
}
