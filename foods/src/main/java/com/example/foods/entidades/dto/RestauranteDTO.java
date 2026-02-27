package com.example.foods.entidades.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RestauranteDTO {

    private Integer id;
    private String nombres;

    List<MenuDTO> menus;
    public RestauranteDTO() {
    }

    public RestauranteDTO(Integer id, String nombres, List<MenuDTO> menus) {
        this.id = id;
        this.nombres = nombres;

        this.menus = menus;
    }
}
