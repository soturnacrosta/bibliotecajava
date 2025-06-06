/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemabibliotecario;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mailton
 */
public class SistemaBiblioteca {
    
   private List<Livros> acervo;
   private List<Usuarios> usuariosCadastrados;
   
    public SistemaBiblioteca() { //não entra como parãmetro no construtor â
        
        this.acervo = new ArrayList<>();
        this.usuariosCadastrados = new ArrayList<>();
    }
    
    public void CadastrarLivro (Livros livro) {
        
        this.acervo.add(livro);
        
        System.out.println("Livro '" + livro.getTitulo() + "' adicionado ao acervo.\n");
        
    }
    
    public void RemoverLivro (String codigo) {
        
        
        Livros livroRemover = BuscarLivroPorCodigo(codigo); //procura o livro através de código de barras ao invéde objeto livros. assim não precisa instanciar nenhum livro pro metodo iniciar 
        
        if (livroRemover != null) {
            
            this.acervo.remove(livroRemover);
            
            System.out.println("Livro '" + livroRemover.getTitulo() + "' removido do acervo.\n");

        }
        
        else {
            
            System.out.println("Erro! Não há livros registrados.");
        }
        
    }
    
    //####################BUSCA##############################
    public List<Livros> BuscarLivroPorTitulo(String titulo) {
         
        List<Livros> resultados = new ArrayList<>(); //criar array de todos os resultados da busca
        
            for (Livros l : acervo) {

                if (l.getTitulo().equalsIgnoreCase(titulo)) {

                    System.out.println("\nTitulo encontrado: " + l);

                    resultados.add(l); //retorna todos os resultados adicionando o list
                    
                }
          }
            
            if (resultados.isEmpty()) { //precisa de  um if para controlar o retorno
                 
                System.out.println("Não há livro encontrado com esses critérios.");
                // Livro não encontrado
            }
          
            return resultados; 
            
      }
    
    public Livros BuscarLivroPorCodigo (String codigo) { //precisa ser retorno UNICO para poder atualizar o dado. Não pode ser lista.
        
        for (Livros l : acervo) {

                if (l.getCodigo().equals(codigo)) { //o codigo deve ser EXATO!!! NADA DE IGNORE CASE!

                    System.out.println("\nTitulo encontrado: " + l);

                    return l; //retorna todos os resultados adicionando o list

                }
          }
               
            System.out.println("Não há livro encontrado com esses critérios.");

            return null; // Livro não encontrado
          
    }
     
    public List<Livros> BuscarLivroPorGenero(String genero) {
        
        List<Livros> resultados = new ArrayList<>(); //criar array de todos os resultados da busca

            for (Livros l : acervo) {

                    if (l.getGenero().equalsIgnoreCase(genero)) {

                        System.out.println("\nTitulo encontrado: " + l);

                        resultados.add(l);

                    }
                }

            if (resultados.isEmpty()) { //precisa de  um if para controlar o retorno
                
                System.out.println("Não há livro encontrado com esses critérios.");
                // Livro não encontrado
            }
          
            return resultados; 
            
          }
    
    public List<Livros> BuscarLivroPorAutor (String autor) {
         
        List<Livros> resultados = new ArrayList<>();

        for (Livros l : acervo) {
              
                if (l.getAutor().equalsIgnoreCase(autor)) {

                    System.out.println("\nTitulo encontrado: " + l);

                    resultados.add(l);
                }
        }
        
        if  (resultados.isEmpty()) { //precisa de  um if para controlar o retorno
                
                System.out.println("Não há livro encontrado com esses critérios.");
                // Livro não encontrado
            }
          
            return resultados; 
            
    }
    
    //#######################CONSULTA COMPLETA################################3
    public List<Livros> getAcervo() { //consulta completa do acervo

        System.out.println(acervo);

        return new ArrayList<>(acervo);
        
    }
 
    // Gerenciamento de Usuários
    public void CadastraUsuario(Usuarios usuario) {
        
        this.usuariosCadastrados.add(usuario);
        
        System.out.println("\nUsuário '" + usuario.getNome() + "' cadastrado.\n");
        
    }
    
       // Adicione (ou confirme a existência e o uso) deste método
    public void listarUsuarios() {
        if (usuariosCadastrados.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado ainda.");
            return;
        }
        System.out.println("\n--- Lista de Usuários ---");
        for (Usuarios u : usuariosCadastrados) {
            System.out.println(u); // Assegure-se de que o toString() de Usuarios funciona bem
        }
        System.out.println("------------------------");
    }
    public void RemoverUsuario (Usuarios usuario) {
        
        this.usuariosCadastrados.remove(usuario);
        
        System.out.println("\nUsuário '" + usuario.getNome() + "' excluído.\n");

    }

