import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double somaVetor = 0;
        double mediaVetor = 0;

        double[] vetNumbers = new double [n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetNumbers[i] = sc.nextDouble();
            somaVetor += vetNumbers[i];
        }

        mediaVetor = somaVetor / n;

        System.out.printf("\nMEDIA DO VETOR: %.3f", mediaVetor);

        System.out.println("\nELEMENTOS ABAIXO DA MEDIA:");
        for (int i = 0; i < n; i++) {
            if(vetNumbers[i] < mediaVetor) {
                System.out.printf("%.1f%n", vetNumbers[i]);
            }
        }

        sc.close();
    }
}