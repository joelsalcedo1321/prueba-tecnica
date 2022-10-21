package com.nexosotware.service;

import com.nexosotware.bean.BeanDepartamentoRepository;
import com.nexosotware.model.Departamento;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import java.util.List;

@ManagedBean(name="departamentoservice")
public class DeparmentoService {
    @EJB
    private BeanDepartamentoRepository departamentoRepository;

    private List<Departamento> listarDepartamento(){
        return this.departamentoRepository.queryDepartamento();
    }

    private void save(Departamento departamento){
        this.departamentoRepository.save(departamento);
    }
}