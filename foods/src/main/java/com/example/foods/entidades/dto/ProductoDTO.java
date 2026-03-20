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
     boolean activo;

    public ProductoDTO() {
    }

    public ProductoDTO(Integer id,String nombre, String descripcion, Integer precio, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.activo = activo;

    }
}
