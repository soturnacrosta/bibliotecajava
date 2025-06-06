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

    public Bibliotecario(String nome, String cpf, SistemaBiblioteca sistemaBiblioteca ) {
        
        super(nome, cpf);
        
            this.sistemaBiblioteca = sistemaBiblioteca; //isso que associa que o bibliotecario vai gerenciar
   
    }
    
    //Quando você cria um objeto Bibliotecario, você passa a ele qual SistemaBiblioteca ele vai gerenciar.
   
    public void CadastrarLivro(Livros livro) {
        
        
        System.out.println(this.getNome() + " está cadastrando um livro.");
        
            this.sistemaBiblioteca.CadastrarLivro(livro); 

    }
    
    public void RemoverLivro (String codigo) {
        
        System.out.println("\n" + this.getNome() + " está removendo um livro.");
        
            this.sistemaBiblioteca.RemoverLivro(codigo);
        
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
        
            this.sistemaBiblioteca.BuscarLivroPorCodigo(codigo);

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
     
    public void ModificarUsuarios (int matricula, String novoNome, String novoCpf, int novaMatricula) {
        
        System.out.println(this.getNome() + " está modificando um usário.");
        
            if (this.sistemaBiblioteca.AtualizarUsuario(matricula, novoNome, novoCpf, novaMatricula)) { //ele apenas chama o método
            
        }
        
        else {
            
            System.out.println("Falha na modificação do usuario por " + this.getNome());

        }
            
    }
    
    public void CadastrarUsuario (Usuarios usuario) {
        
        System.out.println(this.getNome() + " está cadastrando um usuário.");
        
            this.sistemaBiblioteca.CadastraUsuario(usuario);
            
        System.out.println("Erro! Usuário com essa matrícula já cadastrado! Tente novamente com outra matrícula.");
        
    }
    
    public void RemoverUsuario (int matricula) {
        
        Usuarios usuarioRemover = sistemaBiblioteca.BuscarUsuarioPorMatricula(matricula);
        
        if (usuarioRemover != null) {
            
             this.sistemaBiblioteca.RemoverUsuario(usuarioRemover);
        
            System.out.println(this.getNome() + " está removendo um usuário.");
            
        }
       
        else {
            
            
        }
        
    }
    
    public void BuscarUsuarioPorNome (String nome) {
        
        System.out.println("Consultando usuário por nome...");
        
            this.sistemaBiblioteca.BuscarUsuarioPorNome(nome);
            
    }
    
    public void BuscarUsuarioPorCpf (String cpf) {
        
        System.out.println("Consultando usuário por CPF...");

            this.sistemaBiblioteca.BuscarUsuarioPorCpf(cpf);
            
    }
    
    public void BuscarUsuarioPorMatricula (int matricula) {
        
        System.out.println("Consultando usuário por matricula...");

            this.sistemaBiblioteca.BuscarUsuarioPorMatricula(matricula);
            
    }
    
    public void VerAcervo () {
        
        System.out.println("Verificando acervo...");
        
            this.sistemaBiblioteca.getAcervo();
            
    }
    
    public void RegistrarEmprestimo (int matricula, String codigo) {
        
        Usuarios usuarioEmprestimo = sistemaBiblioteca.BuscarUsuarioPorMatricula(matricula);

        Livros livroEmprestimo = sistemaBiblioteca.BuscarLivroPorCodigo(codigo);

        System.out.println("Registrando emprestimo...");
        
            this.sistemaBiblioteca.RegistrarEmprestimo(usuarioEmprestimo, livroEmprestimo);
            
    }
    
    public void EncerrarEmprestimo (int matricula, String codigo) {
        
        Usuarios usuarioEmprestimo = sistemaBiblioteca.BuscarUsuarioPorMatricula(matricula);

        Livros livroEmprestimo = sistemaBiblioteca.BuscarLivroPorCodigo(codigo);
        
        System.out.println("Encerrando emprestimo...");
        
            this.sistemaBiblioteca.EncerrarEmprestimo(usuarioEmprestimo, livroEmprestimo);
            
    }
            
}
