package com.example.produtos.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.produtos.Model.Produto;
import com.example.produtos.Model.Usuario;
import com.example.produtos.Service.ProdutosService;
import com.example.produtos.Service.UsuarioService;

@RestController
@RequestMapping("usuario")
public class UsuarioController {
   private final UsuarioService usuarioService;

     @Autowired
   public UsuarioController(UsuarioService usuarioService){
    this.usuarioService = usuarioService;
   }

   @PostMapping
   public ResponseEntity<Usuario> postUsuario(@RequestBody Usuario usuario){
    Usuario novoUsuario = usuarioService.criarUsuarios(usuario);
    return ResponseEntity.status(HttpStatus.CREATED).body(novoUsuario);
   }

      @GetMapping
   public ResponseEntity<List<Usuario>> getUsuario(){
    List<Usuario> listaDeUsuarios = usuarioService.retornarUsuario();
    return ResponseEntity.status(HttpStatus.OK).body(listaDeUsuarios);
    
    }
}
