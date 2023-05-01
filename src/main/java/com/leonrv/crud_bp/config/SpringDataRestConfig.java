package com.leonrv.crud_bp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.leonrv.crud_bp.models.Categoria;
import com.leonrv.crud_bp.models.Model;
import com.leonrv.crud_bp.models.Product;
import com.leonrv.crud_bp.models.Venta;

@Configuration
public class SpringDataRestConfig implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(
            RepositoryRestConfiguration config, CorsRegistry cors) {

        cors.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("*");

        // it can be replaced with spring.data.rest.basePath=/api in properties
        config.setBasePath("/api/v1");

        config.exposeIdsFor(Model.class);
        config.exposeIdsFor(Product.class);
        config.exposeIdsFor(Categoria.class);
        config.exposeIdsFor(Venta.class);
    }


}