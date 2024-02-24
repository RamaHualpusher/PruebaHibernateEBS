package com.hibernate.Prueba.hibernate.EBS.service.impl;

import com.hibernate.Prueba.hibernate.EBS.entity.Estudiante;
import com.hibernate.Prueba.hibernate.EBS.exception.ServiceException;
import com.hibernate.Prueba.hibernate.EBS.repository.EstudianteRepository;
import com.hibernate.Prueba.hibernate.EBS.service.EstudianteService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EstudianteServiceImpl extends GenericServiceImpl<Estudiante, Long> implements EstudianteService {
    public EstudianteServiceImpl(EstudianteRepository repository){
        super(repository);
    }

    @Override
    @Transactional
    public Estudiante save(Estudiante entity) throws ServiceException {
        try {
            if(entity.getActivo()==null){
                entity.setActivo(true);
            }
            if(entity.getDireccion().getActivo()==null){
                entity.getDireccion().setActivo(true);
            }
            entity = genericRepository.save(entity);
            return entity;
        }catch (Exception e) {
            throw new ServiceException(e.getMessage());
        }
    }
}
