package com.example.foods.service.impl;

import com.example.foods.entidades.dto.MenuDTO;
import com.example.foods.entidades.dto.ProductoDTO;
import com.example.foods.entidades.dto.RestauranteDTO;
import com.example.foods.entidades.dto.SubMenuDTO;
import com.example.foods.entidades.menu.Menu;
import com.example.foods.entidades.menu.Restaurante;
import com.example.foods.repository.menu.RestauranteRepository;
import com.example.foods.service.RestauranteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestauranteServiceImpl implements RestauranteService {
    @Autowired
    RestauranteRepository restauranteRepository;

    @Override
    public Restaurante registrarRestaurante(Restaurante restaurante) {

        Restaurante restaurante1 =   restauranteRepository.save(restaurante);

        return restaurante1;
    }

    @Override
    public Restaurante traerRestaurantesId(Integer id) {
        try {
            Restaurante traerId = restauranteRepository.findById(id).orElseThrow();

            return traerId;
        }catch (Exception e){
            throw new RuntimeException("No se encontraron la informacion");
        }

    }

    @Override
    public List<Restaurante> traerRestaurantes() {
        try{


            List<Restaurante> restaurante = restauranteRepository.findAll();

            if (restaurante.isEmpty()){
                throw new RuntimeException("La lista esta vacia");
            }

            return restaurante;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public RestauranteDTO traerMenuTodo(Integer id) {


        Restaurante r = restauranteRepository.findByMenu(id)
                .orElseThrow(() -> new RuntimeException("No existe"));

        RestauranteDTO restauranteDTO = new RestauranteDTO();
        restauranteDTO.setId(r.getIdRestaurante());
        restauranteDTO.setNombres(r.getNombre());
        if (r.getMenus().isEmpty()) {
            throw new RuntimeException("No tiene menus");
        }




        List<MenuDTO> menusDTO = r.getMenus().stream()
                .map(menu -> {

                    MenuDTO menuDTO = new MenuDTO();

                    menuDTO.setNombreMenu(menu.getNombreMenu());
                    menuDTO.setActivo(menu.getActivo());

                    List<SubMenuDTO> submenus = menu.getSubmenus().stream()
                            .map(sm -> {

                                SubMenuDTO smDTO = new SubMenuDTO();
                                smDTO.setIdSubmenu(sm.getIdSubmen());
                                smDTO.setNombre(sm.getNombre());

                                List<ProductoDTO> productos = sm.getProductos().stream()
                                        .map(p -> new ProductoDTO(
                                                p.getIdProductos(),
                                                p.getNombre(),
                                                p.getDescripcion(),
                                                p.getPrecio()
                                        )).toList();

                                smDTO.setProductos(productos);
                                return smDTO;

                            }).toList();

                    menuDTO.setSubmenu(submenus);
                    return menuDTO;

                }).toList();

        restauranteDTO.setMenus(menusDTO);

        return restauranteDTO;
    }
}
