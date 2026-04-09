package com.example.foods.controller.pedidoController;

import com.example.foods.entidades.pedidos.Mesas;
import com.example.foods.entidades.pedidos.Pedido;
import com.example.foods.service.MesasService;
import com.example.foods.service.PedidoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
    @RequestMapping("/Mesas")
public class MesasController {

    MesasService mesasService;

    @PostMapping("/mesa")
    public ResponseEntity<Mesas> registrarPedido(@RequestBody Mesas mesas){

        return ResponseEntity.ok(mesasService.registrarMesas(mesas));

    }

    @PostMapping("/actualizar/mesa/{id}")
    public ResponseEntity<Mesas> actualizarMesas(@PathVariable Integer id, @RequestBody Mesas mesas){
        return ResponseEntity.ok(mesasService.actualizaarMesas(id, mesas));

    }

}
