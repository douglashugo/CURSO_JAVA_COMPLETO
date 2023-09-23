import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] vet = new double [n];
        double ultimoNumero = 0;
        int posicaoUltimoNumero = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();

            if (ultimoNumero < vet[i]) {
                ultimoNumero = vet[i];
                posicaoUltimoNumero = i;
            }
        }

        System.out.printf("\nMAIOR VALOR = %.2f", ultimoNumero);
        System.out.printf("\nPOSICAO DO MAIOR VALOR = %d", posicaoUltimoNumero);

        sc.close();
    }
}