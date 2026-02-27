package com.example.foods.entidades.menu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "menu_id")
@JsonIgnore
    Menu menu;

    @OneToMany(mappedBy = "submenu")
    @JsonManagedReference
    List<Productos> productos;
}
