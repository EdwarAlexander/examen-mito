package com.eamr.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EstudianteDTO {
    private Integer id;
    private String nombresEstudiante;
    private String apellidosEStudiante;
    private String documentoEstudiante;
    private int edadEstudiante;
}
