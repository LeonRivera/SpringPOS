package com.leonrv.crud_bp.models;
import java.io.*;
import java.util.*;
import javax.persistence.*;
import lombok.*;

@Entity @Data @NoArgsConstructor
public class Product implements Serializable{
    static final long serialVersionUID = 3L;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String codigo;
    
    @Column(unique = true)
    private String nombre;

    // Added 17012023 
    private Long cantidad;

    private Double precio;

    @Temporal(TemporalType.DATE)
    private Date fechaCreado;

    @ManyToOne
    private Categoria categoria;
}
