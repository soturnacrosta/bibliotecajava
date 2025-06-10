/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemabibliotecario;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author mailton
 */
public class SistemaBibliotecario {

    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);
        String escolha;

        List <Usuarios> usuarios = new ArrayList<>();
        List <Livros> livros = new ArrayList<>();
        List <Bibliotecario> bibliotecarios = new ArrayList();
        SistemaBiblioteca biblioteca = new SistemaBiblioteca(); //criação das listas quando o usuario inicia o software
        //Usuarios usuario1 = new Usuarios ("teste", "123");
        //biblioteca.CadastraUsuario(usuario1);

        do {
            
            System.out.println("##############BIBLIOTECA##############"); //interface inicial, menu inicial
            System.out.println("Bem vindo!");  
            System.out.println("Selecione uma das opções:");   
            System.out.println("1. Entrar como usuário.");
            System.out.println("2. Entrar como bibliotecário.");
            System.out.println("\n0. Encerrar.");
            System.out.println("##############XXXXXXXXXX##############");
                escolha = teclado.nextLine();

                switch (escolha) {

                    case "1": //escolhendo usuario 

                            System.out.println("Bem-vindo!");   
                            System.out.print("Digite sua matrícula: ");
                            boolean matriculaValida = false;
                            Usuarios usuarioLogado = null;
                            
                            do {
                                
                                try {

                                    int matriculaMatch = teclado.nextInt();
                                    teclado.nextLine();

                                    usuarioLogado = biblioteca.BuscarUsuarioPorMatricula(matriculaMatch); //crie uma instancia do tipo usuario ja buscando a matricula
                                    matriculaValida = true;
                                }

                                catch (InputMismatchException e) { //exceção para caso haja entrada de dados inválida

                                    System.out.print("Erro! Por favor, digite apenas números para a matrícula.\nDigite sua matrícula:");
                                    
                                    teclado.nextLine();  //aqui ele já utiliza a entrada de dados que você requisitou previamente, nêo precisa pedir de novo
                                    
                                }
                            
                            }
                            
                            while (!matriculaValida);
                            
                                String escolhaUsuarioLoop = "1";
                                
                                if (usuarioLogado != null){ 

                                    System.out.println("Usuário logado!\n");

                                    switch (escolhaUsuarioLoop) {

                                       case "1":

                                            do {

                                                System.out.println("\n##############BIBLIOTECA##############");
                                                System.out.println("Selecione uma das opções:"); 
                                                System.out.println("1. Busca por título.");
                                                System.out.println("2. Busca por genero.");
                                                System.out.println("3. Busca por autor.");
                                                System.out.println("4. Busca por código de barras.");
                                                System.out.println("\n0. Encerrar.");
                                                System.out.println("##############XXXXXXXXXX##############");
                                                    String escolhaBusca = teclado.nextLine();

                                                    if (escolhaBusca.equals("1")) {

                                                        System.out.print("Digite o nome do titulo: ");
                                                            String tituloBusca = teclado.nextLine();

                                                        biblioteca.BuscarLivroPorTitulo(tituloBusca);

                                                    }

                                                    else if (escolhaBusca.equals("2")) {

                                                        System.out.print("Digite o genero: ");
                                                            String generoBusca = teclado.nextLine();

                                                        biblioteca.BuscarLivroPorGenero(generoBusca);

                                                    }

                                                    else if (escolhaBusca.equals("3")) {

                                                        System.out.println("Digite o autor: ");
                                                            String autorBusca = teclado.nextLine();

                                                        biblioteca.BuscarLivroPorAutor(autorBusca);

                                                    }

                                                    else if (escolhaBusca.equals("4")) {

                                                        System.out.println("Digite o código de barras: ");
                                                            String codigoBusca = teclado.nextLine();

                                                        biblioteca.BuscarLivroPorCodigo(codigoBusca);

                                                    }

                                                    else if (escolhaBusca.equals("0")) {

                                                        break;

                                                    }
                                                    

                                                    else {

                                                        System.out.println("Opção inválida!");

                                                    }

                                            } while (!escolhaUsuarioLoop.equals("0"));

                                            break;

                                       case "0":
                                           
                                           break;

                                       default:

                                           System.out.println("Opção inválida!");
                                           
                                           break;

                                    }

                                    System.out.println("\nVoltando..."); //break do menu usuario

                                    break;

                                }

                                else {

                                    System.out.println("Login inválido! Tente novamente.");

                                    break;

                                }

    //#################################################################################################################################################################################################

                    case "2": //escolhendo bibliotecario

                            System.out.print("Entre com seu nome: ");
                                String nomeB = teclado.nextLine();
                            System.out.print("Entre com seu CPF: ");
                                String cpfB = teclado.nextLine();
                            System.out.print("Entre com sua matrícula: ");

                            boolean logado = false;
                            
                            do {
                                
                                    try {
                                        
                                        int matriculaB = teclado.nextInt();
                                        teclado.nextLine();
                                        
                                        System.out.println("\nLogado com sucesso!");
                                        
                                        logado = true;

                                    }
                                    
                                    catch (InputMismatchException e) {
                                        
                                        System.out.print("Erro! Por favor, digite apenas números para a matrícula.\nDigite sua matrícula: ");
                                            teclado.nextLine();  //aqui ele já utiliza a entrada de dados que você requisitou previamente, nêo precisa pedir de novo
                                        
                                    }
                                    
                            }
                            
                            while (!logado);
                                
                            Bibliotecario bibliotecario = new Bibliotecario (nomeB, cpfB, biblioteca);
                            Usuarios usuarioBibliotecario = new Usuarios (nomeB, cpfB); //ele cria usuario bibliotecario com uma matricula 1
                            Livros livro; //instancia livro
                            
                            do { //PARA NÃO SAIR DO MENU E CAIR NO PROXIMO BLOCO, FAÇA O WHILE DELEÉ

                                System.out.println("\n##############BIBLIOTECA##############");
                                System.out.println("Selecione uma das opções:");   
                                System.out.println("1. Consultar acervo de livros.");
                                System.out.println("2. Consultar usuários.");
                                System.out.println("3. Cadastrar, atualizar ou remover título.");
                                System.out.println("4. Cadastrar, atualizar ou remover usuário.");
                                System.out.println("5. Registrar ou encerrar empréstimo.");
                                System.out.println("\n0. Encerrar.");
                                System.out.println("##############XXXXXXXXXX##############");
                                    String escolhaMenuBibliotecario = teclado.nextLine();

                                    switch (escolhaMenuBibliotecario) { //consultar acervo

                                        case "1":

                                            do { //exige que CADA menu seja repetido

                                                System.out.println("\n##############BIBLIOTECA##############");
                                                System.out.println("Selecione uma das opções:"); 
                                                System.out.println("1. Busca por título.");
                                                System.out.println("2. Busca por genero.");
                                                System.out.println("3. Busca por autor.");
                                                System.out.println("4. Busca por código de barras.");
                                                System.out.println("\n0. Encerrar.");
                                                System.out.println("##############XXXXXXXXXX##############");
                                                    String escolhaBusca = teclado.nextLine();

                                                    if (escolhaBusca.equals("1")) {

                                                        System.out.print("Digite o nome do titulo: ");
                                                            String tituloBusca = teclado.nextLine();

                                                        bibliotecario.BuscaLivroPorTitulo(tituloBusca);

                                                        //não preciso colocar validação de escolha aqui, ele ja retorna pro menu que possibilita fechar.
                                                        //é o mesmo numero de cliques.
                                                    }

                                                    else if (escolhaBusca.equals("2")) {

                                                        System.out.print("Digite o genero: ");
                                                            String generoBusca = teclado.nextLine();

                                                        bibliotecario.BuscaLivroPorGenero(generoBusca);

                                                    }

                                                    else if (escolhaBusca.equals("3")) {

                                                        System.out.println("Digite o autor: ");
                                                            String autorBusca = teclado.nextLine();

                                                        bibliotecario.BuscaLivroPorAutor(autorBusca);

                                                    }

                                                    else if (escolhaBusca.equals("4")) {

                                                        System.out.println("Digite o código de barras: ");
                                                            String codigoBusca = teclado.nextLine();

                                                        bibliotecario.BuscaLivroPorCodigo(codigoBusca);

                                                    }

                                                    else if (escolhaBusca.equals("0")) {

                                                        break;

                                                    }

                                                    else {

                                                        System.out.println("Opção inválida!");

                                                    }

                                            } while (!escolhaMenuBibliotecario.equals("0"));

                                            break;


                                        case "2": //consultar usuários

                                            do {

                                                System.out.println("\n##############BIBLIOTECA##############");
                                                System.out.println("Selecione uma das opções:"); 
                                                System.out.println("1. Busca por nome.");
                                                System.out.println("2. Busca por CPF.");
                                                System.out.println("3. Busca por matricula.");
                                                System.out.println("\n0. Encerrar.");
                                                System.out.println("##############XXXXXXXXXX##############");
                                                    String escolhaBuscaUsuario = teclado.nextLine();

                                                    if (escolhaBuscaUsuario.equals("1")) { //por nome

                                                        System.out.print("Digite o nome do usuário para buscar: ");
                                                            String nomeBusca = teclado.nextLine();

                                                        bibliotecario.BuscarUsuarioPorNome(nomeBusca);

                                                    }

                                                    else if (escolhaBuscaUsuario.equals("2")) { //por cpf

                                                        System.out.print("Digite o CPF do usuário para buscar: ");
                                                            String cpfBusca = teclado.nextLine();

                                                        bibliotecario.BuscarUsuarioPorCpf(cpfBusca);

                                                    }

                                                    else if (escolhaBuscaUsuario.equals("3")) { //por matricula 

                                                        System.out.print("Digite a matricula do usuário para buscar: ");
                                                        boolean validarLoopUsuario = false;
                                                        
                                                        do {
                                                            
                                                            try {
                                                                int matriculaBusca = teclado.nextInt();
                                                                teclado.nextLine();

                                                                bibliotecario.BuscarUsuarioPorMatricula(matriculaBusca);

                                                                validarLoopUsuario = true;
                                                                
                                                            }
                                                            
                                                            catch (InputMismatchException e) {
                                                                
                                                                System.out.print("Erro! Por favor, digite apenas números para a matrícula.\nDigite sua matrícula: ");
                                                                teclado.nextLine();  //aqui ele já utiliza a entrada de dados que você requisitou previamente, nêo precisa pedir de novo
                                                                
                                                            }
                                                            
                                                        }
                                                        
                                                        while (!validarLoopUsuario);
                                                        
                                                    }

                                                    else if (escolhaBuscaUsuario.equals("0")) {

                                                        break;
                                                    }

                                                    else {

                                                        System.out.println("Opção inválida!");

                                                    }

                                            } while (!escolhaMenuBibliotecario.equals("0"));

                                            break;

                                        case "3": //gerenciar titulos

                                            do {

                                                System.out.println("\n##############BIBLIOTECA##############");
                                                System.out.println("Selecione uma das opções:"); 
                                                System.out.println("1. Cadastrar título.");
                                                System.out.println("2. Atualizar título.");
                                                System.out.println("3. Remover título.");
                                                System.out.println("\n0. Encerrar.");
                                                System.out.println("##############XXXXXXXXXX##############");
                                                    String escolhaTitulos = teclado.nextLine();

                                                    if (escolhaTitulos.equals("1")){ //cadastra

                                                        System.out.println("Digite o nome do titulo: ");
                                                            String titulo = teclado.nextLine();
                                                        System.out.println("Digite o genero do título: ");
                                                            String genero = teclado.nextLine();
                                                        System.out.println("Digite o autor do título: ");
                                                            String autor = teclado.nextLine();
                                                        System.out.println("Digite o codigo de barras: ");
                                                            String codigo = teclado.nextLine();
                                                            
                                                            Livros livroExistente = biblioteca.BuscarLivroPorCodigo(codigo); //atribui a uma variável a busca
                                                            
                                                            if (livroExistente == null){
                                                                
                                                                livro = new Livros (titulo, genero, autor, "disponivel", codigo);
                                                                bibliotecario.CadastrarLivro(livro); //livro adicionado 
                                                                
                                                            }
                                                            
                                                            else {
                                                                
                                                                System.out.println("Erro! Código de barras já cadastrado");
                                                            }

                                                    }

                                                    else if (escolhaTitulos.equals("2")) { //atualiza. utilize 123 no codigo para rodar...

                                                        System.out.print("Digite o codigo de barras do título para atualizar: ");
                                                            String codigoBuscar = teclado.nextLine();

                                                            livro = biblioteca.BuscarLivroPorCodigo(codigoBuscar);

                                                        System.out.println("Título " + livro.getTitulo() + " selecionado, a atualizar...\n");  
                                                        System.out.print("Digite o novo nome do título: ");
                                                            String tituloNovo = teclado.nextLine();
                                                        System.out.print("Digite o novo genero do título: ");
                                                            String generoNovo = teclado.nextLine();
                                                        System.out.print("Digite o novo autor do título: ");
                                                            String autorNovo = teclado.nextLine();
                                                        System.out.print("Digite o novo codigo de barras do título: ");
                                                            String codigoNovo = teclado.nextLine();

                                                        bibliotecario.ModificarDadosLivro(codigoBuscar, tituloNovo, generoNovo, codigoNovo, generoNovo);

                                                        System.out.println("Novos dados:");
                                                        System.out.println("Título: " +  livro.getTitulo() + "\nGenero: " + livro.getGenero() + "\nAutor: " + livro.getAutor() + "\nCódigo de barras: "
                                                        + livro.getCodigo());

                                                    }

                                                    else if (escolhaTitulos.equals("3")) { //remover titulo

                                                        System.out.print("Digite o código de barras do título a remover: ");
                                                            String codigoBuscar = teclado.nextLine();

                                                        bibliotecario.RemoverLivro(codigoBuscar);

                                                    }

                                                    else if (escolhaTitulos.equals("0")) { //encerra 

                                                        break;
                                                    }

                                                    else {

                                                        System.out.println("Opção inválida!");

                                                    }

                                            } while (!escolhaMenuBibliotecario.equals("0"));

                                            break;

                                        case "4": //gerenciar usuarios í

                                            do {

                                                System.out.println("\n##############BIBLIOTECA##############");
                                                System.out.println("Selecione uma das opções:"); 
                                                System.out.println("1. Cadastrar usuário.");
                                                System.out.println("2. Atualizar usuário.");
                                                System.out.println("3. Remover usuário.");
                                                System.out.println("\n0. Encerrar.");
                                                System.out.println("##############XXXXXXXXXX##############");
                                                    String escolhaGerenciarUsuarios = teclado.nextLine();

                                                        if (escolhaGerenciarUsuarios.equals("1")) {  //cadastra usuario

                                                            System.out.print("Digite o nome: ");
                                                                String nome = teclado.nextLine();
                                                            System.out.print("Digite o CPF: ");
                                                                String cpf = teclado.nextLine();
                                                        
                                                                Usuarios usuario = new Usuarios (nome, cpf);
                                                                bibliotecario.CadastrarUsuario(usuario);

                                                        }

                                                        else if (escolhaGerenciarUsuarios.equals("2")) { //atualiza usuario

                                                            System.out.print("Digite a matricula do usuário para atualizar: ");
                                                             
                                                            boolean atualizaLoop = false;
                                                            
                                                            do {
                                                                
                                                                try {
                                                                    
                                                                    int matriculaBuscar = teclado.nextInt();
                                                                    teclado.nextLine();

                                                                    Usuarios usuario = biblioteca.BuscarUsuarioPorMatricula(matriculaBuscar); //buscando
                                                                    
                                                                    atualizaLoop = true;
                                                                    
                                                                    
                                                                    if (usuario != null) {
                                                                        
                                                                        System.out.println("Usuario " + usuario.getNome() + " selecionado, a atualizar...\n");

                                                                        System.out.print("Digite o nome atual: ");
                                                                            String nomeNovo = teclado.nextLine();
                                                                        System.out.print("Digite o CPF atual: ");
                                                                            String cpfNovo = teclado.nextLine();

                                                                            bibliotecario.ModificarUsuarios(matriculaBuscar, nomeNovo, cpfNovo);

                                                                        System.out.println("\nNovos dados:");
                                                                        System.out.println("Nome: " + usuario.getNome() + "\nCPF :" + usuario.getCpf() + "\nMatricula: " + usuario.getMatricula());

                                                                    }
                                                                    
                                                                    else {
                                                                        
                                                                    }
                                                                }
                                                                
                                                                catch (InputMismatchException e) {
                                                                     
                                                                    System.out.print("Erro! Por favor, digite apenas números para a matrícula.\nDigite sua matrícula: ");
                                                                    teclado.nextLine();  
                                                                    
                                                                }
                                                                
                                                            }
                                                            
                                                            while (!atualizaLoop);
                                                                
                                                        }

                                                        else if (escolhaGerenciarUsuarios.equals("3")) { //remove usuario 
                                                            
                                                            System.out.print("Digite a matricula do usuário a remover: ");
                                                            
                                                            boolean removerLoop = false;
                                                            
                                                            do {
                                                                
                                                                try {
                                                                    
                                                                    int matricula = teclado.nextInt();
                                                                        teclado.nextLine();

                                                                    bibliotecario.RemoverUsuario(matricula);
                                                                    
                                                                    removerLoop = true;
                                                                    
                                                                }
                                                                
                                                                catch (InputMismatchException e) {
                                                                    
                                                                     
                                                                    System.out.print("Erro! Por favor, digite apenas números para a matrícula.\nDigite sua matrícula: ");
                                                                    teclado.nextLine();  
                                                                    
                                                                }
                                                                
                                                            }
                                                            
                                                            while (!removerLoop);
                                                            
                                                        }

                                                        else if (escolhaGerenciarUsuarios.equals("0")) { //encerra

                                                            break;

                                                        }

                                                        else {

                                                            System.out.println("Opção inválida!");

                                                        }

                                            } while (!escolhaMenuBibliotecario.equals("0"));

                                            break;

                                        case "5": //emprestimos de livros

                                            do {


                                                System.out.println("\n##############BIBLIOTECA##############");
                                                System.out.println("Selecione uma das opções:"); 
                                                System.out.println("1. Registrar empréstimo.");
                                                System.out.println("2. Encerrar empréstimo.");
                                                System.out.println("\n0. Encerrar.");
                                                System.out.println("##############XXXXXXXXXX##############");
                                                    String escolhaEmprestimo = teclado.nextLine();

                                                    if (escolhaEmprestimo.equals("1")) { //registro de emprestimo
                                                        
                                                        System.out.print("Digite o código de barras: ");
                                                           String codigoEmprestimo = teclado.nextLine();

                                                        System.out.print("Digite a matricula do usuário: ");
                                                        
                                                        boolean loopEmprestimo = false;
                                                        
                                                        do {
                                                            
                                                            try {
                                                                
                                                                   int matriculaEmprestimo = teclado.nextInt();
                                                                   teclado.nextLine();

                                                                   System.out.println("");
                                                                   
                                                                   bibliotecario.RegistrarEmprestimo(matriculaEmprestimo, codigoEmprestimo);
                                                                   
                                                                   loopEmprestimo = true;
                                                                  
                                                            }
                                                            
                                                            catch (InputMismatchException e) {
                                                                
                                                                System.out.print("Erro! Por favor, digite apenas números para a matrícula.\nDigite sua matrícula: ");
                                                                teclado.nextLine();                                   
                                                                
                                                            }
                                                            
                                                        }
                                                        
                                                        while (!loopEmprestimo);
                                                       
                                                    }

                                                    else if (escolhaEmprestimo.equals("2")) {

                                                        System.out.print("Digite o código de barras: ");
                                                            String codigoEmprestimo = teclado.nextLine();

                                                        System.out.print("Digite a matricula do usuário: ");
                                                        boolean loopDevolver = false;
                                                        
                                                        do {
                                                            
                                                            try {
                                                                
                                                                int matriculaEmprestimo = teclado.nextInt();
                                                                    teclado.nextLine();

                                                                    System.out.println("");
                                                                    
                                                                bibliotecario.EncerrarEmprestimo(matriculaEmprestimo, codigoEmprestimo);
                                                                
                                                                loopDevolver = true;
                                                                
                                                            }
                                                            
                                                            catch (InputMismatchException e) {
                                                                
                                                                System.out.print("Erro! Por favor, digite apenas números para a matrícula.\nDigite sua matrícula: ");
                                                                teclado.nextLine();  
                                                                
                                                            }
                                                            
                                                        }
                                                        
                                                        while (!loopDevolver);
                                                        
                                                    }

                                                    else if (escolhaEmprestimo.equals("0")) {

                                                        break;

                                                    }

                                                    else {

                                                        System.out.println("Opção inválida!");

                                                    }

                                            }

                                            while (!escolhaMenuBibliotecario.equals("0"));

                                            break;

                                        case "0":
                                            
                                            System.out.println("testando");
                                            logado = false; //atribui a condição do loop como falso
                                            
                                            break; 

                                        default:

                                        System.out.println("Opção inválida! Tente novamente.\n");

                                    }//do switch menuBibliotecario
                            } while (logado == true); //o loop usa boolean para ficar verdadeiro
                            
                    case "0":
                        
                        System.out.println("Encerrando...");

                        break;
                        
                    default:

                        System.out.println("Opção inválida! Tente novamente.\n");

                        break;
          
                }
            
        } 
        
        while (!escolha.equals("0"));
        
    }
    
}
