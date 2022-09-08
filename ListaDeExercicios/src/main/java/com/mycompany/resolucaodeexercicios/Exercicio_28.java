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
public class Exercicio_28 {
    /*
    Faça um programa que calcule o valor total investido por um colecionador 
    em sua coleção de CDs e o valor médio gasto em cada um deles. O usuário 
    deverá informar a quantidade de CDs e o valor para em cada um.
    */
    public static void main(String[] args){
        int quantidadeCD;
        float valorCD=0, totalGasto=0, media;
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Informe a quantidade de CDs: ");
        quantidadeCD=scan.nextInt();
        
        for(int i=0;i<quantidadeCD;i++){
            System.out.println("Informe o valor do "+(i+1)+"° CD: ");
            valorCD=scan.nextInt();
            totalGasto+=valorCD;
        }
        media=totalGasto/quantidadeCD;
        System.out.println("Total gasto: "+totalGasto);
        System.out.println("Média do valor dos CDs: "+media);
    }
}
