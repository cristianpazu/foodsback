package com.example.foods.service.impl;

import ch.qos.logback.core.util.StringUtil;
import com.example.foods.entidades.pedidos.Pedido;
import com.example.foods.repository.pedidos.PedidoRepository;
import com.example.foods.service.PedidoService;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl implements PedidoService {

    PedidoRepository pedidoRepository;

    @Override
    public String registrarPedido(Pedido pedido) {
        pedidoRepository.save(pedido);

        return "exito";
    }
}
