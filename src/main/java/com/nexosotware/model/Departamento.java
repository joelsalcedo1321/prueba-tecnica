package com.nexosotware.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String departamentoCodigo;

    private String departamentoNombre;

    private LocalDate fechaHoraCrea;

    private LocalDate fechaHoraModifica;

}
