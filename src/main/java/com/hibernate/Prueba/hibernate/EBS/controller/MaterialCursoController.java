package com.hibernate.Prueba.hibernate.EBS.controller;
import com.hibernate.Prueba.hibernate.EBS.entity.MaterialCurso;
import com.hibernate.Prueba.hibernate.EBS.service.MaterialCursoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/material-curso")
public class MaterialCursoController extends GenericController<MaterialCurso,Long>{
    public MaterialCursoController(MaterialCursoService service){
        super(service);
    }
}
