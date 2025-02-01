package edu.rodrigo.operadores;

public class operadores {
   public static void main(String[] args) {
        //Classe operadores Java
        // (=) atribuição
        
        /*
        String nome = "Rodrigo";
        int idade = 39;
        double peso = 82.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date(); 
        */ 

        //Aritimeticos
        /*
        (+) soma
        (-) subtração
        (*) multiplicação
        (/) divisão
        (%) modulo ou resto
        */

        // o operador de soma (+) quando utilizado junto de String ele deixa de ser operador de aritimetico e se torna um concatenador 


        String concatenacao ="?"; 

        concatenacao = 1+1+1+"1";
        System.out.print(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.print(concatenacao);
        
        concatenacao = 1+"1"+1+"1";
        System.out.print(concatenacao);
        
        concatenacao = "1"+1+1+1;
        System.out.print(concatenacao);
        
        concatenacao = "1"+(1+1+1);
        System.out.print(concatenacao);
        

   } 
}
