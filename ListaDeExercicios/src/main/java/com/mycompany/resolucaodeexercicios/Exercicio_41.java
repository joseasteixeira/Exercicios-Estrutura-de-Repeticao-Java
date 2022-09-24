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
public class Exercicio_41 {
    /*
    Faça um programa que receba o valor de uma dívida e mostre uma tabela com 
    os seguintes dados: valor da dívida, valor dos juros, quantidade de parcelas 
    e valor da parcela.
    Os juros e a quantidade de parcelas seguem a tabela abaixo:
    Quantidade de Parcelas  % de Juros sobre o valor inicial da dívida
    1       0
    3       10
    6       15
    9       20
    12      25
    Exemplo de saída do programa:
    Valor da Dívida Valor dos Juros Quantidade de Parcelas  Valor da Parcela
    R$ 1.000,00     0               1                       R$  1.000,00
    R$ 1.100,00     100             3                       R$    366,00
    R$ 1.150,00     150             6                       R$    191,67
    */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        float valorDivida;
        int quantidadeParcelas=1, juros=0;
        System.out.println("Informe o valor da divida: ");
        valorDivida=scan.nextFloat();
        
        System.out.println("Valor da Dívida Valor dos Juros Quantidade de Parcelas  Valor da Parcela");
        for(juros=0;juros<=25;juros+=5){
            if(juros==5){
                juros+=5;
            }
            if(juros==10){
                quantidadeParcelas=3;
            }
            if(juros==15){
                quantidadeParcelas=6;
            }
            if(juros==20){
                quantidadeParcelas=9;
            }
            if(juros==25){
                quantidadeParcelas=12;
            }
            System.out.println("R$ "+((valorDivida*juros/100)+valorDivida)
                              +"        R$ "+(valorDivida*juros/100)
                              +"          "+quantidadeParcelas
                              +"                      "+((valorDivida*juros/100)+valorDivida)/quantidadeParcelas);
        }
    }

}

