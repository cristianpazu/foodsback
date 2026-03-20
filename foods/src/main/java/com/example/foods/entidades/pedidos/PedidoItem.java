package com.example.foods.entidades.pedidos;

import com.example.foods.entidades.menu.Productos;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class PedidoItem {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer idPedidoItem;


    @ManyToOne
    @JoinColumn(name = "pedido_id")
    @JsonBackReference
    private Pedido pedido;
/*
  @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
  private List<PedidoItem> items; */

    @ManyToOne
    @JoinColumn(name = "productos_id")
    private Productos productos;

    private Integer cantidad;

    private Integer total;


}
