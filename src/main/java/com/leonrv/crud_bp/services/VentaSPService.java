package com.leonrv.crud_bp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonrv.crud_bp.repositories.IVentaRepository;


@Service
public class VentaSPService implements IVentaSPService{
    @Autowired
    IVentaRepository ventaRepository;

    @Override
    public int restarCantidadProductoVenta(Long idProducto, Long cantidad) {
        return ventaRepository.restarCantidadProductoVenta(idProducto, cantidad);
    }
}
