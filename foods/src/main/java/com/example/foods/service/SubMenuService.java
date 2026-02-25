package com.example.foods.service;

import com.example.foods.entidades.menu.SubMenu;

import java.util.List;

public interface SubMenuService {


    SubMenu registrarSubmenu(SubMenu subMenu);

    List<SubMenu> traerSubmenu();


}
