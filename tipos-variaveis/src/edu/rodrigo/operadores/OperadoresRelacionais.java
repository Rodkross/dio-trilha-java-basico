package edu.rodrigo.operadores;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        /*  
            == Quando desejamos verificar se uma variável é IGUAL A outra.

            != Quando desejamos verificar se uma variável é DIFERENTE da outra.

            > Quando desejamos verificar se uma variável é MAIOR QUE a outra.

            >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.

            < Quando desejamos verificar se uma variável é MENOR QUE outra.

            <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra. 
        */

        //classe Operadores.java
        int numero1 = 2;
        int numero2 = 2;

        if(numero1 > numero2)
            System.out.println("Numero 1 maior que numero 2");

        if(numero1 < numero2)
            System.out.println("Numero 1 menor que numero 2");

        if(numero1 >= numero2)
            System.out.println("Numero 1 maior ou igual que numero 2");

        if(numero1 <= numero2)
            System.out.println("Numero 1 menor ou igual que numero 2");

        if(numero1 != numero2)
            System.out.println("Numero 1 é diferente de numero 2");
        
        
        //exemplo 2 comparando objetos
        
        String nomeUm = "Rodrigo";
        String nomeDois = new  String("Rodrigo");

    
        System.out.println(nomeUm == nomeDois); //comparacao errada
        System.out.println(nomeUm.equals(nomeDois)); //comparacao certa usando equals

        //operadores so se compara com numeros, com objetos se usa equals pois ele ver o conteudo do objeto  

    }

}
