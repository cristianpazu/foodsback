package com.example.foods.service.impl;

import com.example.foods.entidades.menu.SubMenu;
import com.example.foods.entidades.pedidos.Mesas;
import com.example.foods.repository.pedidos.MesasRepository;
import com.example.foods.service.MesasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MesasServiceImpl implements MesasService {

@Autowired
    MesasRepository mesasRepository;


    @Override
    public Mesas registrarMesas(Mesas mesas) {

        return  mesasRepository.save(mesas);
    }

    @Override
    public Mesas actualizaarMesas(Integer id, Mesas mesas) {
        Mesas mesas1 = mesasRepository.findById(id).orElseThrow(() -> new RuntimeException("Mesas no encontrado"));
        mesas1.setNombre(mesas.getNombre());

        return mesasRepository.save(mesas1);
    }
}
