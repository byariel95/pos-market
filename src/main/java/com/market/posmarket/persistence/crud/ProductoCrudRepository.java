package com.market.posmarket.persistence.crud;

import com.market.posmarket.persistence.entities.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;


public interface ProductoCrudRepository extends CrudRepository<Producto,Integer> {
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    Optional<List<Producto>>findByCantidadLessThanAndEstado(int cantidad , boolean estado );
}
