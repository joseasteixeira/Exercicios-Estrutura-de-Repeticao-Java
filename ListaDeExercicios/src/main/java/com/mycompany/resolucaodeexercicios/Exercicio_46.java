/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resolucaodeexercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
/**
 *
 * @author Jose Teixeira
 */
public class Exercicio_46 {
    /*
    Em uma competição de salto em distância cada atleta tem direito a cinco 
    saltos. No final da série de saltos de cada atleta, o melhor e o pior 
    resultados são eliminados. O seu resultado fica sendo a média dos três 
    valores restantes. Você deve fazer um programa que receba o nome e as cinco 
    distâncias alcançadas pelo atleta em seus saltos e depois informe a média 
    dos saltos conforme a descrição acima informada (retirar o melhor e o pior 
    salto e depois calcular a média). Faça uso de uma lista para armazenar os 
    saltos. Os saltos são informados na ordem da execução, portanto não são 
    ordenados. O programa deve ser encerrado quando não for informado o nome 
    do atleta. A saída do programa deve ser conforme o exemplo abaixo:
    Atleta: Rodrigo Curvêllo

    Primeiro Salto: 6.5 m
    Segundo Salto: 6.1 m
    Terceiro Salto: 6.2 m
    Quarto Salto: 5.4 m
    Quinto Salto: 5.3 m

    Melhor salto:  6.5 m
    Pior salto: 5.3 m
    Média dos demais saltos: 5.9 m

    Resultado final:
    Rodrigo Curvêllo: 5.9 m
    */
    public static void main(String[] args){
        String nome="", comp="";
        double saltos;
        Scanner scan=new Scanner(System.in);
        List<Double> distancia=new ArrayList<Double>();
        NumberFormat formatter = new DecimalFormat("#0.00");
        
        //while(!(nome.isEmpty())){
        System.out.println("Informe o nome do atleta: ");
        nome=scan.next();
        //if(nome.equals(comp)) System.exit(0);
        
        for(int i=0;i<5;i++){
            System.out.println("Informe a "+(i+1)+"° distancia: ");
            saltos=scan.nextDouble();
            distancia.add(saltos);
        }
        System.out.println("\nAtleta: "+nome);
        System.out.println("\nPrimeiro salto: "+distancia.get(0)+" m"
                          +"\nSegundo salto: "+distancia.get(1)+" m"
                          +"\nTerceiro salto: "+distancia.get(2)+" m"
                          +"\nQuarto salto: "+distancia.get(3)+" m"
                          +"\nQuinto salto: "+distancia.get(4)+" m");
        System.out.println("\nMelhor salto: "+Collections.max(distancia)+" m");
        System.out.println("Pior salto: "+Collections.min(distancia)+" m");
        
        Iterator<Double> iterator=distancia.iterator();
        Double soma=0d;
        while(iterator.hasNext()){
            double next=iterator.next();
            soma+=next;
        }
        double media=(soma-Collections.max(distancia)-Collections.min(distancia))/3;
        
        System.out.println("Media dos demais saltos: "+formatter.format(media)+" m");
        System.out.println("\nResultadi final:\n"+nome+": "+formatter.format(media)+" m\n");
        //}
        
    }
}
