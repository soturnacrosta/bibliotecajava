/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemabibliotecario;

/**
 *
 * @author mailton
 */
public class Bibliotecario extends Usuarios {
    
    private SistemaBiblioteca sistemaBiblioteca;

    public Bibliotecario(String nome, String cpf, String matricula, SistemaBiblioteca sistemaBiblioteca ) {
        
        super(nome, cpf, matricula);
        
        this.sistemaBiblioteca = sistemaBiblioteca; //isso que associa que o bibliotecario vai gerenciar
   
    }
    
    //Quando você cria um objeto Bibliotecario, você passa a ele qual SistemaBiblioteca ele vai gerenciar.
   
    public void cadastrarLivro(Livros livro) {
        
        System.out.println(this.getNome() + " está cadastrando um livro.");
        
        this.sistemaBiblioteca.CadastrarLivro(livro); 

        System.out.println("Livro " + livro + " cadastrado.");
     
    }
    
    public void ModificarDadosLivro(String codigo, String novoTitulo, String novoAutor, String novoGenero, String novoStatus) {
        
         System.out.println(this.getNome() + " está modificando um livro.");

         if (this.sistemaBiblioteca.AtualizarLivro(codigo, novoTitulo, novoAutor, novoGenero, novoStatus)) {
            
            System.out.println("Modificação de livro concluída por " + this.getNome());
            
        } 
        
        else {
            
            
            System.out.println("Falha na modificação do livro por " + this.getNome());
        }
    }
     
    
}
