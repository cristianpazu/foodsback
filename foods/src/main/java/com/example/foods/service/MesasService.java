package com.example.foods.service;

import com.example.foods.entidades.menu.Restaurante;
import com.example.foods.entidades.pedidos.Mesas;

import java.util.List;

public interface MesasService {

    Mesas registrarMesas(Mesas mesas);

    Mesas actualizaarMesas(Integer id, Mesas mesas);

    List<Mesas> traerMesas();
}
