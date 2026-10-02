package com.example.foods.service.impl;

import com.example.foods.entidades.menu.Menu;
import com.example.foods.entidades.pedidos.EstadoPedido;
import com.example.foods.repository.pedidos.EstadoRepository;
import com.example.foods.service.EstadoPedidoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoPedidoImpl implements EstadoPedidoServices {

    @Autowired
    EstadoRepository estadoRepository;


    @Override
    public List<EstadoPedido> consultarEstados() {
        try {

            List<EstadoPedido> estadoPedidos = estadoRepository.findAll();

            if (estadoPedidos.isEmpty()){
                throw new RuntimeException("La lista esta vacia");
            }

            return estadoPedidos;


        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
