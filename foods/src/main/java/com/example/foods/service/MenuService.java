package com.example.foods.service;

import com.example.foods.entidades.menu.Menu;

import java.util.List;

public interface MenuService {


    String registrarMenu(Menu menu);

    String actualizarMenu(Menu menu);

    String inactivarMenu(Boolean inactiva);

    List<Menu> taerMenu();




}
