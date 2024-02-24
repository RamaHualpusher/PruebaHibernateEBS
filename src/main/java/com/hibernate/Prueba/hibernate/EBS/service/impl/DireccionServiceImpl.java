package com.hibernate.Prueba.hibernate.EBS.service.impl;

import com.hibernate.Prueba.hibernate.EBS.entity.Direccion;
import com.hibernate.Prueba.hibernate.EBS.repository.DireccionRepository;
import com.hibernate.Prueba.hibernate.EBS.service.DireccionService;
import org.springframework.stereotype.Service;

@Service
public class DireccionServiceImpl extends GenericServiceImpl<Direccion, Long> implements DireccionService {
    public DireccionServiceImpl(DireccionRepository repository){
        super(repository);
    }
}
