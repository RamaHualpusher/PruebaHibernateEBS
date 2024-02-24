package com.hibernate.Prueba.hibernate.EBS.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class MaterialCurso extends Base{

    private String url;

    @OneToOne(mappedBy = "materialCurso")
    @JsonIgnoreProperties("materialCurso")
    private Curso curso;

    // Getters y setters
}
