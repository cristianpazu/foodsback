package com.example.foods.repository.pedidos;

import com.example.foods.entidades.dto.HistorialPedidoDTO;
import com.example.foods.entidades.menu.Menu;
import com.example.foods.entidades.pedidos.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

@Query(value = "SELECT  from Pedido p")
Optional<HistorialPedidoDTO> findByPedidos();
/*
select p.id_pedido, m.nombre,p2.nombre, p2.precio, ped.cantidad, p.fecha, p.total_cuenta
from pedido p inner join mesas m on m.id_mesa = p.mesa_id
    inner join pedido_item ped on p.id_pedido = ped.pedido_id inner join public.productos p2 on p2.id_productos = ped.productos_id;*/
    /*
    http://localhost:8080/Pedido/pedido
    {
  "mesas": {
    "idMesa": 1
  },
  "items": [
    {
      "productos": {
        "idProductos": 6
      },
      "cantidad": 3
    },
    {
      "productos": {
        "idProductos": 11
      },
      "cantidad": 3
    }
  ]
}http://localhost:8080/restaurante/traer/menuTodo/1http://localhost:8080/submenu/traer/submenus
http://localhost:8080/Mesas/mesa
{
    "nombre": "Mesa 1",
    "disponibildad": true
}
     */
}
