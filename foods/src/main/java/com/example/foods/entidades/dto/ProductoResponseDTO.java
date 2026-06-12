package com.example.foods.entidades.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductoResponseDTO {
    Integer id;
    String nombre;
    String descripcion;
    Integer precio;
    boolean activo;
    Integer idSubmenu;

    public ProductoResponseDTO() {
    }

    public ProductoResponseDTO(Integer id, String nombre, String descripcion, Integer precio, boolean activo, Integer idSubmenu) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.activo = activo;
        this.idSubmenu = idSubmenu;
    }
}
