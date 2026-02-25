package com.example.foods.entidades.menu;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @JsonIgnore
    @OneToMany(mappedBy = "restaurante")
     List<Menu> menus;
}
