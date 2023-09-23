import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int n = sc.nextInt();

        String[] name = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];
        int y = 0;

        for (int i = 0; i < n; i++) {
            y += 1;
            System.out.println("Digite nome, primeira e segunda nota do "+ y +"o aluno: ");
            sc.nextLine();
            name[i] = sc.nextLine();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
        }

        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < n; i++) {
            if (((nota1[i] + nota2[i]) / 2) >= 6.0) {
                System.out.println(name[i]);
            }
        }

        sc.close();
    }
}