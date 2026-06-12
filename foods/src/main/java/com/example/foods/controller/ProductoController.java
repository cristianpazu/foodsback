package com.example.foods.controller;

import com.example.foods.entidades.dto.ProductoResponseDTO;
import com.example.foods.entidades.menu.Menu;
import com.example.foods.entidades.menu.Productos;
import com.example.foods.entidades.pedidos.Mesas;
import com.example.foods.service.ProductosService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@AllArgsConstructor
@RequestMapping("/producto")
public class ProductoController {


    ProductosService productosService;


    @PostMapping("registrar/productos")
    public ResponseEntity<Productos> registrarProducto(@RequestBody Productos productos){
        return ResponseEntity.ok(productosService.registrarProducto(productos));
    }


    @GetMapping("/listar/productos")
    public ResponseEntity<List<ProductoResponseDTO>> listarMesas(){
        return ResponseEntity.ok(productosService.consultarProductos());

    }

}
