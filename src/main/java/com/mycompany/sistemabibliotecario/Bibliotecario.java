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
   
    public void CadastrarLivro(Livros livro) {
        
        
        System.out.println(this.getNome() + " está cadastrando um livro.");
        
            this.sistemaBiblioteca.CadastrarLivro(livro); 

    }
    
    public void RemoverLivro (Livros livro) {
        
        System.out.println(this.getNome() + " está removendo um livro.");
        
            this.sistemaBiblioteca.RemoverLivro(livro);
        
    }
    
    public void ModificarDadosLivro(String codigo, String novoTitulo, String novoAutor, String novoGenero, String novoStatus) {
        
        System.out.println(this.getNome() + " está modificando um livro.");

            if (this.sistemaBiblioteca.AtualizarLivro(codigo, novoTitulo, novoAutor, novoGenero, novoStatus)) { //apenas chama o método
            
        } 
        
        else {
            
            
            System.out.println("Falha na modificação do livro por " + this.getNome());
            
        }
    }
    
    public void BuscaLivroPorCodigo (String codigo) {
        
        System.out.println("Consultando livro por codigo...");
        
            this.sistemaBiblioteca.BuscaLivroPorCodigo(codigo);

    }
    
    public void BuscaLivroPorTitulo (String titulo) {
        
        System.out.println("Consultando livro por titulo...");

            this.sistemaBiblioteca.BuscarLivroPorTitulo(titulo);
            
    }
    
    public void BuscaLivroPorAutor (String autor) {
        
        System.out.println("Consultando livro por autor...");

            this.sistemaBiblioteca.BuscarLivroPorAutor(autor);
            
    }
    
    public void BuscaLivroPorGenero (String genero) {
        
        System.out.println("Consultando livro por genero...");

            this.sistemaBiblioteca.BuscarLivroPorGenero(genero);
            
    }
     
    public void ModificarUsuarios (String matricula, String novoNome, String novoCpf, String novaMatricula) {
        
        System.out.println(this.getNome() + " está modificando um usário.");
        
            if (this.sistemaBiblioteca.AtualizarUsuario(matricula, novoNome, novoCpf, novaMatricula)) { //ele apenas chama o método
            
        }
        
        else {
            
            System.out.println("Falha na modificação do usuario por " + this.getNome());

        }
            
    }
    
    public void CadastrarUsuario (Usuarios usuario) {
        
        System.out.println(this.getNome() + " está cadastrando um usuário.");
        
            this.sistemaBiblioteca.CadastrarUsuario(usuario);
        
    }
    
    public void RemoverUsuario (Usuarios usuario) {
        
        System.out.println(this.getNome() + " está removendo um usuário.");

            this.sistemaBiblioteca.RemoverUsuario(usuario);
            
    }
    
    public void BuscarUsuarioPorNome (String nome) {
        
        System.out.println("Consultando usuário por nome...");
        
            this.sistemaBiblioteca.BuscarUsuarioPorNome(nome);
            
    }
    
    public void BuscarUsuarioPorCpf (String cpf) {
        
        System.out.println("Consultando usuário por CPF...");

            this.sistemaBiblioteca.BuscarUsuarioPorCpf(cpf);
            
    }
    
    public void BuscarUsuarioPorMatricula (String matricula) {
        
        System.out.println("Consultando usuário por nome...");

            this.sistemaBiblioteca.BuscarUsuarioPorMatricula(matricula);
            
    }
    
    public void VerAcervo () {
        
        System.out.println("Verificando acervo...");
        
            this.sistemaBiblioteca.getAcervo();
            
    }
}
