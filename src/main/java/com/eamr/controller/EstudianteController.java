package com.eamr.controller;

import com.eamr.dto.EstudianteDTO;
import com.eamr.model.Estudiante;
import com.eamr.service.IEstudianteService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    @Autowired
    private IEstudianteService service;

    @Autowired
    @Qualifier("estudianteMapper")
    private ModelMapper mapper;

    @GetMapping
    public ResponseEntity<List<EstudianteDTO>> getAllEstudiantes() throws Exception{
        List<EstudianteDTO> listDTO = service.readAll().stream().map(est-> mapper.map(est,EstudianteDTO.class)).collect(Collectors.toList());
        return new ResponseEntity<>(listDTO, HttpStatus.OK);
    }
}
