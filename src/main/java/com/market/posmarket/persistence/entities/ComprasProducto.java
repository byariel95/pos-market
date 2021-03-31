package com.market.posmarket.persistence.entities;

import javax.persistence.*;

@Entity
@Table(name = "sales_products")
public class ComprasProducto {
    @EmbeddedId
    private  ComprasProductoPK id;

    @Column(name = "quantity")
    private  Integer cantidad;

    private  Double total;

    @Column(name = "state")
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "SALES_id_sale", insertable = false, updatable = false)
    private Compra compra;


    @ManyToOne
    @JoinColumn(name = "PRODUCTS_id_product", insertable = false, updatable = false)
    private Producto producto;


    public ComprasProductoPK getId() {
        return id;
    }

    public void setId(ComprasProductoPK id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
