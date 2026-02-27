package com.example.foods.entidades.menu;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonBackReference
    private SubMenu submenu;

}
