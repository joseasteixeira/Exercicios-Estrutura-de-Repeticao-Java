/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resolucaodeexercicios;

/**
 *
 * @author José Teixeira
 */
public class Exercicio4 {
    /*
    Supondo que a população de um país A seja da ordem de 80000 habitantes
    com uma taxa anual de crescimento de 3% e que a população de B seja 
    200000 habitantes com uma taxa de crescimento de 1.5%. Faça um programa
    que calcule e escreva o número de anos necessários para que a população
    do país A ultrapasse ou iguale a população do país B, mantidas as taxas
    de crescimento.
    */
    public static void main(String[] args){
        int A=80000;
        int B=200000;
        int cont=0;
    
        while(A<B){
            A=(int)(A+(A*0.03));
            B=(int)(B+(B*0.015));
            cont++;
        }
        System.out.println("Seram necessarios "+cont+" anos para a popolação"
                + " da cidade A ser maior ou igual a população da cidade B.");
        System.out.println("A cidade A terá "+A+" habitantes, e a cidade B "
                +B+" habitantes");
    }
}
