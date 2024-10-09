package com.example.produtos.Model;
/*Pessoa -> classe */
public class Produto {

/* atributos */
int indentificador;
String nome;
String descricao;
String qualidade;
double preco;
String categoria;
String fornecedor;


/*Construtor */
    public Produto(int indentificador, String nome, String descricao, String qualidade, double preco, String categoria, String fornecedor){
        

    /*inicializadores */
    this.indentificador = indentificador;
    this.nome = nome;
    this.descricao = descricao;
    this.qualidade = qualidade;
    this.preco = preco;
    this.categoria = categoria;
    this.fornecedor = fornecedor;




    }


    public int getIndentificador(){
        return indentificador;   
    }
    public String getNome(){
        return nome;   
    }
    public String getDescricao(){
        return descricao;   
    }
    public String getQualidade(){
        return qualidade; 
    }
    public double getPreco(){
        return preco;
    }
    public String getCategoria(){
        return categoria;
    }
    public String getFornecedor(){
        return fornecedor;
    }

    /*Estou apenas criando os seters */
    public void setIdentificador(int identificador){
        this.indentificador = identificador;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public void setQualidade(String qualidade){
        this.qualidade = qualidade;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
        }
        public void setFornecedor(String fornecedor){
        this.fornecedor = fornecedor;

    }
}



/*void -> nao retorna */
/*static ->retorna */