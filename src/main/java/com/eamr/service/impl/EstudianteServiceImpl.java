package com.eamr.service.impl;

import com.eamr.model.Estudiante;
import com.eamr.repo.IEstudianteRepo;
import com.eamr.repo.IGenericRepo;
import com.eamr.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteServiceImpl extends CRUDImpl<Estudiante,Long> implements IEstudianteService {

    @Autowired
    private IEstudianteRepo repo;

    @Override
    protected IGenericRepo<Estudiante, Long> getRepo() {
        return repo;
    }
}
