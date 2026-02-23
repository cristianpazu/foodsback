package com.example.foods.service.impl;

import com.example.foods.entidades.menu.Productos;
import com.example.foods.repository.menu.ProductosRepository;
import com.example.foods.service.ProductosService;
import org.springframework.stereotype.Service;

@Service
public class ProductosServiceImpl implements ProductosService  {


    ProductosRepository productosRepository;

    @Override
    public String registrarProducto(Productos productos) {

        productosRepository.save(productos);

        return "exito";
    }
}
