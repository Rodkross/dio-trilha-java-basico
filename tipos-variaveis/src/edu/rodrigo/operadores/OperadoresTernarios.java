package edu.rodrigo.operadores;

public class OperadoresTernarios {
    public static void main(String[] args) {
        /*  O operador ternário é representado pelos símbolos ?: utilizados na seguinte estrutura de sintaxe:

        <Expressão Condicional>`` ?``<Caso condição seja true>``: ``<Caso condição seja false> */

        //exemplo da DIO
        int a, b;

        a = 5;
        b = 6;
        
        String resultado = (a == b) ? "verdadeiro" : "falso";
        System.out.println(resultado);

        //meu exemplo
        int idade = 18;
        String maiorIdade = idade > 17 ? "Pode habilitar" : "Não pode habilitar"; 
        System.out.println(maiorIdade);
    }
}
