package com.example.foods.entidades.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class MenuDTO {

     String nombreMenu;
     boolean activo;
     List<SubMenuDTO> submenu;

    public MenuDTO() {
    }

    public MenuDTO(String nombreMenu, List<SubMenuDTO> submenu, boolean activo) {
        this.nombreMenu = nombreMenu;
        this.submenu = submenu;
        this.activo = activo;
    }
}
