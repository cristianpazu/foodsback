package com.example.foods.entidades.pedidos;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

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





}
