package com.example.foods.service.impl;

import com.example.foods.entidades.menu.Menu;
import com.example.foods.repository.menu.MenuRepository;
import com.example.foods.service.MenuService;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl implements MenuService {


    MenuRepository menuRepository;

    @Override
    public String registrarMenu(Menu menu) {

        menuRepository.save(menu);

        return "Se ha guardado Exitosamen";
    }

    @Override
    public String actualizarMenu(Menu menu) {
        return "";
    }

    @Override
    public String inactivarMenu(Boolean inactiva) {
        return "";
    }
}
