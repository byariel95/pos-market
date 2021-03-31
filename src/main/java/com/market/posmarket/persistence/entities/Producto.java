package com.market.posmarket.persistence.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "products")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private  Integer idProducto;

    @Column(name = "name")
    private  String nombre;

    @Column(name = "bar_code")
    private  String codigoBarras;

    @Column(name = "price")
    private Double precio;

    @Column(name = "quantity")
    private Integer cantidad;

    @Column(name = "state")
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "id_category", insertable = false, updatable = false)
    private Categoria categoria;

    @Column(name = "id_category")
    private Integer idCategoria;

    @OneToMany(mappedBy = "producto")
    private List<ComprasProducto> productos;

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<ComprasProducto> getProductos() {
        return productos;
    }

    public void setProductos(List<ComprasProducto> productos) {
        this.productos = productos;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }


}
