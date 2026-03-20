package com.example.foods.service;

import com.example.foods.entidades.menu.Restaurante;
import com.example.foods.entidades.menu.SubMenu;

import java.util.List;

public interface SubMenuService {


    SubMenu registrarSubmenu(SubMenu subMenu);

    SubMenu actualizarSubmenu(Integer id, SubMenu subMenu);

    List<SubMenu> traerSubmenu();

    SubMenu inactivarSubmenu(Integer id, Boolean inactivarSubmenu);


}
