package edu.rodrigo.javadoc;

/**
 * <h1>Dobro</h1>
 * Sistema que irá calcular 0.01 centavo dobrando diariamente ao final de 30 dias.
 * <p>
 * <b>Note:</b> Leia atentamente a documentação dessa classe
 * para desfrutar dos recursos oferecidos pelo autor
 * 
 * @author Rodrigo Souza
 * @version 1.0
 * @since 08/02/2025 
 */

public class Dobro {
    /**
     * Método que calcula o dobro diário de 0.01 centavo
     * @param valor este é o valor inicial
     * @param dias numero de dias a ser dobrado
     * @return double - Valor dobro diário
     */
    

    public double dobrar(double valor, int dias) {
        double dobro = 0;
        for(int i = 0; i < dias; i++) {
            dobro += 0.01;
        }
        return valor + dobro;
    }   
}
