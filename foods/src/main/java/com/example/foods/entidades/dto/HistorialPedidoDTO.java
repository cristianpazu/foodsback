package com.example.foods.entidades.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HistorialPedidoDTO {

    Integer idPedido;

    String nombreMesa;

    String nombreProducto;

    Integer predio;

    Integer cantidad;

    String fecha;

    Integer totalCuenta;

    public HistorialPedidoDTO() {
    }

    public HistorialPedidoDTO(Integer idPedido, String nombreMesa, String nombreProducto, Integer predio, Integer cantidad, String fecha, Integer totalCuenta) {
        this.idPedido = idPedido;
        this.nombreMesa = nombreMesa;
        this.nombreProducto = nombreProducto;
        this.predio = predio;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.totalCuenta = totalCuenta;
    }
}
