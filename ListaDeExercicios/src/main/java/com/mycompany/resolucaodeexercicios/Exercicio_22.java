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
public class Exercicio_22 {
    /*
    Altere o programa de cálculo dos números primos, informando, caso o número 
    não seja primo, por quais número ele é divisível.
    */
    public static void main(String[] args){
        int numero;
        boolean teste=false;
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Informe um número: ");
        numero=scan.nextInt();
        
        for(int i=(numero-1);i>1;i--){
            if(numero%i==0){
                teste=true;
                break;
            }
        }
        if(teste==true){
            System.out.println("Não é um número primo!");
        }
        
        else{
            System.out.println("È um número primo!");
        }
        for(int i=(numero-1);i>1;i--){
            if(numero%i==0){
                System.out.println("Divisivel por: "+i);
            }
        }
    }
}
