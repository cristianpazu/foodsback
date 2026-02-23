package com.example.foods.entidades.menu;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class SubMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idSubmen;

    String nombre;

    @ManyToOne
    @JoinColumn(name = "menu_id")
    Menu menu;

    @OneToMany(mappedBy = "submenu")
    List<Productos> productos;
}
