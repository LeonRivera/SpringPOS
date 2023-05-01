package com.leonrv.crud_bp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonrv.crud_bp.repositories.IVentaRepository;

public interface IVentaSPService {
    
    int restarCantidadProductoVenta(Long idProducto, Long cantidad);

}
