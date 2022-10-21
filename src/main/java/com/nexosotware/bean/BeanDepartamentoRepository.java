package com.nexosotware.bean;

import com.nexosotware.model.Departamento;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class BeanDepartamentoRepository {

    private List<Departamento> departamentos;
    @PersistenceContext(unitName = "persistenceUnit")
    private EntityManager em;

    @PostConstruct
    public void initCache() {
        this.departamentos = queryDepartamento();
        if (departamentos == null)
            departamentos = new ArrayList<>();
    }

    public void delete() {

        this.departamentos.clear();
    }

    public void save(Departamento departamento) {
        em.persist(departamento);
        this.departamentos.add(departamento);
    }

    public void update(String key, String value) {
        Departamento p = new Departamento();
        em.persist(p);

        this.departamentos.add(p);
    }

    public List<Departamento> getDepartamentosCache() {
        return departamentos;
    }

    public List<Departamento> queryDepartamento() {
        Query query = em.createQuery("FROM com.sample.model.Departamento");

        List<Departamento> list = query.getResultList();
        return list;
    }
}