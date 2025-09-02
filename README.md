# Atividade Prática - Sistema de Loja em Java

Projeto Java desenvolvido como atividade prática para o curso do **UniSENAI**.  
O objetivo é criar um sistema simples de **cadastro e gerenciamento de produtos** em uma loja, praticando **POO** (Programação Orientada a Objetos) e **listas dinâmicas** em Java.

---

## 📚 Estrutura do Projeto

- **Pacote `br.com.senai.entity`**  
  Contém a entidade principal do sistema:
  - `Produto`

- **Pacote `br.com.senai.service`**  
  Contém a classe responsável pela lógica de negócios e manipulação da lista de produtos:
  - `ProdutoService`

- **Pacote `br.com.senai.view`**  
  Responsável por exibir os menus e capturar entradas do usuário:
  - `ProdutoView`

- **Classe principal**  
  - `Application` (ponto de entrada do sistema, chama o menu de produtos)

---

## ✅ Funcionalidades Implementadas

Cada **Produto** possui:
- Atributos com modificador `private`:
  - `nome`
  - `preco`
  - `quantidadeEstoque`
- Métodos `get` e `set`
- Dois construtores:
  - Um vazio
  - Um com todos os atributos

A **camada de serviço (`ProdutoService`)** permite:
- Cadastrar produto
- Listar produtos
- Buscar produto por ID
- Editar produto
- Remover produto da lista

A **camada de visualização (`ProdutoView`)**:
- Oferece um menu interativo para o usuário
- Permite realizar as operações de cadastro, listagem, busca, edição e remoção
- Exibe mensagens formatadas no console

---

## 🎯 Objetivo da Atividade

1. Praticar a criação de pacotes organizados em Java.  
2. Aplicar conceitos de encapsulamento com atributos privados e métodos públicos.  
3. Utilizar **listas dinâmicas (`ArrayList`)** para armazenamento de dados.  
4. Desenvolver uma interface textual simples para interação com o usuário.  
5. Implementar métodos de manipulação de dados (CRUD).  

---

💡 *Se você gostou deste projeto, deixe uma ⭐ no repositório!*
