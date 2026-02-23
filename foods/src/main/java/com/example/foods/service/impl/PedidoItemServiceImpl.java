package com.example.foods.service.impl;

import com.example.foods.entidades.pedidos.Pedido;
import com.example.foods.repository.pedidos.PedidoRepository;
import com.example.foods.service.PedidoService;
import org.springframework.stereotype.Service;

@Service
public class PedidoItemServiceImpl implements PedidoService {


    PedidoRepository pedidoRepository;

    @Override
    public String registrarPedido(Pedido pedido) {

        pedidoRepository.save(pedido);

        return "exito";
    }
}
