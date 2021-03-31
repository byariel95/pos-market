package com.market.posmarket.persistence.entities;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class ComprasProductoPK  implements Serializable {
    @Column(name = "SALES_id_sale")
    private  Integer idCompra;

    @Column(name = "PRODUCTS_id_product")
    private  Integer idProducto;

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }
}
