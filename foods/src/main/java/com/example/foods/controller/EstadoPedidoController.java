package com.example.foods.controller;

import com.example.foods.entidades.menu.Menu;
import com.example.foods.entidades.pedidos.EstadoPedido;
import com.example.foods.service.EstadoPedidoServices;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/estadoPedido")
public class EstadoPedidoController {

    EstadoPedidoServices estadoPedidoServices;



    @GetMapping("/consultar/estadosPedidos")
    public ResponseEntity<List<EstadoPedido>> traerEstadoPedido(){
        return ResponseEntity.ok(estadoPedidoServices.consultarEstados());
    }

}
