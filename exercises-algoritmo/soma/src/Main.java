import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int sizeNumber = sc.nextInt();

        double[] numbers = new double[sizeNumber];
        double media;
        double soma = 0;

        for (int i = 0; i < sizeNumber; i++) {
            System.out.printf("Digite um número: ");
            numbers[i] = sc.nextDouble();
        }

        System.out.printf("%nVALORES = ");
        for (int j = 0; j < sizeNumber; j++) {
            System.out.print(" ");
            System.out.print(numbers[j]);
            soma += numbers[j];
        }

        media = soma / sizeNumber;

        System.out.printf("%nSOMA = %.2f%n", soma);
        System.out.printf("MEDIA = %.2f%n", media);

        sc.close();
        }
    }
