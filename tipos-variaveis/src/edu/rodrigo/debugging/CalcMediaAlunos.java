package edu.rodrigo.debugging;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcMediaAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] alunos = { "Camila", "Lucas", "Bruna", "Pedro" };

        double media = calcularMediaDaTurma(alunos, scanner);

        System.out.printf("Media da turma %.1f", media);
    }

    public static double calcularMediaDaTurma(String[] alunos, Scanner scanner) {
        double soma = 0;
        try {
            for (String aluno : alunos) {

                System.out.printf("Nota aluno %s: ", aluno);
                double nota = scanner.nextDouble();
                soma += nota;

            }
        } catch (InputMismatchException e) {
            System.out.println("Por favor digite um numero..."); 
        }
        return soma / alunos.length;

    }
}
