package com.example.foods.controller;

import com.example.foods.entidades.menu.Menu;
import com.example.foods.entidades.menu.Productos;
import com.example.foods.service.ProductosService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/producto")
public class ProductoController {


    ProductosService productosService;


    @PostMapping("registrar/productos")
    public ResponseEntity<Productos> registrarProducto(@RequestBody Productos productos){
        return ResponseEntity.ok(productosService.registrarProducto(productos));
    }

}
