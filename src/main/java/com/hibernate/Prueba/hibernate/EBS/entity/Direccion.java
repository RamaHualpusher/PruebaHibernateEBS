package com.hibernate.Prueba.hibernate.EBS.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Direccion extends Base{

    private String calle;
    private String numero;
    private String ciudad;

    // Getters y setters
}
