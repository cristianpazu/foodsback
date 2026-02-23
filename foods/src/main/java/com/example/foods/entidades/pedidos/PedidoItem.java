package com.example.foods.entidades.pedidos;

import com.example.foods.entidades.menu.Productos;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PedidoItem {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer idPedidoItem;


    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "productos_id")
    private Productos productos;

    private Integer cantidad;


}
