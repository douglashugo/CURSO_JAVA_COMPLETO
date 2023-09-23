import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas peossoas serao digitadas? ");
        int n = sc.nextInt();

        char[] genero = new char[n];
        double[] height = new double[n];
        double menorAltura = 999.9;
        double maiorAltura = 0;
        double soma = 0;
        double media;
        int qtdHomens = 0;


        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da pessoa %da pessoa: ", i + 1);
            height[i] = sc.nextDouble();

            System.out.printf("Genero da pessoa %da pessoa: ", i + 1);
            genero[i] = sc.next().charAt(0);

            if (genero[i] == 'M') {
                qtdHomens++;
            }else {
                soma += height[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (height[i] < menorAltura) {
                menorAltura = height[i];
            }
            if (height[i] > maiorAltura) {
                maiorAltura = height[i];
            }
        }

        media = soma / (n - qtdHomens);

        System.out.printf("\nMenor altura = %.2f", menorAltura);
        System.out.printf("\nMaior altura = %.2f", maiorAltura);
        System.out.printf("\nMedia das alturas das mulheres = %.2f", media);
        System.out.printf("\nNumero de homens = %d", qtdHomens);


        sc.close();
    }
}