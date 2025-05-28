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

        Livros livro1 = new Livros ("terror", "bram", "disponivel", "dracula");
        Livros livro2 = new Livros ("terror", "cu", "disponivel", "dracula");

       // Livros livro3 = new Livros ("teste", "arroz", "a", "123");
        
        //Usuarios usuario1 = new Usuarios ("lucas", "001", "123");
        
        SistemaBiblioteca biblioteca1 = new SistemaBiblioteca ();
        
        Bibliotecario bibliotecario1 = new Bibliotecario ("alan", "001", biblioteca1);
        
        biblioteca1.CadastrarLivro(livro1);
        biblioteca1.CadastrarLivro(livro2);


        Usuarios usuario = new Usuarios ("marlon", "123", "1244");
        Usuarios usuario2 = new Usuarios ("marlon", "124", "104");

        biblioteca1.CadastrarUsuario(usuario);
        biblioteca1.CadastrarUsuario(usuario2);

        
        biblioteca1.BuscarLivroPorTitulo("dracula");
        
        //biblioteca1.AtualizarUsuario("1244", "marcos", "100", "002");
        
        
        //biblioteca1.BuscarLivroPorAutor("arroz");
        
        
        //biblioteca1.buscarUsuarioPorMatricula("002");
        
        //biblioteca1.RemoverUsuario(usuario);
        
        biblioteca1.buscarUsuarioPorNome("marlon");

        
        //System.out.println(usuario);
       
        //biblioteca1.BuscarLivroPorAutor("bram");

       // biblioteca1.AtualizarLivro("dracula", "frankenstein", "maria", "suspense", "devolvido");
                   
       //System.out.println(biblioteca1);
        
    }
}
