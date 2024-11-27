// package com.example.produtos;

// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;

// import com.example.produtos.Model.Produto;


// public class ProdutoTeste {

//     private Produto produto;

//     @BeforeEach
//     public void funcaoASerExecutadaAntes(){
//         produto = new Produto(1000, "TV", "aparelho eletronico", "Boa", 509.99, "lazer", "LG"); 
//     }

//     @Test
//     public void testeGetIdentificador(){
//         assertEquals(1000, produto.getIndentificador());
//     }

//     @Test
//     public void testeGetDescricao(){
//         assertEquals("aparelho eletronico", produto.getDescricao());
//     }

//     @Test
//     public void testeGetPreco(){
//         assertEquals(509.99, produto.getPreco());
//     }

//     @Test
//     public void testeSetNome(){
//         produto.setNome("TV HD");
//         assertEquals("TV HD", produto.getNome());
//     }

//     @Test
//     public void testeSetCategoria(){
//         produto.setCategoria("Intreterimento");
//         assertEquals("Intreterimento", produto.getCategoria());
//     }


// }