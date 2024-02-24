package com.hibernate.Prueba.hibernate.EBS.controller;
import com.hibernate.Prueba.hibernate.EBS.entity.Estudiante;
import com.hibernate.Prueba.hibernate.EBS.service.EstudianteService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/estudiante")
public class EstudianteController extends GenericController<Estudiante,Long>{
    public EstudianteController(EstudianteService service){
        super(service);
    }
}
