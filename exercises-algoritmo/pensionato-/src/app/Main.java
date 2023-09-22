package app;

import entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        Rent[] vet = new Rent[10];

        for (int i = 0; i < n; i++) {
            System.out.printf("\nRent #%d: %n", i+1);
            System.out.printf("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.printf("Email: ");
            String email = sc.next();
            System.out.printf("Room: ");
            int room = sc.nextInt();

            Rent rents = new Rent(name, email);
            vet[room] = new Rent(name,email);
        }

        System.out.println("\nBusy rooms: ");
        for (int i = 0; i < 10; i++) {
            if(vet[i] != null){
                System.out.printf("%d: ", i);
                System.out.println(vet[i]);
            }
        }


        sc.close();
    }
}