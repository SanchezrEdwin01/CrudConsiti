package com.tutorial.crud.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Mensaje {
    private String mensaje;

    public Mensaje(String mensaje){
        this.mensaje = mensaje;
    }
}
