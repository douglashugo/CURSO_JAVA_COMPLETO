import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int sizePeople = sc.nextInt();

        String[] name = new String[sizePeople];
        int[] age = new int[sizePeople];
        double[] height = new double[sizePeople];
        double somaAltura = 0.0;
        double alturaMedia;
        int qtdMenorDezesseisAnos = 0;
        double porcMenorDezesseisAnos;
        int y=0;

        for (int i = 0; i < sizePeople; i++) {
            y += 1;
            System.out.println("Dados da "+ y +"a pessoa:");
            System.out.print("Nome: ");
            name[i] = sc.next();
            System.out.print("Idade: ");
            age[i] = sc.nextInt();
            System.out.printf("Altura: ");
            height[i] = sc.nextDouble();
            somaAltura += height[i];

            if (age[i] < 16) {
                qtdMenorDezesseisAnos += 1;
            }

        }

        alturaMedia = somaAltura / sizePeople;
        porcMenorDezesseisAnos = (qtdMenorDezesseisAnos * 100.0) / sizePeople;

        System.out.printf("%nAltura média = %.2f\n", alturaMedia);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", +porcMenorDezesseisAnos);

        for (int i = 0; i < sizePeople; i++) {
            if (age[i] < 16) {
                System.out.println(name[i]);

            }
        }


        sc.close();



    }
}