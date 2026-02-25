package com.example.foods.entidades.menu;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
   @JsonIgnore
     List<SubMenu> submenus;

    @ManyToOne
    @JoinColumn(name = "id_restaurante")
    private Restaurante restaurante;

}
