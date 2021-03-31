package com.market.posmarket.persistence.mapper;
import com.market.posmarket.domain.Product;
import com.market.posmarket.persistence.entities.Producto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring",uses = {CategoryMapper.class})
public interface ProductMapper {
    @Mappings({
            @Mapping(source = "idProducto",target = "productId"),
            @Mapping(source = "nombre",target = "name"),
            @Mapping(source = "precio",target = "price"),
            @Mapping(source = "cantidad",target = "stock"),
            @Mapping(source = "estado",target = "active"),
            @Mapping(source = "idCategoria",target = "categoryId"),
            @Mapping(source = "categoria",target = "category"),
    })
    Product toProduct(Producto producto);
    List<Product> toProducts(List<Producto> productos);

    @InheritInverseConfiguration
    @Mapping(target = "codigoBarras", ignore = true)
    Producto toProducto(Product product);

}
