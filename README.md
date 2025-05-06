# Projeto de Simulação de Matrícula de Aluno e Curso

Este projeto simula a matrícula de alunos em cursos utilizando **JPA (Java Persistence API)**, **Persistence** e **PostgreSQL**. O sistema permite cadastrar, listar e vincular alunos a cursos, bem como armazenar essas informações no banco de dados PostgreSQL.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação para desenvolver a lógica do sistema.
- **JPA (Java Persistence API)**: API para gerenciar a persistência dos dados.
- **Hibernate**: Implementação da JPA utilizada para gerenciar a comunicação entre a aplicação e o banco de dados.
- **PostgreSQL**: Banco de dados relacional para armazenar as informações dos alunos e cursos.
- **Maven**: Gerenciador de dependências.

## Funcionalidades

- Cadastro de alunos, cursos e matrículas.
- Visualização de alunos matriculados em um curso.
- Relacionamento de muitos para muitos entre **Aluno** e **Curso**.
- Armazenamento persistente dos dados no banco de dados PostgreSQL.

## Como Rodar o Projeto

### 1. Pré-requisitos

- JDK 11 ou superior
- Maven
- PostgreSQL instalado e configurado
- IDE de sua preferência (exemplo: IntelliJ IDEA, Eclipse)

### 2. Configuração do Banco de Dados

Antes de rodar o projeto, é necessário configurar o banco de dados PostgreSQL. Execute o seguinte comando SQL para criar o banco de dados:

