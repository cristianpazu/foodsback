package com.example.foods.entidades.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class HistorialPedidoDTO {

    Integer idPedido;

    String nombreMesa;

    String nombreProducto;

    Integer precio;

    Integer cantidad;

    LocalDate fecha;

    String hora;

    Integer totalCuenta;

    public HistorialPedidoDTO() {
    }

    public HistorialPedidoDTO(Integer idPedido, String nombreMesa, String nombreProducto, Integer precio, Integer cantidad, LocalDate fecha, String hora,Integer totalCuenta) {
        this.idPedido = idPedido;
        this.nombreMesa = nombreMesa;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.hora = hora;
        this.totalCuenta = totalCuenta;
    }
}
