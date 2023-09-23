import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double[] vet = new double[n];
        double media;
        double soma = 0;
        int cont = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();

            if (vet[i] % 2 == 0) {
                soma += vet[i];
                cont++;
            }
        }

        media = soma / cont;

        if (soma > 0){
            System.out.printf("MEDIA DOS PARES: %.1f", media);
        }else {
            System.out.print("NENHUM NUMERO PAR");
        }

        sc.close();
    }
}