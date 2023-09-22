package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        ArrayList<Employee> employee = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            System.out.printf("Employee #%d:%n", i+1);

            System.out.print("Id: ");
            int id = sc.nextInt();

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();
        }





        sc.close();
    }
}