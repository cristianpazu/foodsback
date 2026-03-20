package com.example.foods.service;

import com.example.foods.entidades.menu.Menu;

import java.util.List;

public interface MenuService {


    Menu registrarMenu(Menu menu);

    Menu actualizarMenu(Integer id, Menu menu);

    Menu inactivarMenu(Integer id, Boolean inactiva);

    List<Menu> taerMenu();




}
