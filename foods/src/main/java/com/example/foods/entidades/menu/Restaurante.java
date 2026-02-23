package com.example.foods.entidades.menu;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Restaurante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer idRestaurante;

     String nombre;

    @OneToMany(mappedBy = "restaurante")
     List<Menu> menus;
}
