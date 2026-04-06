package com.example.foods.service.impl;

import ch.qos.logback.core.util.StringUtil;
import com.example.foods.entidades.dto.HistorialPedidoDTO;
import com.example.foods.entidades.menu.Productos;
import com.example.foods.entidades.menu.Restaurante;
import com.example.foods.entidades.pedidos.Mesas;
import com.example.foods.entidades.pedidos.Pedido;
import com.example.foods.entidades.pedidos.PedidoItem;
import com.example.foods.repository.menu.ProductosRepository;
import com.example.foods.repository.pedidos.MesasRepository;
import com.example.foods.repository.pedidos.PedidoRepository;
import com.example.foods.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

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
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatterHour = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedNow = now.format(formatter);
        String formattedNowHour = now.format(formatterHour);



        pedido.setMesas(mesa);
        pedido.setFecha(LocalDate.parse(formattedNow));
        pedido.setHora(formattedNowHour);

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

    @Override
    public List<HistorialPedidoDTO> consultarHistoriaPedido() {

        try{


            List<HistorialPedidoDTO> historial = pedidoRepository.findByPedidos();
/*
            List<HistorialPedidoDTO> historial = historials.stream()
                    .map(r -> new HistorialPedidoDTO(
                            r.getIdPedido(),
                            r.getNombreMesa(),
                            r.getNombreProducto(),
                            r.getPrecio(),
                            r.getCantidad(),
                            r.getFecha(),
                            r.getTotalCuenta()
                    ))
                    .collect(Collectors.toList()); */

            if (historial.isEmpty()){
                throw new RuntimeException("La lista esta vacia");
            }

            return historial;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
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
