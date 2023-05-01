
package com.leonrv.crud_bp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.leonrv.crud_bp.models.*;

@RepositoryRestResource(path = "product")
// @CrossOrigin
public interface IProductRepository extends JpaRepository<Product, Long>{
    @RestResource(path = "name", rel = "name")
    Product findByNombre(String name); //Exact coincidence

    @RestResource(path = "codigo", rel = "codigo")
    Product findByCodigo(String codigo);
}