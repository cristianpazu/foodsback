package com.example.foods.repository.pedidos;

import com.example.foods.entidades.menu.Menu;
import com.example.foods.entidades.pedidos.Pedido;
import com.example.foods.entidades.pedidos.PedidoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoItemRepository extends JpaRepository<PedidoItem, Integer> {
}
