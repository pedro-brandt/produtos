package com.example.produtos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.produtos.Model.Fornecedor;
import com.example.produtos.Model.Usuario;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Integer> {
    
}
