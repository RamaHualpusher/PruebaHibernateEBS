package com.hibernate.Prueba.hibernate.EBS.controller;
import com.hibernate.Prueba.hibernate.EBS.entity.Curso;
import com.hibernate.Prueba.hibernate.EBS.service.CursoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/curso")
public class CursoController extends GenericController<Curso,Long>{
    public CursoController(CursoService service){
        super(service);
    }
}
