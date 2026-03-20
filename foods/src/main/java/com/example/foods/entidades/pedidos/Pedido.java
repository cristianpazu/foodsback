package com.example.foods.entidades.pedidos;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer idPedido;


    @ManyToOne
    @JoinColumn(name = "mesa_id")
    Mesas mesas;

    LocalDateTime fecha;

    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<PedidoItem> items;


    Integer totalCuenta;

}
