package com.eamr.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="estudiante")
public class Estudiante {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 150, nullable = false)
    private String nombres;

    @Column(length = 150, nullable = false)
    private String apellidos;

    @Column(length = 10, nullable = false)
    private String documento;

    private int edad;
}
