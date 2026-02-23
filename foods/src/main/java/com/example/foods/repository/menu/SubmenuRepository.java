package com.example.foods.repository.menu;

import com.example.foods.entidades.menu.Menu;
import com.example.foods.entidades.menu.SubMenu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubmenuRepository extends JpaRepository<SubMenu, Integer> {
}
