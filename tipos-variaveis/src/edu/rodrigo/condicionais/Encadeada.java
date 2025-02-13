import java.util.Locale;
import java.util.Scanner;

public class Encadeada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Digite o nome do Aluno:");
        String nome = scanner.nextLine();

        System.out.print("Digite a nota do teste do 1º bimestre:");
        double teste = scanner.nextDouble();

        System.out.print("Digite a nota da prova do 1º bimestre:");
        double prova = scanner.nextDouble();

        double media = (teste + prova) / 2.0;
        scanner.close();

        //%s (sera substituida pelo valor da variavel) e %n (insere uma nova linha apos a variavel)
        System.out.printf("Nome do Aluno: %s%n", nome);
        //%.2f (define o numero de casas decimais) e %n (insere uma nova linha apos a variavel)
        System.out.printf("Média: %.2f%n", media);

        if(media >= 7){
            System.out.printf("O aluno %s, está APROVADO!", nome);
        }else if(media >= 6){
            System.out.printf("O aluno %s, está de RECUPERAÇÃO!", nome);
        }else{
            System.out.printf("O aluno %s, está REPROVADO!", nome);
        }



    }
}
