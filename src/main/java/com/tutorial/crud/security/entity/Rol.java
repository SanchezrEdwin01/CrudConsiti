package com.tutorial.crud.security.entity;

import javax.validation.constraints.NotNull;

import com.tutorial.crud.security.enums.RolNombre;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "rol")
@Data
@NoArgsConstructor
public class Rol implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Enumerated(EnumType.STRING)
    private RolNombre rolNombre;

    public Rol(@NotNull RolNombre rolNombre){
        this.rolNombre = rolNombre;
    }
}
