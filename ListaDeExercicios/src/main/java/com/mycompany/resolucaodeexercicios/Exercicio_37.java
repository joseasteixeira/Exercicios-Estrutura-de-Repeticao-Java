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
public class Exercicio_37 {
    /*
    Uma academia deseja fazer um senso entre seus clientes para descobrir o 
    mais alto, o mais baixo, a mais gordo e o mais magro, para isto você deve 
    fazer um programa que pergunte a cada um dos clientes da academia seu 
    código, sua altura e seu peso. O final da digitação de dados deve ser 
    dada quando o usuário digitar 0 (zero) no campo código. Ao encerrar o 
    programa também deve ser informados os códigos e valores do clente mais 
    alto, do mais baixo, do mais gordo e do mais magro, além da média das 
    alturas e dos pesos dos clientes
    */
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        float altura, peso, maiorAltura=0, menorAltura=10, menorPeso=1000, maiorPeso=0,
              mediaAltura, auxAltura=0, mediaPeso, auxPeso=0;
        int codigo=1, cont=0;
        
        while(codigo!=0){
            
            System.out.println("Informe o codigo: ");
            codigo=scan.nextInt();
            if(codigo==0){
                break;
            }
            System.out.println("Informe o peso: ");
            peso=scan.nextFloat();
            auxPeso+=peso;
            if(menorPeso>peso){
                menorPeso=peso;
            }
            else;
            if(maiorPeso<peso){
                maiorPeso=peso;
            }
            else;
            System.out.println("Informe a altura: ");
            altura=scan.nextFloat();
            auxAltura+=altura;
            if(menorAltura>altura){
                menorAltura=altura;
            }
            else;
            if(maiorAltura<altura){
                maiorAltura=altura;
            }
            else;
            
            cont++;
        }
        mediaPeso=auxPeso/cont;
        mediaAltura=auxAltura/cont;
        System.out.println("Maior peso: "+maiorPeso);
        System.out.println("Menor peso: "+menorPeso);
        System.out.println("Media peso: "+mediaPeso);
        
        System.out.println("Maior altura: "+maiorAltura);
        System.out.println("Menor altura: "+menorAltura);
        System.out.println("Media altura: "+mediaAltura);
    }
}
