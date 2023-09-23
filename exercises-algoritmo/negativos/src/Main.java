import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sizeNumber;

        do {
            System.out.print("Quantos numeros voce vai digitar? ");
            sizeNumber = sc.nextInt();
        }while(sizeNumber > 10);

        int[] vet = new int[sizeNumber];

        for (int i = 0; i < sizeNumber; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS");
        for (int i = 0; i < sizeNumber; i++) {
            if(vet[i] < 0) {
                System.out.println(vet[i]);
            }
        }
        sc.close();
    }
}