package com.example.foods.service.impl;

import com.example.foods.entidades.menu.Menu;
import com.example.foods.repository.menu.MenuRepository;
import com.example.foods.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

@Autowired
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

    @Override
    public List<Menu> taerMenu() {
        try {

            List<Menu> menus = menuRepository.findAll();

            if (menus.isEmpty()){
                throw new RuntimeException("La lista esta vacia");
            }

            return menus;


        } catch (Exception e){
            throw new RuntimeException(e);
        }



    }
}
