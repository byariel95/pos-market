package com.market.posmarket.persistence.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categories")
public class Categoria {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_category")
    private  Integer idCategoria;

    @Column(name = "description")
    private  String  descripcion;

    @Column(name = "state")
    private Boolean estado;

    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }



}