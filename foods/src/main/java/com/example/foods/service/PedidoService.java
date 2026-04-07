package com.example.foods.service;

import com.example.foods.entidades.dto.HistorialPedidoDTO;
import com.example.foods.entidades.pedidos.Pedido;

import java.time.LocalDate;
import java.util.List;

public interface PedidoService {

    Pedido registrarPedido(Pedido pedido);

    List<HistorialPedidoDTO> consultarHistoriaPedido();

    List<HistorialPedidoDTO> consultarHistoriaPedidoFecha(LocalDate fechaInicial, LocalDate fechaFinal );

    String actualizarPedido(Integer idPedido);

}
