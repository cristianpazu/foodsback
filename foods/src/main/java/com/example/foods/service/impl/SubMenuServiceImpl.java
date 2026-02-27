package com.example.foods.service.impl;

import com.example.foods.entidades.menu.Restaurante;
import com.example.foods.entidades.menu.SubMenu;
import com.example.foods.repository.menu.SubmenuRepository;
import com.example.foods.service.MenuService;
import com.example.foods.service.SubMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubMenuServiceImpl implements SubMenuService {
    @Autowired
    SubmenuRepository submenuRepository;

    @Override
    public SubMenu registrarSubmenu(SubMenu subMenu) {

      SubMenu subMenu1 =   submenuRepository.save(subMenu);

        return subMenu1;
    }

    @Override
    public List<SubMenu> traerSubmenu() {
        try{


            List<SubMenu> subMenuList = submenuRepository.findAll();

            System.out.println("subMenuList = " + subMenuList);
            
            if (subMenuList.isEmpty()){
                throw new RuntimeException("La lista esta vacia");
            }

            return subMenuList;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
