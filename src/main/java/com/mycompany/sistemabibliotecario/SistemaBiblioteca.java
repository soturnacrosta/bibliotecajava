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
        
        System.out.println("Livro '" + livro.getTitulo() + "' adicionado ao acervo.");
        
    }
    
    public void RemoverLivro (Livros livro) {
        
        this.acervo.remove(livro);
        
        System.out.println("Livro '" + livro.getTitulo() + "' removido do acervo.");
        
    }
    
    //####################BUSCA##############################
    public Livros BuscarLivroPorTitulo(String titulo) {
        
            for (Livros l : acervo) {

                if (l.getTitulo().equals(titulo)) {

                  System.out.println("Titulo encontrado: " + l);

                  return l;

                }
          }
          
          return null; // Livro não encontrado
          
      }
    
    public Livros BuscarLivroPorGenero(String genero) {
        
            for (Livros l : acervo) {

                if (l.getGenero().equals(genero)) {

                  System.out.println("Titulo encontrado: " + l);

                  return l;
                }
            }
          
        System.out.println("Título não encontrado.");
        
        return null; // Livro não encontrado
          
      }
    
    public Livros BuscarLivroPorAutor (String autor) {
         
        for (Livros l : acervo) {
              
                if (l.getAutor().equals(autor)) {

                    System.out.println("Titulo encontrado: " + l);

                    return l;
                }
        }
          
        System.out.println("Título não encontrado.");

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
        
        System.out.println("Usuário '" + usuario.getNome() + "' cadastrado.");
        
    }
    
    public void RemoverUsuario (Usuarios usuario) {
        
        this.usuariosCadastrados.remove(usuario);
        
        System.out.println("Usuário '" + usuario.getNome() + "' excluído.");

    }

    public Usuarios buscarUsuarioPorMatricula(String matricula) {
        
        for (Usuarios u : usuariosCadastrados) {
            
            if (u.getMatricula().equalsIgnoreCase(matricula)) {
                
                System.out.println("Encontrado: " + u);
                
                return u;
            }
            
        }
        
            System.out.println("Usuário não encontrado.");

        return null; // Usuário não encontrado
    }
    
        public Usuarios buscarUsuarioPorCpf(String cpf) {
        
        for (Usuarios u : usuariosCadastrados) {
            
            if (u.getCpf().equalsIgnoreCase(cpf)) {
                
                    System.out.println("Encontrado: " + u);
                
                return u;
            }
            
        }
        
            System.out.println("Usuário não encontrado.");

        return null; // Usuário não encontrado
    }
        
    public Usuarios buscarUsuarioPorNome (String nome) {

            for (Usuarios u : usuariosCadastrados) {

                if (u.getNome().equalsIgnoreCase(nome)) {
                    
                    System.out.println("Encontrado: " + u);

                return u;
                
                }

            }
            
            System.out.println("Usuário não encontrado.");

            return null; // Usuário não encontrado
        }

    public boolean AtualizarLivro (String titulo, String novoTitulo, String novoAutor, String novoGenero, String novoStatus) {
        
        Livros livroAtualizar = BuscarLivroPorTitulo(titulo); //usar o método de busca lá encima pra procurará
        
        if (livroAtualizar != null) {

                livroAtualizar.setTitulo(novoTitulo);

                livroAtualizar.setAutor(novoAutor);

                    System.out.println("Livro " + titulo + " atualizado para " + novoTitulo + " do autor " + novoAutor);
        
            return true;
            
        }
        
        else {
            
                System.out.println("Erro, livro não encontrado.");
            
            return false;
            
        }
        
        
    }
    
    public  boolean AtualizarUsuario (String matricula, String novoNome, String novoCpf, String novaMatricula){
        
        Usuarios usuarioAtualizar = buscarUsuarioPorMatricula(matricula);
        
        if (usuarioAtualizar != null) {
            
            usuarioAtualizar.setNome(novoNome);
            usuarioAtualizar.setCpf(novoCpf);
            usuarioAtualizar.setMatricula(novaMatricula);
            
                System.out.println("Usuário " + matricula + " atualizado para:\nNome: " + novoNome + "\nCPF: " + novoCpf + "\nMatricula: " + novaMatricula);
                
            return true;
                
        }
        
        else {
            
            System.out.println("Erro, usuario não encontrado;");
            
            return false;
        }
    }
    
    
    @Override
    public String toString() {
        
        return "SistemaBiblioteca{" + "acervo=" + acervo + ", usuariosCadastrados=" + usuariosCadastrados + '}';
    }
    
}
