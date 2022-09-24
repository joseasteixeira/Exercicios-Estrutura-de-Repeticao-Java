/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resolucaodeexercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jose Teixeira
 */
public class Exercicio_47 {
    /*
    Em uma competição de ginástica, cada atleta recebe votos de sete jurados. 
    A melhor e a pior nota são eliminadas. A sua nota fica sendo a média dos 
    votos restantes. Você deve fazer um programa que receba o nome do ginasta e 
    as notas dos sete jurados alcançadas pelo atleta em sua apresentação e depois 
    informe a sua média, conforme a descrição acima informada (retirar o melhor 
    e o pior salto e depois calcular a média com as notas restantes). As notas 
    não são informados ordenadas. Um exemplo de saída do programa deve ser 
    conforme o exemplo abaixo:
    Atleta: Aparecido Parente
    Nota: 9.9
    Nota: 7.5
    Nota: 9.5
    Nota: 8.5
    Nota: 9.0
    Nota: 8.5
    Nota: 9.7

    Resultado final:
    Atleta: Aparecido Parente
    Melhor nota: 9.9
    Pior nota: 7.5
    Média: 9,04
    */
    public static void main(String[] args){
        String nome=""; //comp="";
        double notas;
        Scanner scan=new Scanner(System.in);
        List<Double> listaNotas=new ArrayList<Double>();
        NumberFormat formatter = new DecimalFormat("#0.00");

        System.out.println("Informe o nome do atleta: ");
        nome=scan.next();

        for(int i=0;i<7;i++){
            System.out.println("Informe a "+(i+1)+"° nota: ");
            notas=scan.nextDouble();
            listaNotas.add(notas);
        }
        System.out.println("\nResultado Final:\nAtleta: "+nome);
        for(int i=0;i<listaNotas.size();i++){
            System.out.println((i+1)+"ª nota: "+listaNotas.get(i));
        }
        
        System.out.print("\nResultado Final:\nAtleta: "+nome);
        System.out.println("\nMelhor nota: "+Collections.max(listaNotas));
        System.out.println("Pior nota: "+Collections.min(listaNotas));
        
        Iterator<Double> iterator=listaNotas.iterator();
        Double soma=0d;
        while(iterator.hasNext()){
            double next=iterator.next();
            soma+=next;
        }
        double media=(soma-Collections.max(listaNotas)-Collections.min(listaNotas))/(listaNotas.size()-2);
        System.out.println("Media: "+formatter.format(media));
    }
}
