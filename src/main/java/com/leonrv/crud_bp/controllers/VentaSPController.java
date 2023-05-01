package com.leonrv.crud_bp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leonrv.crud_bp.models.Product;
import com.leonrv.crud_bp.services.IVentaSPService;


@RestController
@RequestMapping("/api/v1/ventasp")
@CrossOrigin("*")
public class VentaSPController {
    

    @Autowired
    IVentaSPService ventaSPService;

    @PostMapping
    public String restarProducto(@RequestBody List<Product> productos){




        // Agregar error cuando los productos se encuentren en 0
        productos.forEach(p -> {
        
            try {
                ventaSPService.restarCantidadProductoVenta(p.getId(), p.getCantidad()); 
            } catch (Exception e) {
                // TODO: handle exception
            }
        });

        


        return "";

    }
}
