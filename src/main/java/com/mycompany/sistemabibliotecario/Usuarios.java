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
public class Usuarios {

    protected String nome, cpf, matricula;
    protected List<Livros> livros = new ArrayList<>(); //deixe que as listas sejam tratadas na propria classe

    public Usuarios(String nome, String cpf, String matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.livros = new ArrayList<>(); //inicializa a lista toda vez
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
    public boolean EmprestarLivro (Livros livro) { //precisa ser boolean para retornar true ou false
        
        if (livro != null && livro.status.equalsIgnoreCase("disponivel")) { // Verifica se o livro existe e está disponível
                
             this.livros.add(livro);
                
                livro.setStatus("Emprestado"); // O livro agora está emprestado
                
                System.out.println("Livro '" + livro.getTitulo() + "' adicionado à lista de '" + this.getNome() + "'.");
                   
            return true;
        }
         
        else {
            
            System.out.println("Erro: Livro '" + (livro != null ? livro.getTitulo() : "nulo") + "' não pode ser emprestado (não disponível).");

        }
        
        return false;
        
    }
    
      public boolean RemoverLivroEmprestado(Livros livro) {
          
        if (livro != null && this.livros.remove(livro)) { // Tenta remover da lista deste usuário
            
            livro.setStatus("Disponível"); // O livro agora está disponível
            
                System.out.println("Livro '" + livro.getTitulo() + "' removido da lista de '" + this.getNome() + "'.");
            
            return true;
        }
        
            System.out.println("Erro: Livro '" + (livro != null ? livro.getTitulo() : "nulo") + "' não estava emprestado por '" + this.getNome() + "'.");
        
        return false;
        
    }
      
    public boolean JaTemLivroEmprestado(Livros livro) {
        
        if (livro.status.equalsIgnoreCase("Emprestado")){
            
            System.out.println("Já emprestado.");
            
                return this.livros.contains(livro);

        }
        
        else {
            
            System.out.println("Ainda não emprestado.");
            
            return false;
        }
        
    }

    @Override
    public String toString() {
        return "Usuarios{" + "nome=" + nome + ", cpf=" + cpf + ", matricula=" + matricula + ", livros=" + livros + '}';
    }
    
}
