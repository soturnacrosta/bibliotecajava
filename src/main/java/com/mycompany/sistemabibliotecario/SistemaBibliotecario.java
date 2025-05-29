/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemabibliotecario;
import java.util.ArrayList;
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
        
        System.out.println("##############BIBLIOTECA##############"); //interface inicial, menu inicial
        System.out.println("Bem vindo!");  
        System.out.println("Selecione uma das opções:");   
        System.out.println("1. Entrar como usuário.");
        System.out.println("2. Entrar como bibliotecário.\n");
        System.out.println("\n0. Encerrar.");
        System.out.println("##############XXXXXXXXXX##############");
            escolha = teclado.nextLine();
        
            List <Usuarios> usuarios = new ArrayList<>();
            List <Livros> livros = new ArrayList<>();
            List <Bibliotecario> bibliotecarios = new ArrayList();
            SistemaBiblioteca biblioteca = new SistemaBiblioteca(); //criação das listas quando o usuario inicia o software
   
        while (!escolha.equals("0")){

            switch (escolha) {

                case "1": //escolhendo usuario 

                        System.out.println("\n##############BIBLIOTECA##############");
                        System.out.println("Selecione uma das opções:");   
                        System.out.println("1. Consultar acervo de livros.");
                        System.out.println("2. Fazer empréstimo de livros.");
                        System.out.println("3. Devolver livros.");
                        System.out.println("\n0. Encerrar.");
                        System.out.println("##############XXXXXXXXXX##############");
                            escolha = teclado.nextLine();

                            switch (escolha) {

                                case "1":

                                    break;

                                case "2":

                                    break;

                                case "3":

                                    break;

                                case "0":

                                    System.out.println("\nEncerrando...");

                                    break;

                                default:

                                    break;

                            }
                    break;
                    
//#################################################################################################################################################################################################
                
                case "2": //escolhendo bibliotecario

                        System.out.print("Entre com seu nome: ");
                            String nomeB = teclado.nextLine();
                        System.out.print("Entre com seu CPF: ");
                            String cpfB = teclado.nextLine();
                        System.out.print("Entre com sua matrícula: ");
                            String matriculaB = teclado.nextLine();

                        Bibliotecario bibliotecario = new Bibliotecario (nomeB, cpfB, matriculaB, biblioteca);
                        Usuarios usuarioBibliotecario = new Usuarios (nomeB, cpfB, matriculaB);
                        Livros livro = new Livros ("Frankenstein", "Terror", "Mary Shelley", "disponivel" ,"001"); //livro do bibliotecario instanciado no menu
                        Livros livro2 = new Livros ("Frankenstein", "Terror", "Mary Shelley", "disponivel" ,"002"); //mostrando dois resultados possiveis
                        bibliotecario.CadastrarLivro(livro2);
                        bibliotecario.CadastrarLivro(livro); 
                        
                        bibliotecario.CadastrarUsuario(usuarioBibliotecario);
                        
                        System.out.println("\nLogado com sucesso!");

                        System.out.println("\n##############BIBLIOTECA##############");
                        System.out.println("Selecione uma das opções:");   
                        System.out.println("1. Consultar acervo de livros.");
                        System.out.println("2. Consultar usuários.");
                        System.out.println("3. Cadastrar, atualizar ou remover título.");
                        System.out.println("4. Cadastrar, atualizar ou remover usuário.\n");
                        System.out.println("0. Encerrar.");
                        System.out.println("##############XXXXXXXXXX##############");
                            escolha = teclado.nextLine();

                            switch (escolha) { //consultar acervo

                                case "1":

                                    System.out.println("\n##############BIBLIOTECA##############");
                                    System.out.println("Selecione uma das opções:"); 
                                    System.out.println("1. Busca por título.");
                                    System.out.println("2. Busca por genero.");
                                    System.out.println("3. Busca por autor.");
                                    System.out.println("4. Busca por código de barras.");
                                    System.out.println("\n0. Encerrar.");
                                    System.out.println("##############XXXXXXXXXX##############");
                                        escolha = teclado.nextLine();
                                        
                                        if (escolha.equals("1")) {
                                            
                                            System.out.print("Digite o nome do titulo: ");
                                                String tituloBusca = teclado.nextLine();
                                                
                                            bibliotecario.BuscaLivroPorTitulo(tituloBusca);
                                            
                                        }
                                        
                                        else if (escolha.equals("2")) {
                                            
                                            System.out.print("Digite o genero: ");
                                                String generoBusca = teclado.nextLine();
                                                
                                            bibliotecario.BuscaLivroPorGenero(generoBusca);
                                            
                                        }
                                        
                                        else if (escolha.equals("3")) {
                                            
                                            System.out.println("Digite o autor: ");
                                                String autorBusca = teclado.nextLine();
                                                
                                            bibliotecario.BuscaLivroPorAutor(autorBusca);
                                            
                                        }
                                        
                                        else if (escolha.equals("4")) {
                                            
                                            System.out.println("Digite o código de barras: ");
                                                String codigoBusca = teclado.nextLine();
                                                
                                            bibliotecario.BuscaLivroPorCodigo(codigoBusca);
                                            
                                        }
                                    
                                    break;
                                    
                                case "2": //consultar usuários
                                    
                                    System.out.println("\n##############BIBLIOTECA##############");
                                    System.out.println("Selecione uma das opções:"); 
                                    System.out.println("1. Busca por nome.");
                                    System.out.println("2. Busca por CPF.");
                                    System.out.println("3. Busca por matricula.");
                                    System.out.println("\n0. Encerrar.");
                                    System.out.println("##############XXXXXXXXXX##############");
                                        escolha = teclado.nextLine();
                                        
                                        if (escolha.equals("1")) { //por nome
                                            
                                            System.out.print("Digite o nome do usuário para buscar: ");
                                                String nomeBusca = teclado.nextLine();
                                                
                                            bibliotecario.BuscarUsuarioPorNome(nomeBusca);
                                            
                                            break;
                                            
                                        }
                                        
                                        else if (escolha.equals("2")) { //por cpf
                                            
                                            System.out.print("Digite o CPF do usuário para buscar: ");
                                                String cpfBusca = teclado.nextLine();
                                                
                                            bibliotecario.BuscarUsuarioPorCpf(cpfBusca);
                                            
                                            break;
                                            
                                        }
                                        
                                        else if (escolha.equals("3")) { //por matricula 
                                            
                                            System.out.print("Digite a matricula do usuário para buscar: ");
                                                String matriculaBusca = teclado.nextLine();
                                                
                                            bibliotecario.BuscarUsuarioPorMatricula(matriculaBusca);
                                            
                                            break;
                                            
                                        }
                                        
                                        else if (escolha.equals("0")) {
                                            
                                            System.out.println("Encerrando...");
                                            
                                            break;
                                        }
                                        
                                        else {
                                            
                                            System.out.println("Erro! Opção inválida.");
                                            
                                        }
                                
                                case "3": //gerenciar titulos
                                    
                                    System.out.println("\n##############BIBLIOTECA##############");
                                    System.out.println("Selecione uma das opções:"); 
                                    System.out.println("1. Cadastrar título.");
                                    System.out.println("2. Atualizar título.");
                                    System.out.println("3. Remover título.");
                                    System.out.println("\n0. Encerrar.");
                                    System.out.println("##############XXXXXXXXXX##############");
                                        escolha = teclado.nextLine();
                                        
                                        if (escolha.equals("1")){ //cadastra
                                            
                                            System.out.println("Digite o nome do titulo: ");
                                                String titulo = teclado.nextLine();
                                            System.out.println("Digite o genero do título: ");
                                                String genero = teclado.nextLine();
                                            System.out.println("Digite o autor do título: ");
                                                String autor = teclado.nextLine();
                                            System.out.println("Digite o codigo de barras: ");
                                                String codigo = teclado.nextLine();
                                                
                                                livro = new Livros (titulo, genero, autor, "disponivel", codigo);
                                                bibliotecario.CadastrarLivro(livro); //livro adicionado 
                                                
                                            break;
                                            
                                        }
                                        
                                        else if (escolha.equals("2")) { //atualiza. utilize 123 no codigo para rodar...
                                        
                                            System.out.print("Digite o codigo de barras do título para atualizar: ");
                                                String codigoBuscar = teclado.nextLine();
                                                
                                                livro = biblioteca.BuscaLivroPorCodigo(codigoBuscar);
                                                
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
                                            
                                            break;
                                            
                                        }
                                        
                                        else if (escolha.equals("3")) {
                                            
                                            System.out.print("Digite o código de barras do título a remover: ");
                                                String codigoBuscar = teclado.nextLine();
                                                
                                            bibliotecario.RemoverLivro(livro);
                                            
                                            break;
                                            
                                        }
                                        
                                        else if (escolha.equals("0")) {
                                            
                                            System.out.println("Encerrando...");
                                            
                                            break;
                                        }
                                    
                                case "4": //gerenciar usuarios í

                                    System.out.println("\n##############BIBLIOTECA##############");
                                    System.out.println("Selecione uma das opções:"); 
                                    System.out.println("1. Cadastrar usuário.");
                                    System.out.println("2. Atualizar usuário.");
                                    System.out.println("3. Remover usuário.");
                                    System.out.println("\n0. Encerrar.");
                                    System.out.println("##############XXXXXXXXXX##############");
                                        escolha = teclado.nextLine();

                                            if (escolha.equals("1")) {

                                                System.out.print("Digite o nome: ");
                                                    String nome = teclado.nextLine();
                                                System.out.print("Digite o CPF: ");
                                                    String cpf = teclado.nextLine();
                                                System.out.print("Digite a matricula: ");
                                                    String matricula = teclado.nextLine();

                                                    Usuarios usuario = new Usuarios (nome, cpf, matricula);
                                                    bibliotecario.CadastrarUsuario(usuario);
                                                    
                                                    break;
                                            }

                                            else if (escolha.equals("2")) {

                                                System.out.print("Digite a matricula do usuário para atualizar: ");
                                                    String matriculaBuscar = teclado.nextLine();

                                                    Usuarios usuario = biblioteca.BuscarUsuarioPorMatricula(matriculaBuscar); //buscando

                                                System.out.println("Usuario " + usuario.getNome() + " selecionado, a atualizar...\n");

                                                System.out.print("Digite o nome atual: ");
                                                    String nomeNovo = teclado.nextLine();
                                                System.out.print("Digite o CPF atual: ");
                                                    String cpfNovo = teclado.nextLine();
                                                System.out.print("Digite a matricula atual: ");
                                                    String matriculaNovo = teclado.nextLine();

                                                    bibliotecario.ModificarUsuarios(matriculaBuscar, nomeNovo, cpfNovo, matriculaNovo);

                                                System.out.println("Novos dados:");
                                                System.out.println("Nome: " + usuario.getNome() + "\nCPF :" + usuario.getCpf() + "\nMatricula: " + usuario.getMatricula());
                                                
                                                break;

                                            }

                                            else if (escolha.equals("3")) {

                                                System.out.print("Digite a matricula do usuário a remover: ");
                                                    String matricula = teclado.nextLine();

                                                bibliotecario.RemoverUsuario(matricula);
                                                
                                                break;
                                            }
                                            
                                            else if (escolha.equals("0")) {
                                                
                                                System.out.println("Encerrando...");
                                                
                                                break;
                                                
                                            }

                                    break;

                            }

                    break;

                case "0":

                    System.out.println("\nEncerrando...");

                    break;

                default:

                    System.out.println("Opção invãlida! Tente novamente.");

                    break;
            }
            
            break;
        }
    }
}
