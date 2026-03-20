package com.example.foods.service;

import com.example.foods.entidades.menu.Menu;
import com.example.foods.entidades.menu.Productos;

public interface ProductosService {

    Productos registrarProducto(Productos productos);

    Productos actualizarProducto(Integer id,Productos productos);

    Productos inactivarProductos(Integer id, Boolean inactiva);

}
