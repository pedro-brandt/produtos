package com.example.produtos.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.produtos.Model.Fornecedor;
import com.example.produtos.Model.Produto;
import com.example.produtos.Service.FornecedorService;
import com.example.produtos.Service.ProdutosService;

@RestController
@RequestMapping("fornecedor")
public class FornecedorController {
   private final FornecedorService fornecedorService;
   
   @Autowired
   public FornecedorController(FornecedorService fornecedorService){
    this.fornecedorService = fornecedorService;
   }

   @PostMapping
   public ResponseEntity<Fornecedor> postFornecedor(@RequestBody Fornecedor fornecedor){
    Fornecedor novoFornecedor = fornecedorService.criarFornecedor(fornecedor);
    return ResponseEntity.status(HttpStatus.CREATED).body(novoFornecedor);
   }

   @GetMapping
   public ResponseEntity<List<Fornecedor>> getFornecedor(){
    List<Fornecedor> listaDeFornecedor = fornecedorService.retornarFornecedors();
    return ResponseEntity.status(HttpStatus.OK).body(listaDeFornecedor);
   }
}
