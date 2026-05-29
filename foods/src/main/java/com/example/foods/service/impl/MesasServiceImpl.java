package com.example.foods.service.impl;

import com.example.foods.entidades.menu.SubMenu;
import com.example.foods.entidades.pedidos.Mesas;
import com.example.foods.repository.pedidos.MesasRepository;
import com.example.foods.service.MesasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<Mesas> traerMesas() {
try{
        List<Mesas> subMesasList = mesasRepository.findAll(   Sort.by(Sort.Direction.ASC, "idMesas"));

        System.out.println("subMenuList = " + subMesasList);

        if (subMesasList.isEmpty()){
            throw new RuntimeException("La lista esta vacia");
        }

        return subMesasList;
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
    }
}
