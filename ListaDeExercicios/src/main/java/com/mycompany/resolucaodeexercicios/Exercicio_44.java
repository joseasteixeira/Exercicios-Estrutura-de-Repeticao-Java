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
public class Exercicio_44 {
    /*
    Em uma eleição presidencial existem quatro candidatos. Os votos são 
    informados por meio de código. Os códigos utilizados são:
    1 , 2, 3, 4  - Votos para os respectivos candidatos 
    (você deve montar a tabela ex: 1 - Jose/ 2- João/etc)
    5 - Voto Nulo
    6 - Voto em Branco
    Faça um programa que calcule e mostre:
    O total de votos para cada candidato;
    O total de votos nulos;
    O total de votos em branco;
    A percentagem de votos nulos sobre o total de votos;
    A percentagem de votos em branco sobre o total de votos. Para finalizar o 
    conjunto de votos tem-se o valor zero.
    */
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int voto=10, votosCandidato1=0, votosCandidato2=0, votosCandidato3=0, 
            votosCandidato4=0, votosBrancos=0, votosNulos=0, contador=0;
        float porcentagemVotosBrancos=0, porcentagemVotosNulos=0;
        
        while(voto!=0){
            System.out.println("Informe o codigo do candidato:"
                              +"\n1: José"
                              +"\n2: João"
                              +"\n3: Judas"
                              +"\n4: Pedro"
                              +"\n5: Branco"
                              +"\n6: Nulo"
                              +"\nAqui: ");
            contador++;
            voto=scan.nextInt();
            switch(voto){
                case 1: votosCandidato1++;
                break;
                case 2: votosCandidato2++;
                break;
                case 3: votosCandidato3++;
                break;
                case 4: votosCandidato4++;
                break;
                case 5: votosBrancos++;
                break;
                case 6: votosNulos++;
                break;
                default:
            }
        }
        contador--;
        System.out.println("Total de votos do candidato 1 (José): "+votosCandidato1
                          +"\nTotal de votos do candidato 2 (João): "+votosCandidato2
                          +"\nTotal de votos do candidato 3 (Judas): "+votosCandidato3
                          +"\nTotal de votos do candidato 4 (Pedro): "+votosCandidato4
                          +"\nTotal de votos Brancos: "+votosBrancos
                          +"\nTotal de votos Nulos: "+votosNulos);
        porcentagemVotosBrancos=(float)(votosBrancos*100)/contador;
        porcentagemVotosNulos=(float)(votosNulos*100)/contador;
        System.out.println(porcentagemVotosBrancos+"% dos votos faram BRANCOS.\n"
                          +porcentagemVotosNulos+"% dos votos faram NULOS.");
    }
}
