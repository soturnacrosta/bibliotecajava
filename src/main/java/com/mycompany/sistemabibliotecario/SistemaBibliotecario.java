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

                                    biblioteca.getAcervo();
                                    
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
                                        
                                        if (escolha.equals("1")) {
                                            
                                            System.out.print("Digite o nome do usuário para buscar: ");
                                                String nomeBusca = teclado.nextLine();
                                                
                                            bibliotecario.BuscarUsuarioPorNome(nomeBusca);
                                            
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
                                        
                                        if (escolha.equals("1")){
                                            
                                            System.out.println("Digite o nome do titulo: ");
                                                String titulo = teclado.nextLine();
                                            System.out.println("Digite o genero do título: ");
                                                String genero = teclado.nextLine();
                                            System.out.println("Digite o autor do título: ");
                                                String autor = teclado.nextLine();
                                            System.out.println("Digite o codigo de barras: ");
                                                String codigo = teclado.nextLine();
                                                
                                                Livros livro = new Livros (titulo, genero, autor, "disponivel", codigo);
                                                bibliotecario.CadastrarLivro(livro);
                                                
                                            break;
                                            
                                        }
                                        
                                        else if (escolha.equals("2")) {
                                            
                                            
                                        }
                                    
                                case "4": //gerenciar usuarios 

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

                                                System.out.println("Usuario " + usuario.getNome() + " selecionado, a atualizar...");

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
