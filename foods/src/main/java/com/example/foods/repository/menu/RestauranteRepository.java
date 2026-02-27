package com.example.foods.repository.menu;

import com.example.foods.entidades.menu.Menu;
import com.example.foods.entidades.menu.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RestauranteRepository extends JpaRepository<Restaurante, Integer> {

    @Query(value = "SELECT DISTINCT rs " +
            "FROM Restaurante rs " +
            "INNER JOIN Menu  m on rs.idRestaurante = m.restaurante.idRestaurante " +
            "INNER JOIN SubMenu  sm on m.idMenu = sm.menu.idMenu " +
            "INNER JOIN Productos  p on sm.idSubmen = p.submenu.idSubmen " +
            "WHERE rs.idRestaurante = :id" )
    Optional<Restaurante> findByMenu(@Param("id") Integer id);

}
