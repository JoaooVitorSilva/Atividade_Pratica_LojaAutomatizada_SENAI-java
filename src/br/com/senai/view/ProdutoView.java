package br.com.senai.view;

import br.com.senai.entity.Produto;
import br.com.senai.service.ProdutoService;

import java.util.List;
import java.util.Scanner;

public class ProdutoView {

    private Scanner tec = new Scanner(System.in);
    private ProdutoService produtoService = new ProdutoService();

    public void menu() {
        boolean exec = true;

        do {
            System.out.println("\n--- MENU PRODUTOS ---");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Buscar Produto");
            System.out.println("4 - Vender Produto");
            System.out.println("5 - Repor Produto");
            System.out.println("6 - Remover Produto");
            System.out.println("7 - Editar Produto");
            System.out.println("9 - Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = tec.nextInt();
            tec.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    listarProdutos();
                    break;
                case 3:
                    buscarProduto();
                    break;
                case 4:
                    venderProduto();
                    break;
                case 5:
                    reporProduto();
                    break;
                case 6:
                    removerProduto();
                    break;
                case 7:
                    editarProduto();
                    break;
                case 9:
                    exec = false;
                    System.out.println("Sistema finalizado...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (exec);
    }

    private void cadastrarProduto() {
        System.out.print("Nome: ");
        String nome = tec.nextLine();
        System.out.print("Preço: ");
        double preco = tec.nextDouble();
        System.out.print("Quantidade: ");
        int qtd = tec.nextInt();
        tec.nextLine();

        produtoService.cadastrarProduto(nome, preco, qtd);
        System.out.println("Produto cadastrado com sucesso!");
    }

    private void listarProdutos() {
        List<Produto> produtos = produtoService.listarProdutos();
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado!");
        } else {
            for (int i = 0; i < produtos.size(); i++) {
                System.out.print("ID " + i + " - ");
                produtos.get(i).exibirInformacoes();
            }
        }
    }

    private void buscarProduto() {
        System.out.print("Informe o ID: ");
        int id = tec.nextInt();
        tec.nextLine();
        Produto produto = produtoService.buscarProduto(id);
        if (produto != null) {
            produto.exibirInformacoes();
        }
    }

    private void venderProduto() {
        System.out.print("Informe o ID: ");
        int id = tec.nextInt();
        System.out.print("Quantidade: ");
        int qtd = tec.nextInt();
        tec.nextLine();
        produtoService.venderProduto(id, qtd);
    }

    private void reporProduto() {
        System.out.print("Informe o ID: ");
        int id = tec.nextInt();
        System.out.print("Quantidade: ");
        int qtd = tec.nextInt();
        tec.nextLine();
        produtoService.reporProduto(id, qtd);
    }

    private void removerProduto() {
        System.out.print("Informe o ID: ");
        int id = tec.nextInt();
        tec.nextLine();
        produtoService.removerProduto(id);
    }

    private void editarProduto() {
        System.out.print("Informe o ID: ");
        int id = tec.nextInt();
        tec.nextLine();

        Produto novoProduto = new Produto();

        System.out.print("Novo Nome: ");
        novoProduto.setNome(tec.nextLine());
        System.out.print("Novo Preço: ");
        novoProduto.setPreco(tec.nextDouble());
        System.out.print("Nova Quantidade: ");
        novoProduto.setQuantidadeEstoque(tec.nextInt());
        tec.nextLine();

        produtoService.editarProduto(id, novoProduto);
    }
}
