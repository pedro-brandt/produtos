package com.example.produtos.Model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Fornecedor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int identificador;

    @Column(nullable = false)
    private String nome;

    @Column
    private String CNPJ;

    @Column(nullable = false)
    private String CPF;

    
    private List<Produto> produtos;

}
