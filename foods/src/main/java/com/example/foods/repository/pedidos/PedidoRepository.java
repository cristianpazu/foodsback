package com.example.foods.repository.pedidos;

import com.example.foods.entidades.menu.Menu;
import com.example.foods.entidades.pedidos.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}
