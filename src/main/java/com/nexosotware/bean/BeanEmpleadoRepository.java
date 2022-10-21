package com.nexosotware.bean;

import com.nexosotware.model.Empleado;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Singleton
public class BeanEmpleadoRepository {

    private List<Empleado> empleados;
    @PersistenceContext(unitName = "persistenceUnit")
    private EntityManager em;

    @PostConstruct
    public void initCache() {
        this.empleados = queryEmpleado();
        if (empleados == null)
            empleados = new ArrayList<>();
    }

    public void delete() {

        this.empleados.clear();
    }

    public void save(Empleado empleado) {
        em.persist(empleado);
        this.empleados.add(empleado);
    }

    public void update(String key, String value) {
        Empleado p = new Empleado();
        em.persist(p);

        this.empleados.add(p);
    }

    public List<Empleado> getEmpleadosCache() {
        return empleados;
    }

    public List<Empleado> queryEmpleado() {
        Query query = em.createQuery("FROM Empleado");

        List<Empleado> list = query.getResultList();
        return list;
    }
}