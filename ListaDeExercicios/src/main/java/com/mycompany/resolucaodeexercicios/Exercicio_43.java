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
public class Exercicio_43 {
    /*
    O cardápio de uma lanchonete é o seguinte:
    Especificação   Código  Preço
    Cachorro Quente 100     R$ 1,20
    Bauru Simples   101     R$ 1,30
    Bauru com ovo   102     R$ 1,50
    Hambúrguer      103     R$ 1,20
    Cheeseburguer   104     R$ 1,30
    Refrigerante    105     R$ 1,00
    Faça um programa que leia o código dos itens pedidos e as quantidades 
    desejadas. Calcule e mostre o valor a ser pago por item (preço * quantidade) 
    e o total geral do pedido. Considere que o cliente deve informar quando o 
    pedido deve ser encerrado.
    */
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int codigo=0, quantidade;
        float totalGeral=0, total=0;
        
        System.out.println("Ao finalizar digite  codigo -1 e a quantidade 0 para encerrar!");
        while(codigo>=0){
            total=0;
            System.out.println("Informe o código: ");
            codigo=scan.nextInt();
            System.out.println("Informe a quantidade: ");
            quantidade=scan.nextInt();
        
            switch(codigo){
                case 100: 
                    total=1.2f*quantidade;
                    System.out.println("Cachorro Quente: R$ "+total);
                break;
                case 101: 
                    total=1.3f*quantidade;
                    System.out.println("Bauru Simples: R$ "+total);
                break;
                case 102: 
                    total=1.5f*quantidade;
                    System.out.println("Bauru com ovo: R$ "+total);
                break;
                case 103: 
                    total=1.2f*quantidade;
                    System.out.println("Hambúrguer: R$ "+total);
                break;
                case 104: 
                    total=1.3f*quantidade;
                    System.out.println("Cheeseburguer: R$ "+total);
                break;
                case 105: 
                    total=1f*quantidade;
                    System.out.println("Refrigerante: R$ "+total);
                break;
                default:
            }
            totalGeral+=total;
        }
        System.out.println("Total geral do pedido: R$ "+totalGeral);
    }
}
