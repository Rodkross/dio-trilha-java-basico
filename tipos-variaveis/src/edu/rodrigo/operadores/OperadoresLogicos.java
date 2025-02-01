package edu.rodrigo.operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
       /*
           && Operador Lógico "E" 

           || Operador Lógico "OU"
       */ 

        boolean condicaoUm = true;
        boolean condicaoDois = false;
        boolean condicaoTres = true;

        if (condicaoUm && condicaoDois) {
            System.out.println("As duas condicoes sao verdadeiras");
        }

        if (condicaoUm || condicaoDois) {
            System.out.println("Uma das condicoes e verdadeira");
        }

        if (condicaoUm || condicaoTres) {
            System.out.println("As duas condicoes sao verdadeiras");
        }

        System.out.println("Fim");
    }
}
