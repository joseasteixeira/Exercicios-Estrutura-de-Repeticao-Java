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
public class Exercicio_31 {
    /*
    O Sr. Manoel Joaquim expandiu seus negócios para além dos negócios de 
    1,99 e agora possui uma loja de conveniências. Faça um programa que 
    implemente uma caixa registradora rudimentar. O programa deverá receber 
    um número desconhecido de valores referentes aos preços das mercadorias. 
    Um valor zero deve ser informado pelo operador para indicar o final da 
    compra. O programa deve então mostrar o total da compra e perguntar o 
    valor em dinheiro que o cliente forneceu, para então calcular e mostrar 
    o valor do troco. Após esta operação, o programa deverá voltar ao ponto 
    inicial, para registrar a próxima compra. A saída deve ser conforme o 
    exemplo abaixo:
    Lojas Tabajara 
    Produto 1: R$ 2.20
    Produto 2: R$ 5.80
    Produto 3: R$ 0
    Total: R$ 9.00
    Dinheiro: R$ 20.00
    Troco: R$ 11.00
    ...
    */
    public static void main(String[] args){
        int teste=1;
        Scanner scan=new Scanner(System.in);
        
        for(int i=0;teste==1 ;i++){
            int cont=0;
            float valorUnidade=1, valorTotal=0, dinheiro, troco;
            
            System.out.println("Lojas Tabajara");
            while(valorUnidade!=0){
                    cont++;
                System.out.println("Produto "+cont+": R$ ");
                valorUnidade=scan.nextFloat();
                valorTotal+=valorUnidade;
            }
            System.out.println("Total: R$ "+valorTotal);
            System.out.println("Dinheiro: R$ ");
            dinheiro=scan.nextFloat();
            troco=dinheiro-valorTotal;
            System.out.println("Troco: R$ "+troco);
            
            /*-->As linhas de codigo abaixo torna opicional, registrar proxima 
            compra ou encerrar o programa<--*/
            //System.out.println("\nDigite '0' para sair ou '1' para repitir!");
            //teste=scan.nextInt();
            System.out.println();
        }
    }
}
