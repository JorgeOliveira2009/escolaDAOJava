# Projeto Escola utilizando DAO - java + JDBC

Este projeto foi desenvolvido para demonstrar na prática como funciona a arquitetuta **arquitetura em camadas** utilizando
**Java** e **MySQL**, aplicando o padrão **DAO(Data access object)**.

O sistema permite cadastrar alunos e listar alunos armazenando em um banco de dados.

---
## Objetivos do projeto

- Sparr responsabilidades no código
- Demonstrar a comunicação entre Java e Banco de Dados
- Aplicar boas praticas como:
- DAO
- Model
- Factory de conexão
- Evitar SQL injection
- Facilitar a manutenção e evolução do sistema

   ---

  ## Estrutura do Projeto

  <img width="237" height="176" alt="image" src="https://github.com/user-attachments/assets/58c40691-6c8c-412c-b629-a202b8cb5c2b" />

---

## Descrição das Camadas 

- Main (app)

  Resoponsável por:

  interagir com o usuário via console

  Receber dados

  Chamar o DAO para salvar e listar alunos

  Não contém SQL, apenas regras de fluxo de aplicação

  - Aluno (model)
 
  Representa a tabela alunos do banco de dados.

  Contém:

  Atributos (id, nome)

  Construtores

  Getters e Setters

  - AlunoDAO (dao)

Responsável por:

Executar comandos SQL

Fazer operações CRUD

Converter dados do banco em objetos Java

Métodos:

cadastrar(Aluno aluno)

listar()

- Centraliza toda a lógica de acesso ao banco.

- ConnectionFactory (config)

Responsável por:

Criar e fornecer conexões com o banco de dados

Centralizar URL, usuário e senha

- Facilita manutenção e evita repetição de código.

## Importância do Padrão DAO

O padrão DAO (Data Access Object) é importante porque:

Separa regras de negócio do acesso ao banco

Facilita testes

Permite trocar o banco sem alterar o restante do sistema

Torna o código mais organizado e profissional

É amplamente usado no mercado de trabalho

