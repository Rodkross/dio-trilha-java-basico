package edu.rodrigo.Terminal_Argumentos;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        /* String nome  = args [0];
        String sobreNome = args [1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);*/
        
        // ou pegando diretamente pelo terminal usando Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Sobrenome: ");
        String sobreNome = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        
        System.out.print("Altura (em cm): ");
        double altura = scanner.nextDouble();   
        
        scanner.close();     
        
        System.out.println("Nome: " + nome + " " + sobreNome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura + "cm");
    }    
}