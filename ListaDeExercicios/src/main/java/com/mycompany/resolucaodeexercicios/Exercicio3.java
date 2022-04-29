/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resolucaodeexercicios;

import java.util.Scanner;

/**
 *
 * @author José Teixeira
 */
public class Exercicio3 {
    /*
    Faça um programa que leia e valide as seguintes informações:
    Nome: maior que 3 caracteres;
    Idade: entre 0 e 150;
    Salário: maior que zero;
    Sexo: 'f' ou 'm';
    Estado Civil: 's', 'c', 'v', 'd';
    */
    public static void main(String[] args){
        String nome=null;
        int idade;
        float salario;
        char sexo = 0, estadoCivil=0;
        Scanner scan=new Scanner(System.in);
        
        do{
            System.out.println("Informe o nome: ");
            nome=scan.next();
            if(nome.length()<3){
                System.out.println("Nome invalido!");
            }
        }
        while(nome.length()<=3);
        
        do{
            System.out.println("Informe a idade: ");
            idade=scan.nextInt();
            if(idade<0||idade>150){
                System.out.println("Idade invalido!");
            }
        }
        while(idade<0||idade>150);
        
        do{
            System.out.println("Informe o salario: ");
            salario=scan.nextFloat();
            if(salario<=0){
                System.out.println("Salario invalido!");
            }
        }
        while(salario<=0);
        
        do{
            System.out.println("Informe o sexo m p/ Masculino e f p/ Feminino: ");
            sexo=scan.next().charAt(0);
            if(sexo!='f'&&sexo!='m'){
                System.out.println("Sexo invalido!");
            }
        }
        while(sexo!='f'&&sexo!='m');
        
        do{
            System.out.println("Informe o Estado civil s p/ Solteiro(a), c p/ Casado(a), v p/ Viuvo(a), d p/ Divirciado(a): ");
            estadoCivil=scan.next().charAt(0);
            if(estadoCivil!='c'&&estadoCivil!='s'&&estadoCivil!='v'&&estadoCivil!='d'){
                System.out.println("Estado civil invalido!");
            }
        }
        while(estadoCivil!='c'&&estadoCivil!='s'&&estadoCivil!='v'&&estadoCivil!='d');
        
    }   
}
