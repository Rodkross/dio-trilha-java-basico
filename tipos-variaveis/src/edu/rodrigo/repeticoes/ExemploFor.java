package edu.rodrigo.repeticoes;

public class ExemploFor {
    public static void main(String[] args) {
        /* 
        //estrutura do controle de fluxo for
        for(bloco de inicializacao; expressao booleana de validacao; bloco de atualizacao) {
            //comando que sera executado ate que a
            //expressao de validacao torne-se falsa
        }
        */
        int carneirinhos;

        for(carneirinhos = 1; carneirinhos < 20; carneirinhos++){
            System.out.printf("%s Carneirinhos \n", carneirinhos);
        }

        if(carneirinhos == 20){
            System.out.printf("%s Carneirinhos.\nPegou no sono \n", carneirinhos);
        }

    }
}