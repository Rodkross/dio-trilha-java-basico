package edu.rodrigo.repeticoes;

public class BreakContinue {
    public static void main(String[] args) {

        // O contibue executa o loop pulando a posicao 
        for(int numero = 1; numero <= 5; numero++){
            if(numero == 3)
                continue;

            System.out.println("Numero: " + numero);

            // O break interrompe a execução do loop
            if(numero == 4)
                break;

            // resultado 124 (continue omitiu o 3 e o break interrompeu antes do fim do ciclo)
        }
    }
}
