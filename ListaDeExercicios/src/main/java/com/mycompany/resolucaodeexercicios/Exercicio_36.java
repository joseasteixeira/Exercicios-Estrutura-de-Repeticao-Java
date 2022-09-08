/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resolucaodeexercicios;

import java.util.Scanner;

/**
 *
 * @author Jose Teixeira
 */
public class Exercicio_36 {
    /*
    Desenvolva um programa que faça a tabuada de um número qualquer inteiro 
    que será digitado pelo usuário, mas a tabuada não deve necessariamente 
    iniciar em 1 e terminar em 10, o valor inicial e final devem ser informados 
    também pelo usuário, conforme exemplo abaixo:
    Montar a tabuada de: 5
    Começar por: 4
    Terminar em: 7

    Vou montar a tabuada de 5 começando em 4 e terminando em 7:
    5 X 4 = 20
    5 X 5 = 25
    5 X 6 = 30
    5 X 7 = 35
    Obs: Você deve verificar se o usuário não digitou o final menor que o inicial.
    */
    public static void main(String[] args){
        int numeroTabuada, inicio, fim;
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Montar a tabuada de: ");
        numeroTabuada=scan.nextInt();
        System.out.println("Começar por: ");
        inicio=scan.nextInt();
        fim=inicio-1;
        for(int i=0;fim<inicio;i++){
            System.out.println("Terminar em: ");
            fim=scan.nextInt();
        }
        System.out.println("Vou montar a tabuada de "+numeroTabuada+" começando em "+inicio+" e terminando em "+fim+":");
        for(int i=inicio;i<=fim;i++){
            System.out.println(numeroTabuada+" X "+i+" = "+(numeroTabuada*i));
        }
    }
}
