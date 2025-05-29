/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemabibliotecario;

/**
 *
 * @author mailton
 */
public class Livros {
    
    public String genero, autor, status, titulo, codigo;

    public Livros( String titulo, String genero, String autor, String status, String codigo) {
       
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.status = status;
        this.codigo = codigo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Livros{" + "genero=" + genero + ", autor=" + autor + ", status=" + status + ", titulo=" + titulo + '}';
    }

}
