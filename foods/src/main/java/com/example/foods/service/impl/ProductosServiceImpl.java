package com.example.foods.service.impl;

import com.example.foods.entidades.menu.Productos;
import com.example.foods.entidades.menu.SubMenu;
import com.example.foods.repository.menu.ProductosRepository;
import com.example.foods.repository.menu.SubmenuRepository;
import com.example.foods.service.ProductosService;
import org.springframework.stereotype.Service;

@Service
public class ProductosServiceImpl implements ProductosService {


    ProductosRepository productosRepository;

    SubmenuRepository submenuRepository;

    public ProductosServiceImpl(ProductosRepository productosRepository,
                                SubmenuRepository submenuRepository) {
        this.productosRepository = productosRepository;
        this.submenuRepository = submenuRepository;
    }



    @Override
    public Productos registrarProducto(Productos productos) {

        System.out.println("productos.getSubmenu()" + productos.getSubmenu().getIdSubmen());


        Integer submenuId = productos.getSubmenu().getIdSubmen();

        SubMenu submenu = submenuRepository.findById(submenuId)
                .orElseThrow(() -> new RuntimeException("Submenu no existe"));

        System.out.println("productos.getSubmenu()" + submenu);
        productos.setSubmenu(submenu);
        Productos productos1 = productosRepository.save(productos);

        return productos1;
    }
}
