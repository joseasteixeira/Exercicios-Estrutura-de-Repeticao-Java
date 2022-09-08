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
public class Exercicio_39 {
    /*
    Faça um programa que leia dez conjuntos de dois valores, o primeiro 
    representando o número do aluno e o segundo representando a sua altura 
    em centímetros. Encontre o aluno mais alto e o mais baixo. Mostre o número 
    do aluno mais alto e o número do aluno mais baixo, junto com suas alturas.
    */
    public static void main(String[] args){
        int tamanho=10;
        float[] altura=new float[tamanho];
        int[] numero=new int[tamanho];
        float maisAlto, maisBaixo;
        int numeroMaisAlto=0, numeroMaisBaixo=0;
        Scanner scan=new Scanner(System.in);
        
        for(int i=0;i<tamanho;i++){
            System.out.println("Digite o "+(i+1)+"° numero: ");
            numero[i]=scan.nextInt();
            System.out.println("Digite a "+(i+1)+"° altura (cm): ");
            altura[i]=scan.nextFloat();
        }
        maisAlto=maisBaixo=altura[0];
        numeroMaisAlto=numeroMaisBaixo=numero[0];
        for(int i=0;i<tamanho;i++){
            if(maisAlto<altura[i]){
                maisAlto=altura[i];
                numeroMaisAlto=numero[i];
            }
            if(maisBaixo>altura[i]){
                maisBaixo=altura[i];
                numeroMaisBaixo=numero[i];
            }
        }
        System.out.println("\nAluno mais alto: \nNumeor: "+numeroMaisAlto+
                           "\nAltura: "+maisAlto+" cm");
        System.out.println("\nAluno mais baixo: \nNumeor: "+numeroMaisBaixo+
                           "\nAltura: "+maisBaixo+" cm");
    }
}
