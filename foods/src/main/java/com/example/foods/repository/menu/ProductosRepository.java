package com.example.foods.repository.menu;

import com.example.foods.entidades.dto.ProductoResponseDTO;
import com.example.foods.entidades.menu.Menu;
import com.example.foods.entidades.menu.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductosRepository extends JpaRepository<Productos, Integer> {



    @Query(value = "SELECT new com.example.foods.entidades.dto.ProductoResponseDTO(  p.idProductos," +
            "p.Nombre, " +
            "p.Descripcion, " +
            "p.Precio, " +
            "p.activo, " +
            "p.submenu.idSubmen)" +
            "  FROM Productos p" )
    List<ProductoResponseDTO> findProductoResponseDtos();

}
