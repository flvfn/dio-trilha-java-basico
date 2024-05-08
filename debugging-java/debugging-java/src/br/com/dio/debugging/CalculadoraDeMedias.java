package br.com.dio.debugging;

import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        double media = calculaMediaDaTurma(alunos, scan);

        System.out.println("Média da turma é: " + media);
    }

    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner) {

        double soma = 0;
        for(String aluno : alunos) {
            System.out.println("Nota do aluno: " + aluno);
            double nota = scanner.nextInt();
            soma += nota;
        }

        return soma / alunos.length;
    }

}