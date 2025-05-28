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
    
    
    public void EmprestarLivro (Livros livro) {
        
        this.livros.add(livro);
    }
    
    public void DevolverLivro (Livros livro) {
        
        this.livros.remove(livro);
    }

    @Override
    public String toString() {
        return "Usuarios{" + "nome=" + nome + ", cpf=" + cpf + ", matricula=" + matricula + ", livros=" + livros + '}';
    }
    
}
