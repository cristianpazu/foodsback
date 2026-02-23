package com.example.foods.entidades.menu;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Productos {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
   Integer idProductos;

  String Nombre;

  String Descripcion;

  Integer Precio;

    private boolean activo;

    @ManyToOne
    @JoinColumn(name = "submenu_id")
    private SubMenu submenu;

}
