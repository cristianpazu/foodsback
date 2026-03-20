package com.example.foods.service;

import com.example.foods.entidades.pedidos.Mesas;

public interface MesasService {

    Mesas registrarMesas(Mesas mesas);

    Mesas actualizaarMesas(Integer id, Mesas mesas);
}
