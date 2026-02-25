package com.example.foods.controller;

import com.example.foods.entidades.menu.Restaurante;
import com.example.foods.entidades.menu.SubMenu;
import com.example.foods.service.SubMenuService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/submenu")
public class SubmenuController {

    SubMenuService subMenuService;

    @PostMapping("/registrar/submenu")
    public ResponseEntity<SubMenu> registrarSubmenu(@RequestBody SubMenu subMenu){
        return ResponseEntity.ok(subMenuService.registrarSubmenu(subMenu));
    }



    @GetMapping("/traer/submenus")
    public ResponseEntity<List<SubMenu>> treaerSubmenu() {
        return ResponseEntity.ok(subMenuService.traerSubmenu());

    }
}
