Visão Geral
Este é um sistema de gerenciamento de biblioteca baseado em console, desenvolvido em Java. Ele permite que usuários e bibliotecários realizem operações básicas de biblioteca, como cadastro, consulta, modificação e gerenciamento de empréstimos de livros e usuários.

Como Usar a Aplicação

Compilação e Execução:

Certifique-se de ter um ambiente de desenvolvimento Java (JDK) instalado.
Abra o projeto no NetBeans (ou em sua IDE Java preferida).
Compile todos os arquivos .java.
Execute a classe SistemaBibliotecario.java (que contém o método main).
Menu Principal:
Ao iniciar a aplicação, você verá o menu principal com duas opções de login:

##############BIBLIOTECA##############
Bem vindo!
Selecione uma das opções:
1. Entrar como usuário.
2. Entrar como bibliotecário.

0. Encerrar.
##############XXXXXXXXXX##############

Digite 1 para entrar como um leitor (usuário comum).
Digite 2 para entrar como um bibliotecário.
Digite 0 para sair do programa.

Usuário Inicial (Login de Teste):
Para testar o login, há um usuário e um bibliotecário pré-cadastrados na inicialização do sistema:

Usuário (Leitor):
Nome: Mateus
CPF: 999
Matrícula: 555
Bibliotecário:
Nome: Mestre
CPF: 333
Matrícula: 888
Entrar como Usuário (Opção 1):

Será solicitada sua matrícula.
Matrícula de teste: 555

Após o login bem-sucedido, você terá acesso a um menu específico para usuários, que permite principalmente a busca de livros. Você poderá:
Buscar livros por título, gênero, autor ou código de barras (ISBN).
Sair do menu do usuário (0) para voltar ao menu principal de login.

Entrar como Bibliotecário (Opção 2):

Serão solicitados seu nome, CPF e matrícula.

Dados de teste: você pode usar os dados do bibliotecário mestre (Mestre, 333, 888).
Após o login bem-sucedido, você terá acesso ao menu de gerenciamento do bibliotecário, que oferece opções mais amplas:
Gerenciar Acervo de Livros: Cadastrar, atualizar, remover e consultar livros.
Gerenciar Usuários: Cadastrar, atualizar, remover e consultar usuários.

Registrar/Encerrar Empréstimos: Gerenciar o processo de empréstimo e devolução.
Sair do menu do bibliotecário (0) para voltar ao menu principal.

Funcionalidades Implementadas (Resumo)

Classes Principais: Livros, Usuarios, Bibliotecario, SistemaBiblioteca.

Gestão de Livros:

Cadastro de novos livros.
Modificação de dados de livros existentes (por código de barras).
Remoção de livros (por código de barras).

Consulta de livros por título, autor, gênero e código de barras.

Gestão de Usuários:

Cadastro de novos usuários.
Modificação de dados de usuários existentes (por matrícula).
Remoção de usuários (por matrícula).

Consulta de usuários por nome, CPF e matrícula.

Gestão de Empréstimos:

Registro de empréstimos (associando um livro a um usuário).
Encerramento de empréstimos (devolução de livros).

Navegação por Menus: Sistema de menus aninhados para diferentes funcionalidades, permitindo "voltar" ao menu anterior.

Pontos Importantes para Testar e Observar

Autor: Mailton Olinto de Oliveira Lemos.
