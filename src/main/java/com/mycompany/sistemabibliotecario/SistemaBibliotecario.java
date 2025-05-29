/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemabibliotecario;
import java.util.Scanner;
/**
 *
 * @author mailton
 */
public class SistemaBibliotecario {

    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);
        String escolha;
        
        System.out.println("##############BIBLIOTECA##############");
        System.out.println("Bem vindo!");  
        System.out.println("Selecione uma das opções:");   
        System.out.println("1. Entrar como usuário.");
        System.out.println("2. Entrar como bibliotecário.\n");
        System.out.println("0. Encerrar.");
        System.out.println("##############XXXXXXXXXX##############");
            escolha = teclado.nextLine();
            
        switch (escolha) {
            
            case "1": 
                
                    System.out.println("\n##############BIBLIOTECA##############");
                    System.out.println("Selecione uma das opções:");   
                    System.out.println("1. Consultar acervo de livros.");
                    System.out.println("2. Fazer empréstimo de livros.");
                    System.out.println("3. Devolver livros.");
                    System.out.println("0. Encerrar.");
                    System.out.println("##############XXXXXXXXXX##############");
                
                break;
                
            case "2":
                
                    System.out.println("\n##############BIBLIOTECA##############");
                    System.out.println("Selecione uma das opções:");   
                    System.out.println("1. Consultar acervo de livros.");
                    System.out.println("2. Consultar lista de usuários.");
                    System.out.println("3. Cadastrar, atualizar ou remover título.");
                    System.out.println("4. Cadastrar, atualizar ou remover usuário.\n");
                    System.out.println("0. Encerrar.");
                    System.out.println("##############XXXXXXXXXX##############");
                
                break;
                
            case "0":
                
                System.out.println("\nEncerrando...");
                
                break;
                
            default:
                
                System.out.println("Opção invãlida! Tente novamente.");
                
                break;
        }
        
        
    }
}
