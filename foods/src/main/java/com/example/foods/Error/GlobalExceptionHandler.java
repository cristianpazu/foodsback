package com.example.foods.Error;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.ResponseStatusException;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResponseStatusException.class)
    public ResponseEntity<Map<String, Object>> manejarResponseStatusException(
            ResponseStatusException ex) {

        Map<String, Object> respuesta = new HashMap<>();

        respuesta.put("status", ex.getStatusCode().value());
        respuesta.put("message", ex.getReason());

        return ResponseEntity
                .status(ex.getStatusCode())
                .body(respuesta);
    }
}
