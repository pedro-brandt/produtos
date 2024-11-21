package com.example.produtos.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.produtos.Model.Categoria;
import com.example.produtos.Model.Fornecedor;
import com.example.produtos.Model.Produto;
import com.example.produtos.Repository.FornecedorRepository;
import com.example.produtos.Repository.ProdutosRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ProdutosService {
    private final ProdutosRepository produtosRepository;

    @Autowired /* é tipo o BeforeEach */
    public ProdutosService(ProdutosRepository produtosRepository){
        this.produtosRepository = produtosRepository;
    }

    public Produto criarProdutos(Produto produtos){
        return produtosRepository.save(produtos);
    }

    public List<Produto> retornarProdutos(){
        return produtosRepository.findAll();
    }

    public Optional<Produto> retornarProdutosPorId(Integer id){
        return produtosRepository.findById(id);
    }

public Produto atualizProdutos(Integer id, Produto produto){
    return produtosRepository.findById(id)
        .map(produtoNaoAtualizada -> {
            produtoNaoAtualizada.setNome((produto.getNome() == null) ? produtoNaoAtualizada.getNome() : produto.getNome());
            produtoNaoAtualizada.setDescricao((produto.getDescricao() == null) ? produtoNaoAtualizada.getDescricao() : produto.getDescricao());
            produtoNaoAtualizada.setQualidade((produto.getQualidade() == null) ? produtoNaoAtualizada.getQualidade() : produto.getQualidade());
            produtoNaoAtualizada.setFornecedor((produto.getFornecedor() == null) ? produtoNaoAtualizada.getFornecedor() : produto.getFornecedor());
            produtoNaoAtualizada.setPreco((produto.getPreco() == 0) ? produtoNaoAtualizada.getPreco() : produto.getPreco());
            produtoNaoAtualizada.setCategoria((produto.getCategoria() == null) ? produtoNaoAtualizada.getCategoria() : produto.getCategoria());
            return produtosRepository.save(produtoNaoAtualizada);
        })
        .orElseThrow(() -> new EntityNotFoundException("Produtos não encontrada com o id: " + id));
    }

    public boolean deleteProduto(Integer id){
        try {
            produtosRepository.deleteById(id);
            return true;
        }catch(Exception e) {
            return false;
        }
    }

}
