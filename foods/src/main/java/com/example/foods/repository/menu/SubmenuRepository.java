package com.example.foods.repository.menu;

import com.example.foods.entidades.dto.SubMenuResponseDTO;
import com.example.foods.entidades.menu.Menu;
import com.example.foods.entidades.menu.SubMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubmenuRepository extends JpaRepository<SubMenu, Integer> {

    @Query(value = "SELECT new com.example.foods.entidades.dto.SubMenuResponseDTO(sm.idSubmen, sm.nombre)" +
            "FROM SubMenu sm ")
    List<SubMenuResponseDTO> findSubMenuResponseDtoList();
}
