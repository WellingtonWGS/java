import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double n1 = null;
        Double n2 = (double) 0;
        Double operacao;
        boolean continuar;


        do {
            System.out.println("\nEscolha um operador: \n(1) Adição; \n(2) Subtração; \n(3) Multiplicação; \n(4) Divisão; \n(5) Potência; \n(6) Raiz Quadrada; \n(7) Raiz Cúbica: ");
            operacao = sc.nextDouble();
            if (operacao == 5) {
                System.out.println("\nDigite o valor da base: ");
                n1 = sc.nextDouble();
                System.out.println("\nDigite o valor do expoente: ");
                n2 = sc.nextDouble();
            } else if (operacao == 6) {
                System.out.println("\nDigite o valor para calcular a raiz quadrada: ");
                n1 = sc.nextDouble();
            } else if (operacao == 7) {
                System.out.println("\nDigite o valor para calcular a raiz cúbica: ");
                n1 = sc.nextDouble();
            } else if (operacao == 1 || operacao == 2 || operacao == 3 || operacao == 4 ){
                System.out.println("\nDigite o primeiro valor: ");
                n1 = sc.nextDouble();
                System.out.println("\nDigite o segundo valor: ");
                n2 = sc.nextDouble();
            }

            System.out.format("\nResultado: %.5f", realizarcalculo((Double) n1, (Double) n2, Double.valueOf(String.valueOf((Double) operacao))));
            continuar = verifica();

        }while(continuar);


    }
    public static boolean verifica(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDeseja realizar uma nova operação ? (S ou N)");
        return !sc.nextLine().toUpperCase(Locale.ROOT).equals("N");
    }
    public static Double realizarcalculo(Double n1, Double n2, Double operacao) {
        Double resultado = (double) 0;
        if (operacao == 1) {
            resultado = (n1 + n2);
        }   else if (operacao == 2) {
            resultado = (n1 - n2);
        }   else if (operacao == 3) {
            resultado = (n1 * n2);
        }   else if (operacao == 4) {
            if (n1 != 0) {
                resultado = (n1 / n2);
            }else {
                System.out.println("\nOperação Inválida! Não é possível dividir zero! ");
            }
        }   else if (operacao == 5) {
            resultado = (Double) Math.pow(n1, n2);
        }   else if (operacao == 6) {
            resultado = (Double) Math.sqrt((Double) n1);
        }   else if (operacao == 7) {
            resultado = (Double) Math.cbrt(n1);
        }

        else{
            System.out.println("\nOpção Inválida! Escolha uma opção válida! ");

        }
        return resultado;
    }
}






