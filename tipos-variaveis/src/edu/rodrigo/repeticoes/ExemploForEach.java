package edu.rodrigo.repeticoes;

public class ExemploForEach {
    public static void main(String[] args) {
        
        String alunos [] = {
            "Joao", "Maria", "Pedro", "Ana"
        } ;
        
        // foreach o aluno do indice atualiza a cada iteracao da array de alunos
        for(String aluno : alunos){
            System.out.println("O aluno é "+aluno);
        }
    }
}
