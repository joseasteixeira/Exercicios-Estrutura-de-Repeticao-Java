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
public class Exercicio_38 {
    /*
    Um funcionário de uma empresa recebe aumento salarial anualmente: Sabe-se que:
    Esse funcionário foi contratado em 1995, com salário inicial de R$ 1.000,00;
    Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
    A partir de 1997 (inclusive), os aumentos salariais sempre correspondem ao 
    dobro do percentual do ano anterior. Faça um programa que determine o 
    salário atual desse funcionário. Após concluir isto, altere o programa 
    permitindo que o usuário digite o salário inicial do funcionário.
    */
    public static void main(String[] args){
        float salarioInicial=1000, acrescimo=0.015F, salarioFinal=0;
        Scanner scan=new Scanner(System.in);
        int anoInicial, anoFinal;
        
        // CODIGO INICIAL
        // CONSIDERANDO SALARIO INICIAL "1000"
        // ANO iNICICIAL "1995"
        // ANO fINAL "2022"
        /*       
        int i;
        for(i=1996;i<=2022;i++){
            cont++;
            salarioFinal=salarioInicial+(salarioInicial*acrescimo*cont);
        }
        System.out.println("Salario em "+(i-1)+": R$ "+salarioFinal);
        */
        
        //CODIGO CONSIDERANDO DADOS INSERIDOS PELO USUARIO.
        System.out.println("Informe o salario inicial: ");
        salarioInicial=scan.nextFloat();
        System.out.println("Informe o ano inicial: ");
        anoInicial=scan.nextInt();
        System.out.println("Informe o ano final: ");
        anoFinal=scan.nextInt();
        int i;
        float salario=salarioInicial;
        for(i=(anoInicial+1);i<=anoFinal;i++){
            salarioFinal=salario+(salario*acrescimo);
            acrescimo*=2;
            salario=salarioFinal;
        }
        System.out.println("\nSalario em "+(i-1)+": R$ "+salarioFinal);
    }
}
