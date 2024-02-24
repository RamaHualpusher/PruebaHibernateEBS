package com.hibernate.Prueba.hibernate.EBS.service.impl;

import com.hibernate.Prueba.hibernate.EBS.entity.MaterialCurso;
import com.hibernate.Prueba.hibernate.EBS.repository.MaterialCursoRepository;
import com.hibernate.Prueba.hibernate.EBS.service.MaterialCursoService;
import org.springframework.stereotype.Service;

@Service
public class MaterialCursoServiceImpl extends GenericServiceImpl<MaterialCurso, Long> implements MaterialCursoService {
    public MaterialCursoServiceImpl(MaterialCursoRepository repository){
        super(repository);
    }
}
