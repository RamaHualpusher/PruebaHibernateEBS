package com.hibernate.Prueba.hibernate.EBS.controller;

import com.hibernate.Prueba.hibernate.EBS.entity.Profesor;
import com.hibernate.Prueba.hibernate.EBS.service.ProfesorService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/profesor")
public class ProfesorController extends GenericController<Profesor,Long>{
    public ProfesorController(ProfesorService service){
        super(service);
    }
}
