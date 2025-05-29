/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemabibliotecario;

/**
 *
 * @author mailton
 */
public class SistemaBibliotecario {

    public static void main(String[] args) {

        Livros livro1 = new Livros ("dracula", "terror", "bram", "disponivel", "001");
        Livros livro2 = new Livros ("c", "terror", "bram", "disponivel", "002");
        
        Usuarios usuario1 = new Usuarios ("MAilton2", "123", "001");
        Usuarios usuario2 = new Usuarios ("mailton2", "123", "999");
        

        SistemaBiblioteca biblioteca1 = new SistemaBiblioteca ();

        
        Bibliotecario bibliotecario1 = new Bibliotecario ("bibliotecario", "123", "001", biblioteca1);
        
        bibliotecario1.CadastrarLivro(livro1);
        bibliotecario1.CadastrarLivro(livro2);

        //usuario1.EmprestarLivro(livro1);
        //usuario1.JaTemLivroEmprestado(livro1);
        
        bibliotecario1.RegistrarEmprestimo(usuario2, livro2);
        usuario2.JaTemLivroEmprestado(livro2);
        bibliotecario1.EncerrarEmprestimo(usuario2, livro2);
        usuario2.JaTemLivroEmprestado(livro2);

        //biblioteca1.RegistrarEmprestimo(usuario1, livro1);
        //biblioteca1.RegistrarEmprestimo(usuario1, livro1);

        
        //bibliotecario1.CadastrarUsuario(usuario2);
        
        //bibliotecario1.BuscaLivroPorAutor("bram");
        
       
        /*
     
        
        bibliotecario1.BuscarUsuarioPorNome("mailton");
        
        //bibliotecario1.ModificarUsuarios("001", "novoNome", "novoCpf", "novaMatricula");
        
        
        
        //biblioteca1.AtualizarLivro("001", "c", "c", "c", "c");
        //bibliotecario1.ModificarDadosLivro("001", "c", "c", "c", "c");

        //biblioteca1.AtualizarUsuario("001", "marcos", "1234", "999");
        
        //biblioteca1.AtualizarUsuario("999", "novoNome", "novoCpf", "sa");
        
       
        */
    }
}
