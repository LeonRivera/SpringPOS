package com.leonrv.crud_bp.models;

import java.util.List;

import java.io.*;
import java.util.*;
import javax.persistence.*;
import lombok.*;

@Entity @Data @NoArgsConstructor
public class Venta implements Serializable{

    

    
    static final long serialVersionUID = 3L;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Product> products;

    private double total;


    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCompra;

}
