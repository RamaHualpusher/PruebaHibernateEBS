package com.hibernate.Prueba.hibernate.EBS.service.impl;

import com.hibernate.Prueba.hibernate.EBS.entity.Curso;
import com.hibernate.Prueba.hibernate.EBS.exception.ServiceException;
import com.hibernate.Prueba.hibernate.EBS.repository.CursoRepository;
import com.hibernate.Prueba.hibernate.EBS.service.CursoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CursoServiceImpl extends GenericServiceImpl<Curso, Long> implements CursoService {
    public CursoServiceImpl(CursoRepository repository){
        super(repository);
    }
    @Override
    @Transactional
    public Curso save(Curso entity) throws ServiceException {
        try {
            if(entity.getActivo()==null){
                entity.setActivo(true);
            }
            if(entity.getMaterialCurso().getActivo()==null){
                entity.getMaterialCurso().setActivo(true);
            }
            entity = genericRepository.save(entity);
            return entity;
        }catch (Exception e) {
            throw new ServiceException(e.getMessage());
        }
    }
}
