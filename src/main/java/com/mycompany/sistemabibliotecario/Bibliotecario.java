/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemabibliotecario;

/**
 *
 * @author mailton
 */
public class Bibliotecario implements InterfaceBibliotecario {
    
    public String nome;
    protected String matricula;
    private SistemaBiblioteca sistemaBiblioteca;

    public Bibliotecario(String nome, String matricula, SistemaBiblioteca sistemaBiblioteca) {
        this.nome = nome;
        this.matricula = matricula;
        this.sistemaBiblioteca = sistemaBiblioteca;
    }

    @Override
    public void CadastrarLivro() {
        
    }

    @Override
    public void ModificarLivro() {

    }

    @Override
    public void RemoverLivro() {

    }

    @Override
    public void RegisrarEmprestimo() {

    }

    @Override
    public void EncerrarEmprestimo() {

    }

    @Override
    public String toString() {
        return "Bibliotecario{" + "nome=" + nome + ", matricula=" + matricula + ", sistemaBiblioteca=" + sistemaBiblioteca + '}';
    }
    
}
