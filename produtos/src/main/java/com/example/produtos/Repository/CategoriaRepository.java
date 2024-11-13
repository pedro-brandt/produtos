package com.example.produtos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.produtos.Model.Categoria;
import com.example.produtos.Model.Usuario;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
    
}
