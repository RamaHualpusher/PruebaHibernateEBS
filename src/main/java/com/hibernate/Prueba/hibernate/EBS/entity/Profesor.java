package com.hibernate.Prueba.hibernate.EBS.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Profesor extends Base{

    private String apellido;
    private String nombre;

    @OneToMany(mappedBy = "profesor")
    private List<Curso> cursosImpartidos = new ArrayList<>();

    // Getters y setters
}
