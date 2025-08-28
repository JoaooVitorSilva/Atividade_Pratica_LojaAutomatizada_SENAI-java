package br.com.senai.service;

import br.com.senai.entity.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoService {

    private List<Produto> produtos = new ArrayList<>();

    public Produto cadastrarProduto(String nome, double preco, int quantidade) {
        Produto produto = new Produto(nome, preco, quantidade);
        produtos.add(produto);
        return produto;
    }

    public List<Produto> listarProdutos() {
        return produtos;
    }

    public Produto buscarProduto(int id) {
        if (id < 0 || id >= produtos.size()) {
            System.out.println("Produto não encontrado!");
            return null;
        }
        return produtos.get(id);
    }

    public void venderProduto(int id, int quantidade) {
        Produto produto = buscarProduto(id);
        if (produto != null) {
            produto.vender(quantidade);
        }
    }

    public void reporProduto(int id, int quantidade) {
        Produto produto = buscarProduto(id);
        if (produto != null) {
            produto.reporEstoque(quantidade);
        }
    }

    public void removerProduto(int id) {
        if (id < 0 || id >= produtos.size()) {
            System.out.println("Produto não encontrado!");
            return;
        }
        produtos.remove(id);
        System.out.println("Produto removido com sucesso!");
    }

    public void editarProduto(int id, Produto novoProduto) {
        if (id < 0 || id >= produtos.size()) {
            System.out.println("Produto não encontrado!");
            return;
        }
        produtos.set(id, novoProduto);
        System.out.println("Produto editado com sucesso!");
    }
}
