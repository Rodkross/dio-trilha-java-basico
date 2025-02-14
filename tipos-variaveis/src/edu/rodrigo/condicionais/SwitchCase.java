import java.util.Locale;  
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite P, M ou G: ");
        String sigla = scanner.next();

        switch (sigla.toUpperCase()) {
            case "P":
                System.out.println("Pequeno");
                break;
            case "M":
                System.out.println("Médio");
                break;
            case "G":
                System.out.println("Grande");
                break;
            default:
                System.out.println("Sigla inválida!");
                break;
        }
        scanner.close();

        //se optarmos por switch case estudar um pouco mais sobre continue, break e default
    }    
}