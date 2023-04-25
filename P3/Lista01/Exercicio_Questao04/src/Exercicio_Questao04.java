import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Questao04 {

    public static double verifica(double numero) {
        if (numero % 2 == 0) {
            System.out.println("\nO numero digitado é par, e sua raiz cúbica é: ");
            return numero = Math.cbrt((Double) numero);

        } else {
            System.out.println("\nO numero digitado é impar, e sua raiz quadrada é: ");
            return numero = Math.sqrt((Double) numero);
        }
    }


    public static void main(String[] args) {
        boolean continuar;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\nDigite um número para verificação: ");
            double numero = sc.nextDouble();

            System.out.format("%.4f", verifica(numero));

            continuar = confirma();

        } while (continuar);


    }

    public static boolean confirma() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDeseja realizar uma nova verificação ? (S ou N)");
        return sc.nextLine().toUpperCase(Locale.ROOT).equals("S");
    }
}
