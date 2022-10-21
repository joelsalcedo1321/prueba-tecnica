package com.nexosotware.service;

import com.nexosotware.bean.BeanEmpleadoRepository;
import com.nexosotware.model.Empleado;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "empleadoservice")
public class EmpleadoService {
    public List<Empleado> listaEmpleados = new ArrayList<>();
    private Long id;

    private String documentoTipo;

    private Integer documentoNumero;

    private String nombres;

    private String apellidos;

    private Long departamentosId;

    private String ciudad;

    private String direccion;

    private String correoElectronico;

    private String telefono;

    private LocalDate fechaHoraCrea;

    private LocalDate fechaHoraModifica;

    @EJB
    private BeanEmpleadoRepository empleadoRepository;

    public void save() {
        Empleado empleado = new Empleado();
        empleado.setDocumentoTipo(getDocumentoTipo());
        empleado.setDocumentoNumero(getDocumentoNumero());
        empleado.setNombres(getNombres());
        empleado.setApellidos(getApellidos());
        this.empleadoRepository.save(empleado);
    }

    public List<Empleado> getListaEmpleados() {
        return this.empleadoRepository.queryEmpleado();
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDocumentoTipo() {
        return documentoTipo;
    }

    public void setDocumentoTipo(String documentoTipo) {
        this.documentoTipo = documentoTipo;
    }

    public Integer getDocumentoNumero() {
        return documentoNumero;
    }

    public void setDocumentoNumero(Integer documentoNumero) {
        this.documentoNumero = documentoNumero;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Long getDepartamentosId() {
        return departamentosId;
    }

    public void setDepartamentosId(Long departamentosId) {
        this.departamentosId = departamentosId;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFechaHoraCrea() {
        return fechaHoraCrea;
    }

    public void setFechaHoraCrea(LocalDate fechaHoraCrea) {
        this.fechaHoraCrea = fechaHoraCrea;
    }

    public LocalDate getFechaHoraModifica() {
        return fechaHoraModifica;
    }

    public void setFechaHoraModifica(LocalDate fechaHoraModifica) {
        this.fechaHoraModifica = fechaHoraModifica;
    }
}
