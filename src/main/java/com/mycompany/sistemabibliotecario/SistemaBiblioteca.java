/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemabibliotecario;

import java.time.LocalDate;
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
    
    public void RemoverLivro (Livros livro) {
        
        this.acervo.remove(livro);
        
        System.out.println("Livro '" + livro.getTitulo() + "' removido do acervo.\n");
        
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
          
          return resultados; // Livro não encontrado
          
      }
    
    public Livros BuscarLivroPorCodigo (String codigo) { //precisa ser retorno UNICO para poder atualizar o dado. Não pode ser lista.
        
        for (Livros l : acervo) {

                if (l.getCodigo().equalsIgnoreCase(codigo)) {

                    System.out.println("\nTitulo encontrado: " + l);

                    return l; //retorna todos os resultados adicionando o list

                }
          }
          
          return null; // Livro não encontrado
          
    }
     
    public Livros BuscarLivroPorGenero(String genero) {
        
        List<Livros> resultados = new ArrayList<>(); //criar array de todos os resultados da busca

            for (Livros l : acervo) {

                    if (l.getGenero().equalsIgnoreCase(genero)) {

                        System.out.println("\nTitulo encontrado: " + l);

                        resultados.add(l);

                    }
                }

            return null; // Livro não encontrado

          }
    
    public Livros BuscarLivroPorAutor (String autor) {
         
        List<Livros> resultados = new ArrayList<>();

        for (Livros l : acervo) {
              
                if (l.getAutor().equalsIgnoreCase(autor)) {

                    System.out.println("\nTitulo encontrado: " + l);

                    resultados.add(l);
                }
        }
          
        return null; // Livro não encontrado
    }
    
    //#######################CONSULTA COMPLETA################################3
    public List<Livros> getAcervo() { //consulta completa do acervo

        System.out.println(acervo);

        return new ArrayList<>(acervo);
        
    }
 
    // Gerenciamento de Usuários
    public void CadastrarUsuario(Usuarios usuario) {
        
        this.usuariosCadastrados.add(usuario);
        
        System.out.println("\nUsuário '" + usuario.getNome() + "' cadastrado.\n");
        
    }
    
    public void RemoverUsuario (Usuarios usuario) {
        
        this.usuariosCadastrados.remove(usuario);
        
        System.out.println("\nUsuário '" + usuario.getNome() + "' excluído.\n");

    }

    public Usuarios BuscarUsuarioPorMatricula(String matricula) {
        
        for (Usuarios u : usuariosCadastrados) {
            
            if (u.getMatricula().equalsIgnoreCase(matricula)) {
                
                System.out.println("\nUsuário encontrado.\nNome: " + u.getNome() + "\nMatrícula: " + u.getMatricula() + "\nCpf:" + u.getCpf() + "\n");
                return u; // <--- Retorna o usuário IMEDIATAMENTE quando encontra
            }
            
        }
        
        System.out.println("Usuário com matrícula '" + matricula + "' não encontrado.");
        
        return null; // Retorna null se nenhum usuário for encontrado
        
    }

           
        public Usuarios BuscarUsuarioPorCpf(String cpf) {
        
        for (Usuarios u : usuariosCadastrados) { //como cpf e matricula são unicos, não precisa retornar multiplos retornados, nada de lista
            
            if (u.getCpf().equalsIgnoreCase(cpf)) {
                
                System.out.println("\nUsuário encontrado.\nNome: " + u.getNome() + "\nMatrícula: " + u.getMatricula() + "\nCpf:" + u.getCpf() + "\n");
                
                return u;
                
            }
            
        }
        
            System.out.println("Usuário não encontrado.\n");

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
    
    public  boolean AtualizarUsuario (String matricula, String novoNome, String novoCpf, String novaMatricula){
        
        Usuarios usuarioAtualizar = BuscarUsuarioPorMatricula(matricula);
        
        if (usuarioAtualizar != null) {
            
            usuarioAtualizar.setNome(novoNome);
            usuarioAtualizar.setCpf(novoCpf);
            usuarioAtualizar.setMatricula(novaMatricula);
            
                System.out.println("\nUsuário " + matricula + " atualizado para:\nNome: " + novoNome + "\nCPF: " + novoCpf + "\nMatricula: " + novaMatricula);
                
            return true;
                
        }
        
        else {
            
            System.out.println("Erro, usuario não encontrado;");
            
            return false;
        }
    }
    
    public void RegistrarEmprestimo (Usuarios usuario, Livros livro){
        
          
        if (livro.getStatus().equalsIgnoreCase("Disponivel")){

                System.out.println("\nEmpréstimo de '" + livro.getTitulo() + "' para '" + usuario.getNome() + "' registrado com sucesso.");

                livro.status = "emprestado";

        }

        else {

            System.out.println("Livro indisponível.");

        }
            
    }
    
    public void EncerrarEmprestimo (Usuarios usuario, Livros livro) {
        
        if (livro.getStatus().equalsIgnoreCase("emprestado")){
            
            System.out.println("\nLivro devolvido!");
            
            livro.status = "disponivel";
            
        }
        
        else {
            
            System.out.println("\nLivro não emprestado.");
            
        }
    }
    
    @Override
    public String toString() {
        return "SistemaBiblioteca{" + "acervo=" + acervo + ", usuariosCadastrados=" + usuariosCadastrados + '}';
    }

}
