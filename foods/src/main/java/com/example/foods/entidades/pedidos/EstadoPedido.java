package com.example.foods.entidades.pedidos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EstadoPedido {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer idEstado;

        private String nombre;
        
}
