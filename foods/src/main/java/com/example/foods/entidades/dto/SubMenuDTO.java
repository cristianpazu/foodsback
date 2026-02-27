package com.example.foods.entidades.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SubMenuDTO {
    Integer idSubmenu;
     String nombre;
    List<ProductoDTO> productos;
    public SubMenuDTO() {
    }

    public SubMenuDTO(Integer idSubmenu, String nombre, List<ProductoDTO> productos) {
        this.idSubmenu = idSubmenu;
        this.nombre = nombre;
        this.productos = productos;
    }
}
