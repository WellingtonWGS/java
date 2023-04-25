import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Exercicio_Questao03 {

    public static void main(String[] args) {
        String nomeSobrenome;
        boolean continuar;
        do {
            Scanner input = new Scanner(System.in);

            System.out.println("Digite o seu nome e sobrenome: ");
            nomeSobrenome = input.nextLine();

            String nome = nomeSobrenome.substring(0,nomeSobrenome.indexOf(" "));
            String sobrenome;
            sobrenome = nomeSobrenome.substring(nomeSobrenome.indexOf(" ") +1,nomeSobrenome.length());

            String diana = "Diana";
            String wayne = "Wayne";
            String kent = "Kent";
            if(nome.equalsIgnoreCase(diana)){
                System.out.println("Bem-vinda, Princesa de Themyscara");
            } else if (sobrenome.equalsIgnoreCase(wayne)) {
                System.out.println("Acesso liberado, Sr. Wayne");
            } else if (sobrenome.equalsIgnoreCase(kent)) {
                System.out.println("Saí daí, mané!");
            }else{
                System.out.println("Cai fora!");
            }

            continuar = verifica();

        }while (continuar);
    }
    public static boolean verifica() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDeseja realizar uma nova verificação ? (S ou N)");
        return sc.nextLine().toUpperCase(Locale.ROOT).equals("S");
    }


}
