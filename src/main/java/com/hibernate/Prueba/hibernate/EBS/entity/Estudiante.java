package com.hibernate.Prueba.hibernate.EBS.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Estudiante extends Base{

    private String apellido;
    private String nombre;
    private LocalDate fechaNacimiento;
    private boolean quiereNewsletter;

    @Enumerated(EnumType.STRING)
    private Genero genero;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "direccion_id", referencedColumnName = "id")
    private Direccion direccion;

    @OneToMany(mappedBy = "estudiante")
    private List<Curso> cursosTomados = new ArrayList<>();

    // Getters y setters
}
