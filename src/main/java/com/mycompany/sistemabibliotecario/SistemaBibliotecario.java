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
        Livros livro2 = new Livros ("teste", "terror", "cu", "disponivel", "002");
        
        Usuarios usuario1 = new Usuarios ("MAilton", "123", "001");
        Usuarios usuario2 = new Usuarios ("matheus", "000", "999");
        
        
        SistemaBiblioteca biblioteca1 = new SistemaBiblioteca ();

        
        Bibliotecario bibliotecario1 = new Bibliotecario ("Mailton", "123", "001", biblioteca1);
        
        biblioteca1.CadastrarUsuario(usuario1);
        
        bibliotecario1.cadastrarLivro(livro1);
        
        biblioteca1.AtualizarLivro("001", "c", "c", "c", "c");
        //bibliotecario1.ModificarDadosLivro("001", "c", "c", "c", "c");

        //biblioteca1.AtualizarUsuario("001", "marcos", "1234", "999");
        
        //biblioteca1.AtualizarUsuario("999", "novoNome", "novoCpf", "sa");
        
       
        
    }
}
