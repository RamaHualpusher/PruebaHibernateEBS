package com.hibernate.Prueba.hibernate.EBS.service.impl;

import com.hibernate.Prueba.hibernate.EBS.entity.Profesor;
import com.hibernate.Prueba.hibernate.EBS.repository.ProfesorRepository;
import com.hibernate.Prueba.hibernate.EBS.service.ProfesorService;
import org.springframework.stereotype.Service;

@Service
public class ProfesorServiceImpl extends GenericServiceImpl<Profesor,Long> implements ProfesorService {
    public ProfesorServiceImpl(ProfesorRepository repository){
        super(repository);
    }
}
