package com.example.foods.service.impl;

import com.example.foods.entidades.pedidos.Mesas;
import com.example.foods.repository.pedidos.MesasRepository;
import com.example.foods.service.MesasService;
import org.springframework.stereotype.Service;

@Service
public class MesasServiceImpl implements MesasService {


    MesasRepository mesasRepository;


    @Override
    public String registrarMesas(Mesas mesas) {
        mesasRepository.save(mesas);

        return "existo";
    }
}
