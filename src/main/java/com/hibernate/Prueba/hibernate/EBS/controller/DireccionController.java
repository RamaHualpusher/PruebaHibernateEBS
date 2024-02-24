package com.hibernate.Prueba.hibernate.EBS.controller;
import com.hibernate.Prueba.hibernate.EBS.entity.Direccion;
import com.hibernate.Prueba.hibernate.EBS.service.DireccionService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/direccion")
public class DireccionController extends GenericController<Direccion,Long>{
    public DireccionController(DireccionService service){
        super(service);
    }
}
