package com.leonrv.crud_bp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.leonrv.crud_bp.models.*;

@RepositoryRestResource(path = "categoria")
public interface ICategoriaRepository extends JpaRepository<Categoria, Long>{}
