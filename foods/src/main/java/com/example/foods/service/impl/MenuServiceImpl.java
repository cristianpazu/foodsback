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
    public Menu registrarMenu(Menu menu) {

      Menu menu1 =  menuRepository.save(menu);

        return menu1;
    }

    @Override
    public Menu actualizarMenu(Integer id,Menu menu) {
     Menu  menu1 = menuRepository.findById(id) .orElseThrow(() -> new RuntimeException("Menu no encontrado"));

           menu1.setNombreMenu(menu.getNombreMenu());

        return menuRepository.save(menu1);
    }

    @Override
    public Menu inactivarMenu(Integer id ,Boolean inactiva) {



        Menu menu = menuRepository.findById(id) .orElseThrow(() -> new RuntimeException("Menu no encontrado"));

        menu.setActivo(inactiva);

        return menuRepository.save(menu);
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
