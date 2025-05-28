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

        Livros livro1 = new Livros ("terror", "bram", "disponivel");
        Livros livro2 = new Livros ("terror", "STOKER", "disponivel");

        System.out.println(livro1);
        Usuarios usuario = new Usuarios ("MAilton", "123", "1244");
        usuario.EmprestarLivro(livro1);
        usuario.EmprestarLivro(livro2);        
        usuario.DevolverLivro(livro2);

        System.out.println(usuario);

        
    }
}