    public Usuarios BuscarUsuarioPorMatricula(int matricula) {
        
        for (Usuarios u : usuariosCadastrados) {
            
            if (u.getMatricula() == matricula) {
                
                System.out.println("\nUsuário encontrado.\nNome: " + u.getNome() + "\nMatrícula: " + u.getMatricula() + "\nCpf:" + u.getCpf() + "\n");
                return u; // <--- Retorna o usuário IMEDIATAMENTE quando encontra
            }
            
        }
        
        System.out.println("\nUsuário não encontrado com esses critérios.\n");
        
        return null; // Retorna null se nenhum usuário for encontrado
        
    }

           
        public Usuarios BuscarUsuarioPorCpf(String cpf) {
        
        for (Usuarios u : usuariosCadastrados) { //como cpf e matricula são unicos, não precisa retornar multiplos retornados, nada de lista
            
            if (u.getCpf().equalsIgnoreCase(cpf)) {
                
                System.out.println("\nUsuário encontrado.\nNome: " + u.getNome() + "\nMatrícula: " + u.getMatricula() + "\nCpf:" + u.getCpf() + "\n");
                
                return u;
                
            }
            
        }
        
            System.out.println("\nUsuário não encontrado com esses critérios.\n");

        return null; // Usuário não encontrado
    }
        
    public List<Usuarios> BuscarUsuarioPorNome (String nome) {

        List<Usuarios> resultados = new ArrayList<>();

        for (Usuarios u : usuariosCadastrados) {

            if (u.getNome().equalsIgnoreCase(nome)) {

                System.out.println("\nUsuário encontrado.\nNome: " + u.getNome() + "\nMatrícula: " + u.getMatricula() + "\nCpf:" + u.getCpf() + "\n");

            resultados.add(u);

            }

        }

        System.out.println("\nUsuário não encontrado com esses critérios.\n");

        return resultados; // Usuário não encontrado
    }

    public boolean AtualizarLivro (String codigo, String novoTitulo, String novoAutor, String novoGenero, String novoStatus) { //precisa ser retorno UNICO para poder atualizar o dado. Não pode ser lista.
        
        Livros livroAtualizar = BuscarLivroPorCodigo (codigo); //usar o método de busca lá encima pra procurará
        
        if (livroAtualizar != null) {

                System.out.println("\nLivro encontrado! Atualizando dados...\n");

                livroAtualizar.setTitulo(novoTitulo);
                livroAtualizar.setAutor(novoAutor);
                livroAtualizar.setGenero(novoGenero);
                livroAtualizar.setStatus(novoStatus);

                    System.out.println("\nLivro atualizado!\nTitulo antigo: \n" + codigo + "\nAtualizado para:\nNovo Título: " + novoTitulo + "\nNovo autor: " + novoAutor + "\nNovo Genero: " + novoGenero + "\nNovo Status: " + novoStatus);
        
            return true;
            
        }
        
        else {
            
                System.out.println("Erro, livro não encontrado.\n");
            
            return false;
            
        }
        
        
    }
    
    public  boolean AtualizarUsuario (int matricula, String novoNome, String novoCpf){
        
        Usuarios usuarioAtualizar = BuscarUsuarioPorMatricula(matricula);
        
        if (usuarioAtualizar != null) {
            
            usuarioAtualizar.setNome(novoNome);
            usuarioAtualizar.setCpf(novoCpf);
            
                System.out.println("\nUsuário " + matricula + " atualizado para:\nNome: " + novoNome + "\nCPF: " + novoCpf);
                
            return true;
                
        }
        
        else {
            
            System.out.println("Erro, usuario não encontrado;");
            
            return false;
        }
    }
    
    public void RegistrarEmprestimo (Usuarios usuario, Livros livro){
        
        if (livro != null && usuario != null){

            if (livro.getStatus().equalsIgnoreCase("Disponivel")){

                System.out.println("\nEmpréstimo de '" + livro.getTitulo() + "' para '" + usuario.getNome() + "' registrado com sucesso.");

                livro.status = "emprestado";
            
            }

            else {

                System.out.println("Livro indisponível.");

            }
        
        }

        else {

           System.out.println("Erro! livro ou usuário não registrado.");
   
        }

    }

    public void EncerrarEmprestimo (Usuarios usuario, Livros livro) {
        
       if (livro != null && usuario != null){
           
              if (livro.getStatus().equalsIgnoreCase("emprestado")){
            
            System.out.println("\nLivro devolvido!");
            
            livro.status = "disponivel";
            
            }

            else {

                System.out.println("\nLivro não emprestado.");

            }
              
       }
       
       else {
                     
           System.out.println("Erro! livro ou usuário não registrado.");

       }
     
    }
    
    @Override
    public String toString() {
        return "SistemaBiblioteca{" + "acervo=" + acervo + ", usuariosCadastrados=" + usuariosCadastrados + '}';
    }

}
