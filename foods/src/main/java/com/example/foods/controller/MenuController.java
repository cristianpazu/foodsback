package com.example.foods.controller;

import com.example.foods.entidades.menu.Menu;
import com.example.foods.service.MenuService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/menu")
public class MenuController {


  MenuService menuService;

  @PostMapping("registrar/menu")
  public ResponseEntity<String> registrarMenu(@RequestBody Menu menu){
      return ResponseEntity.ok(menuService.registrarMenu(menu));
  }

    @GetMapping("traer/menu")
    public ResponseEntity<List<Menu>> traerMenu(){
        return ResponseEntity.ok(menuService.taerMenu());
    }

}
