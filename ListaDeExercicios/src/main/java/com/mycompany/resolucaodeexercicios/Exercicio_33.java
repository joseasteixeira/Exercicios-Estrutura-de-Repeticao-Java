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
public class Exercicio_33 {
    /*
    O Departamento Estadual de Meteorologia lhe contratou para desenvolver 
    um programa que leia a um conjunto indeterminado de temperaturas, e 
    informe ao final a menor e a maior temperaturas informadas, bem como a 
    média das temperaturas.
    */
    public static void main(String[] args){
        float minima, maxima, media, aux=0;
        int quantidadeTemperaturas;
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Informe a quantidade de temperaturas: ");
        quantidadeTemperaturas=scan.nextInt();
        float[] temperaturas=new float[quantidadeTemperaturas];
        
        for(int i=0;i<quantidadeTemperaturas;i++){
            System.out.println("Informe a "+(i+1)+"° temperatura: ");
            temperaturas[i]=scan.nextFloat();
        }
        minima=maxima=temperaturas[0];
        for(int i=0;i<quantidadeTemperaturas;i++){
            aux+=temperaturas[i];
            if(minima>temperaturas[i]){
                minima=temperaturas[i];
            }
            if(maxima<temperaturas[i]){
                maxima=temperaturas[i];
            }
        }
        media=aux/quantidadeTemperaturas;
        System.out.println("Menor temperatura: "+minima+"°C");
        System.out.println("Maior temperatura: "+maxima+"°C");
        System.out.println("Media das temperatura: "+media+"°C");
    }
}
