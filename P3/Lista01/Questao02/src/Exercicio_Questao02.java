import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Questao02 {
    public static double covertecelsiusfahrenheit(double celsius) {
        double f = 9 * celsius / 5 + 32;
        return f;
    }

    public static double convertecelsiuskelvin(double celsius) {
        double k = celsius + 273.15;
        return k;
    }

    public static double convertefahrenheitcelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }
    public static double convertefahrenheitkelvin(double fahrenheit){
        double k = (fahrenheit - 32) * 5 / 9 + 273.15;
        return k;
    }
    public static double convertekelvincelsius(double kelvin){
        double c = kelvin - 273.15;
        return c;
    }
    public static double convertekelvinfahrenheit(double kelvin){
        double f = (kelvin - 273.15) * 1.8 + 32;
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean continuar;
        do {
            System.out.println("\nDigite o valor da temperatura: ");
            Double temp = sc.nextDouble();

            System.out.println("\nSelecione a escala da temperatura: \n(1) Celsius; \n(2) Fahrenheit; \n(3) Kelvin: ");
            double escolha = sc.nextDouble();

            if (escolha == 1) {

                System.out.format("\nO valor da temperatura Celsius transformado em Fahrenheit é %.5f", covertecelsiusfahrenheit(temp));
                System.out.format("\nO valor da temperatura Celsius transformado em Kelvin é %.5f", convertecelsiuskelvin(temp));
            }
            else if (escolha == 2){
                System.out.format("\nO valor da temperatura em Fahrenheit, transformado em Celsius é %.5f", convertefahrenheitcelsius(temp));
                System.out.format("\nO valor da temperatura em Fahrenheit, transformado em Kelvin é %.5f", convertefahrenheitkelvin(temp));
            }
            else if (escolha == 3){
                System.out.format("\nO valor da temperatura em Kelvin, transformado em Celsius é %.5f", convertekelvincelsius(temp));
                System.out.format("\nO valor da temperatura em Kelvin, transformado em Fahrenheit é %.5f", convertekelvinfahrenheit(temp));
            }
            else{
                System.out.println("\nA opção selecionada é inválida!");
            }
            continuar = verifica();

        }while (continuar);

        }


    public static boolean verifica(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDeseja realizar uma nova verificação ? (S ou N)");
        return sc.nextLine().toUpperCase(Locale.ROOT).equals("S");
    }
}
