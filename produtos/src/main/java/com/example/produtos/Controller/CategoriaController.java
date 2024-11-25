package com.example.produtos.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.produtos.Model.Categoria;
import com.example.produtos.Model.Produto;
import com.example.produtos.Service.CategoriaService;
import com.example.produtos.Service.ProdutosService;

@RestController
@RequestMapping("categoria")
public class CategoriaController {
   private final CategoriaService categoriaService;
   
   @Autowired
   public CategoriaController(CategoriaService categoriaService){
    this.categoriaService = categoriaService;
   }

   @PostMapping
   public ResponseEntity<Categoria> postCategoria(@RequestBody Categoria categoria){
    Categoria novCategoria = categoriaService.criarCategoria(categoria);
    return ResponseEntity.status(HttpStatus.CREATED).body(novaCategoria);
   }

   @GetMapping
   public ResponseEntity<List<Categoria>> getCategoria(){
    List<Categoria> listaDeCategoria = categoriaService.retornarCategorias();
    return ResponseEntity.status(HttpStatus.OK).body(listaDeCategoria);
   }
}
