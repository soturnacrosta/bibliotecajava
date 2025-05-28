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
        Livros livro2 = new Livros ("terror", "STOKER", "disponivel", "alucard");

       // Livros livro3 = new Livros ("teste", "arroz", "a", "123");
        
        //Usuarios usuario1 = new Usuarios ("lucas", "001", "123");
        
        SistemaBiblioteca biblioteca1 = new SistemaBiblioteca ();
        
        Bibliotecario bibliotecario1 = new Bibliotecario ("alan", "001", biblioteca1);
        
        biblioteca1.CadastrarLivro(livro1);
                biblioteca1.CadastrarLivro(livro2);


        Usuarios usuario = new Usuarios ("MAilton", "123", "1244");
       
        biblioteca1.BuscarLivroPorGenero("terror");


                   

        
    }
}
