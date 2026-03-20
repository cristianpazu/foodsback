package com.example.foods.service.impl;

import ch.qos.logback.core.util.StringUtil;
import com.example.foods.entidades.menu.Productos;
import com.example.foods.entidades.pedidos.Mesas;
import com.example.foods.entidades.pedidos.Pedido;
import com.example.foods.entidades.pedidos.PedidoItem;
import com.example.foods.repository.menu.ProductosRepository;
import com.example.foods.repository.pedidos.MesasRepository;
import com.example.foods.repository.pedidos.PedidoRepository;
import com.example.foods.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PedidoServiceImpl implements PedidoService {
@Autowired

    PedidoRepository pedidoRepository;
    @Autowired
MesasRepository mesasRepository;
    @Autowired
    ProductosRepository productosRepository;

    @Override
    public Pedido registrarPedido(Pedido pedido) {

        Mesas mesa = mesasRepository.findById(pedido.getMesas().getIdMesa())
                .orElseThrow(() -> new RuntimeException("Mesa no existe"));

        if (mesa.getDisponibildad() == false){
            throw new RuntimeException("Mesa no esta disponible");
        }

        pedido.setMesas(mesa);
        pedido.setFecha(LocalDateTime.now());

        Integer totales = 0;
        for (PedidoItem item : pedido.getItems()) {

            Productos producto = productosRepository
                    .findById(item.getProductos().getIdProductos())
                    .orElseThrow(() -> new RuntimeException("Producto no existe"));

           Integer totals = producto.getPrecio() * item.getCantidad();

            item.setProductos(producto);
            item.setPedido(pedido);


            item.setTotal(totals);

            totales += totals;


        }

        pedido.setTotalCuenta(totales);
        mesa.setDisponibildad(false);
        return pedidoRepository.save(pedido);
    }
/*
    @Override
    public Pedido registrarPedido(PedidoRequestDTO dto) {

        Mesas mesa = mesasRepository.findById(dto.getMesaId())
                .orElseThrow(() -> new RuntimeException("Mesa no existe"));

        Pedido pedido = new Pedido();
        pedido.setMesas(mesa);
        pedido.setFecha(LocalDateTime.now());

        Pedido pedidoGuardado = pedidoRepository.save(pedido);

        for (PedidoItemDTO itemDTO : dto.getItems()) {

            Productos producto = productosRepository.findById(itemDTO.getProductoId())
                    .orElseThrow(() -> new RuntimeException("Producto no existe"));

            PedidoItem item = new PedidoItem();
            item.setPedido(pedidoGuardado);
            item.setProductos(producto);
            item.setCantidad(itemDTO.getCantidad());

            pedidoItemRepository.save(item);
        }

        mesa.setDisponibildad(false);
        mesasRepository.save(mesa);

        return pedidoGuardado;
    } */

}
