package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cont = 0;
        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                mat[i][j] = sc.nextInt();

                if (mat[i][j] < 0){
                    cont++;
                }
            }
        }

        System.out.println("Main diagonal: ");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (mat[i] == mat[j]) {
                    System.out.print(mat[i][j] +" ");
                }
            }
        }

        System.out.println("\nNegative numbers = " +cont);

        sc.close();
    }
}