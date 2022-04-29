/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resolucaodeexercicios;

import java.util.Scanner;

/**
 *
 * @author José Teixeira
 */
public class Exercicio2 {
    /*
    Faça um programa que leia um nome de usuário e a sua senha
    e não aceite a senha igual ao nome do usuário, mostrando uma
    mensagem de erro e voltando a pedir as informações
    */
    
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String nome=null, senha=null;
        
        do{
            System.out.println("Informe o nome: ");
            nome=scan.next();
            System.out.println("Informe a senha: ");
            senha=scan.next();
            
            if(nome.equals(senha)){
                System.out.println("O nome precisa ser diferente da senha!");
            }
        }
        while(nome.equals(senha));
        
    }
}
