package com.hibernate.Prueba.hibernate.EBS.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Curso extends Base{

    private String titulo;

    @ManyToOne
    private Profesor profesor;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "material_curso_id", referencedColumnName = "id")
    @JsonIgnoreProperties("curso")
    private MaterialCurso materialCurso;

    @ManyToOne
    private Estudiante estudiante;

    // Getters y setters
}
