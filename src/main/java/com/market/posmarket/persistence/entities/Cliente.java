package com.market.posmarket.persistence.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customers")
public class Cliente {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_custumer")
    private  Integer idCliente;

    @Column(name = "name")
    private  String  nombre;

    @Column(name = "lastName")
    private  String  apellido;

    @Column(name = "phone")
    private  String  telefono;

    @Column(name = "address")
    private  String  direccion;

    @Column(name = "email")
    private  String  correoElectronico;

    @OneToMany(mappedBy = "cliente")
    private List<Compra> compras;

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
}
