package com.example.foods.controller.pedidoController;

import com.example.foods.entidades.dto.HistorialPedidoDTO;
import com.example.foods.entidades.menu.Menu;
import com.example.foods.entidades.pedidos.Pedido;
import com.example.foods.service.PedidoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Pedido")
public class PedidoController {

    PedidoService pedidoService;

    @PostMapping("/pedido")
    public ResponseEntity<Pedido> registrarPedido(@RequestBody Pedido pedido){

        return ResponseEntity.ok(pedidoService.registrarPedido(pedido));

    }


    @GetMapping("/historial/pedido")
    public ResponseEntity<List<HistorialPedidoDTO>> consultarPedido(){

        return ResponseEntity.ok(pedidoService.consultarHistoriaPedido());

    }


    @GetMapping("/historial/pedidos/{fechaInicial}/{fechaFinal}")
    public ResponseEntity<List<HistorialPedidoDTO>> consultarPedidoFecha(  @PathVariable("fechaInicial") LocalDate fechaInicial,
                                                                           @PathVariable("fechaFinal") LocalDate fechaFinal){
        return ResponseEntity.ok(pedidoService.consultarHistoriaPedidoFecha(fechaInicial,fechaFinal));
    }


    @PostMapping("actualizar/pedido/{id}")
    public ResponseEntity<String> actualizarEstadoPago(@PathVariable Integer id){
        return ResponseEntity.ok(pedidoService.actualizarPedido(id));
    }

}
