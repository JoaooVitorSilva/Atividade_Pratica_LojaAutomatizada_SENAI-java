package br.com.senai.entity;

public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto() {
    }

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void exibirInformacoes() {
        System.out.printf("Produto: %s | Preço: R$ %.2f | Estoque: %d\n",
                nome, preco, quantidadeEstoque);
    }

    public void vender(int quantidade) {
        if (quantidade > quantidadeEstoque) {
            System.out.println("Estoque insuficiente!!!");
        } else {
            quantidadeEstoque -= quantidade;
            System.out.println("Venda realizada com sucesso!");
        }
    }

    public void reporEstoque(int quantidade) {
        quantidadeEstoque += quantidade;
        System.out.println("Estoque reposto com sucesso!");
    }
}
