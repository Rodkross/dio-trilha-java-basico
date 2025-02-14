package edu.rodrigo.repeticoes;

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        /*
         * Joãozinho recebeu R$ 50,00 de mesada e foi em uma loja de doces gastar todo o
         * seu dinheiro, logo, enquanto o valor dos doces não igualar a R$ 50,00 ele foi
         * adicionando itens no carrinho.
         */
        double mesada = 50.0;
        double carrinho = 0;

        while (mesada > 0) {
            double valorDoce = valorAleatorio();
            
            if (valorDoce > mesada) {
                break;
            }

            System.out.printf("Doce valor %.2f adicionado ao carrinho \n", valorDoce);
            mesada -= valorDoce;
            carrinho += valorDoce; 
            System.out.printf("Valor carrinho: R$%.2f.\n", carrinho); 

            
        }

        System.out.printf("Mesada: %.2f \n", mesada);
        System.out.println("Joaozinho gastou toda sua mesada em doces.");

    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(8, 15);
    }
}
