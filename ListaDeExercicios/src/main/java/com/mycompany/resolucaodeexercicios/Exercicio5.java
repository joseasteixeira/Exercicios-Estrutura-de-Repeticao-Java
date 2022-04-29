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
public class Exercicio5 {
    /*
    Altere o programa anterior permitindo ao usuário informar as populações 
    e as taxas de crescimento iniciais. Valide a entrada e permita repetir 
    a operação.
    */
    
    public static void main(String[] args){
        int A, B, cont=0;
        float taxaA, taxaB;
        Scanner scan=new Scanner(System.in);
        System.out.println("Informe a quantidade da habitantes da cidade A: ");
        A=scan.nextInt();
        System.out.println("Informe a taixa de crescimento da cidade A em %: ");
        taxaA=scan.nextFloat();
        System.out.println("Informe a quantidade da habitantes da cidade B: ");
        B=scan.nextInt();
        System.out.println("Informe a taixa de crescimento da cidade B em %: ");
        taxaB=scan.nextFloat();
        
        while(A<B){
            A=(int)(A+(A*taxaA/100));
            B=(int)(B+(B*taxaB/100));
            cont++;
        }
        System.out.println("Seram necessarios "+cont+" anos para a popolação"
                + " da cidade A ser maior ou igual a população da cidade B.");
        System.out.println("A cidade A terá "+A+" habitantes, e a cidade B "
                +B+" habitantes");
    }
}
