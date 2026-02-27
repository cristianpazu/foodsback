package com.example.foods.entidades.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductoDTO {

     Integer id;
     String nombre;
     String descripcion;
     Integer precio;

    public ProductoDTO() {
    }

    public ProductoDTO(Integer id,String nombre, String descripcion, Integer precio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;

    }
}
