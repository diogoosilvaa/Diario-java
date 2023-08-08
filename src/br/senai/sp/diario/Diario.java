package br.senai.sp.diario;

import java.util.Scanner;

public class Diario {
    public static void main(String[] args) {
        /** Declarar as Variaveis */
        String professor;
        String disciplina;
        String nomeAluno;
        int frequencia;
        int nota1;
        int nota2;
        float media;
        String situaçao;


        /** instanciar teclado Scanner */
        Scanner teclado = new Scanner(System.in);


        /** Coletar dados */
        System.out.println("Ola prof seja bem vindo");
        System.out.println("-------------------------");
        System.out.print("informe o seu nome: ");
        professor = teclado.nextLine();
        System.out.println("Qual e a disciplina: ");
        disciplina = teclado.nextLine();
        System.out.println("Qual o nome do aluno: ");
        nomeAluno = teclado.nextLine();
        System.out.println("informe qual e a frequencia: ");
        frequencia = teclado.nextInt();
        System.out.println("Informe a nota 1: ");
        nota1 = teclado.nextInt();
        System.out.println("Informe a nota 2: ");
        nota2 = teclado.nextInt();
        System.out.println("------------------------");

        /** Calcula a Media do alunno*/

        media = (nota1 + nota2)/2;


        boolean avaliaProf = professor.equals("vitor");

        /** Define condição do aluno */

        if(media >= 7 &&  frequencia >= 75 && !avaliaProf || media>= 6 && frequencia >= 90 && !avaliaProf) {
            situaçao = "aprovado";
        } else {
            situaçao = "reprovado";
            System.out.println("-----------------------------");


            System.out.println("Ola professor seja bem vindo !!" +professor);


            /** Printa as informeções */
            System.out.println("-------------------------------------------");
            System.out.println("---------- Relatorio ----------------------");
            System.out.println("Ola prof" +professor);
            System.out.println("A disciplina avaliada é: " +disciplina);
            System.out.println("O aluno avaliado é: " + nomeAluno);
            System.out.println("A frequencia do aluno e: " +frequencia);
            System.out.println("A nota1 é: " +nota1);
            System.out.println("A nota2 é: " +nota2);
            System.out.println("Media é: " +media);
            System.out.println("a situaçao do aluno é: "+situaçao);

        }
    }
}
