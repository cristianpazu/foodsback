package com.example.foods.service.impl;

import com.example.foods.entidades.menu.SubMenu;
import com.example.foods.repository.menu.SubmenuRepository;
import com.example.foods.service.MenuService;
import com.example.foods.service.SubMenuService;
import org.springframework.stereotype.Service;

@Service
public class SubMenuServiceImpl implements SubMenuService {

    SubmenuRepository submenuRepository;

    @Override
    public String registrarSubmenu(SubMenu subMenu) {

        submenuRepository.save(subMenu);

        return "exito";
    }
}
