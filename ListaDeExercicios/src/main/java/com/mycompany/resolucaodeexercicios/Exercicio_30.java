/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resolucaodeexercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Jose Teixeira
 */
public class Exercicio_30 {
    /*
    O Sr. Manoel Joaquim acaba de adquirir uma panificadora e pretende 
    implantar a metodologia da tabelinha, que já é um sucesso na sua loja 
    de 1,99. Você foi contratado para desenvolver o programa que monta a 
    tabela de preços de pães, de 1 até 50 pães, a partir do preço do pão 
    informado pelo usuário, conforme o exemplo abaixo:
    Preço do pão: R$ 0.18
    Panificadora Pão de Ontem - Tabela de preços
    1 - R$ 0.18
    2 - R$ 0.36
    ...
    50 - R$ 9.00
    */
    public static void main(String[] args){
        int total=50;
        float valorUnitario;
        DecimalFormat df =  new DecimalFormat("0.00");
        Scanner scan=new Scanner(System.in);
        System.out.println("Preço do pão: R$ ");
        valorUnitario=scan.nextFloat();
        
        System.out.println("Panificadora Pão de Ontem - Tabela de preços");
        for(int i=0;i<total;i++){
            System.out.println((i+1)+" - R$ "+(df.format(valorUnitario*(i+1))));
        }
    }
}
