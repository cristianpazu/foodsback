package com.example.foods.entidades.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SubMenuResponseDTO {
    Integer idSubmen;
    String nombre;

    public SubMenuResponseDTO() {
    }

    public SubMenuResponseDTO(Integer idSubmen, String nombre) {
        this.idSubmen = idSubmen;
        this.nombre = nombre;

    }
}
