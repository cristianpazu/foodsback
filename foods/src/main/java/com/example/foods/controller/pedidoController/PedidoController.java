package com.example.foods.controller.pedidoController;

import com.example.foods.entidades.pedidos.Pedido;
import com.example.foods.service.PedidoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/Pedido")
public class PedidoController {

    PedidoService pedidoService;

    @PostMapping("/pedido")
    public ResponseEntity<Pedido> registrarPedido(@RequestBody Pedido pedido){

        return ResponseEntity.ok(pedidoService.registrarPedido(pedido));

    }

}
