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
public class Exercicio_45 {
    /*
    Desenvolver um programa para verificar a nota do aluno em uma prova com 10 
    questões, o programa deve perguntar ao aluno a resposta de cada questão e 
    ao final comparar com o gabarito da prova e assim calcular o total de 
    acertos e a nota (atribuir 1 ponto por resposta certa). Após cada aluno 
    utilizar o sistema deve ser feita uma pergunta se outro aluno vai utilizar 
    o sistema. Após todos os alunos terem respondido informar:
    Maior e Menor Acerto;
    Total de Alunos que utilizaram o sistema;
    A Média das Notas da Turma.
    Gabarito da Prova:

    01 - A
    02 - B
    03 - C
    04 - D
    05 - E
    06 - E
    07 - D
    08 - C
    09 - B
    10 - A
    Após concluir isto você poderia incrementar o programa permitindo que o 
    professor digite o gabarito da prova antes dos alunos usarem o programa.
    */
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int teste=1, questao=0, nota=0, totalAlunos=0, auxMedia=0, menorAcerto=0,
            maiorAcerto=0, qMenorAcerto=0, qMaiorAcerto=0;
        float media=0;
        int[] acertos;
        acertos=new int[10];
        char resposta;
        
        while(teste==1){
            nota=0;
            for(int i=0;i<10;i++){
                questao=(i+1);
                System.out.println("Digite a resposta da questão "+(i+1)+": ");
                resposta=scan.next().charAt(0);
                if(questao==1&&resposta=='A'){
                    nota++;
                    acertos[i]++;
                }
                else;
                if(questao==2&&resposta=='B'){
                    nota++;
                    acertos[i]++;
                }
                else;
                if(questao==3&&resposta=='C'){
                    nota++;
                    acertos[i]++;
                }
                else;
                if(questao==4&&resposta=='D'){
                    nota++;
                    acertos[i]++;
                }
                else;
                if(questao==5&&resposta=='E'){
                    nota++;
                    acertos[i]++;
                }
                else;
                if(questao==6&&resposta=='E'){
                    nota++;
                    acertos[i]++;
                }
                else;
                if(questao==7&&resposta=='D'){
                    nota++;
                    acertos[i]++;
                }
                else;
                if(questao==8&&resposta=='C'){
                    nota++;
                    acertos[i]++;
                }
                else;
                if(questao==9&&resposta=='B'){
                    nota++;
                    acertos[i]++;
                }
                else;
                if(questao==10&&resposta=='A'){
                    nota++;
                    acertos[i]++;
                }
                else;
            }
            auxMedia+=nota;
            System.out.println("Nota: "+nota);
            totalAlunos++;
            System.out.println("Digite '1' para usar o sistema novamente ou '0' para encerrar");
            teste=scan.nextInt();
        }
        menorAcerto=maiorAcerto=acertos[0];
        for(int i=0;i<10;i++){
            if(menorAcerto>=acertos[i]){
                menorAcerto=acertos[i];
                qMenorAcerto=(i+1);
            }
            if(maiorAcerto<=acertos[i]){
                maiorAcerto=acertos[i];
                qMaiorAcerto=(i+1);
            }
        }
        System.out.println("A questão "+qMaiorAcerto+" teve maior numero de acertos."
                          +"\nA questão "+qMenorAcerto+" teve menor numero de acertos.");
        System.out.println(totalAlunos+" alunos utilizarão o sistema.");
        media=(float)auxMedia/totalAlunos;
        System.out.println("Média de notas de turma: "+media);
        System.out.println("Gabarito de prova:"+
                           "\n01 - A\n" +
                           "02 - B\n" +
                           "03 - C\n" +
                           "04 - D\n" +
                           "05 - E\n" +
                           "06 - E\n" +
                           "07 - D\n" +
                           "08 - C\n" +
                           "09 - B\n" +
                           "10 - A");
        
    }
}
