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
public class Exercicio_40 {
    /*
    Foi feita uma estatística em cinco cidades brasileiras para coletar dados 
    sobre acidentes de trânsito. Foram obtidos os seguintes dados:
    Código da cidade;
    Número de veículos de passeio (em 1999);
    Número de acidentes de trânsito com vítimas (em 1999). Deseja-se saber:
    Qual o maior e menor índice de acidentes de transito e a que cidade pertence;
    Qual a média de veículos nas cinco cidades juntas;
    Qual a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio.
    */
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int[] codigo=new int[5];
        int[] numeroVeiculos=new int[5];
        int[] numeroAcidentes=new int[5];
        int menorIndice, maiorIndice, codigoMenorIndice=0, codigoMaiorIndice=0,
            auxVeiculos=0, mediaVeiculos, auxAcidentes=0, cont=0, mediaAcidentes;
        
        for(int i=0;i<5;i++){
            System.out.println("Informe o código da cidade: ");
            codigo[i]=scan.nextInt();
            System.out.println("Informe o número de veiculos de passeio: ");
            numeroVeiculos[i]=scan.nextInt();
            System.out.println("Informe o númedo de acidentes de transito com vitimas: ");
            numeroAcidentes[i]=scan.nextInt();
        }
        menorIndice=maiorIndice=numeroAcidentes[0];
        codigoMenorIndice=codigoMaiorIndice=codigo[0];
        for(int i=0;i<5;i++){
            if(menorIndice>numeroAcidentes[i]){
                menorIndice=numeroAcidentes[i];
                codigoMenorIndice=codigo[i];
            }
            if(maiorIndice<numeroAcidentes[i]){
                maiorIndice=numeroAcidentes[i];
                codigoMaiorIndice=codigo[i];
            }
            auxVeiculos+=numeroVeiculos[i];
            if(numeroVeiculos[i]<2000){
                auxAcidentes+=numeroAcidentes[i];
                cont++;
            }
        }
        System.out.println("\nO maior indice de acidentes é: "+maiorIndice+
                            "\nPertece a cidade: "+codigoMaiorIndice);
        System.out.println("O menor indice de acidentes é: "+menorIndice+
                            "\nPertece a cidade: "+codigoMenorIndice);
        mediaVeiculos=auxVeiculos/5;
        System.out.println("A média de veiculos nas cinco cidade é: "+mediaVeiculos);
        if(cont==0){
            cont=1;
        }
        mediaAcidentes=auxAcidentes/cont;
        System.out.println("A média de acidentes de transito nas cidades com "
                           +"menos de 2000 veiculos é: "+mediaAcidentes);
        
    }
}
