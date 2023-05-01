package com.leonrv.crud_bp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.leonrv.crud_bp.models.*;

@RepositoryRestResource(path = "venta")
public interface IVentaRepository extends JpaRepository<Venta, Long>{


    @Query(nativeQuery = true, value="call venta_inv(:id_producto,:cantidad)")
    int restarCantidadProductoVenta(@Param("id_producto") Long idProducto, @Param("cantidad") Long cantidad);
}
