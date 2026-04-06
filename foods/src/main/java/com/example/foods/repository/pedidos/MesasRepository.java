package com.example.foods.repository.pedidos;

import com.example.foods.entidades.menu.Menu;
import com.example.foods.entidades.pedidos.Mesas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MesasRepository extends JpaRepository<Mesas, Integer> {
}
