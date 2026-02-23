package com.example.foods.entidades.menu;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Integer idMenu;

     String nombreMenu;

     Boolean activo;

    @OneToMany(mappedBy = "menu")
     List<SubMenu> submenus;

}
