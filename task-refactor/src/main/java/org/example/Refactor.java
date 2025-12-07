package org.example;


import java.util.Scanner;

public class Refactor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opt;
        do {
            opt = getOpt(scanner);

            if (opt == 1) {
                opt1(scanner);
            } else if (opt == 2) {
                opt2(scanner);
            } else if (opt == 3) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción inválida");
            }

        } while (opt != 3);
    }

    private static void opt2(Scanner scanner) {
        int otherNum = positiveNumber(scanner);

        int sum = 0;
        for (int i = 0; i < otherNum; i++) {
            System.out.print("Introduce un número:");
            sum += scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("La media es " + (sum / otherNum));
    }
    private static void opt1(Scanner scanner) {
        int num = positiveNumber(scanner);

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        System.out.println("El sumatorio es " + sum);
    }

    private static int positiveNumber(Scanner scanner) {
        int otherNum;
        do {
            System.out.print("Introduce un entero positivo: ");
            otherNum = scanner.nextInt();
            scanner.nextLine();
        } while (otherNum <= 0);
        return otherNum;
    }


    private static int getOpt(Scanner scanner) {
        int opt;
        System.out.println("Elige una opción:");
        System.out.println("1. Sumatorio");
        System.out.println("2. Media");
        System.out.println("3. Salir");
        opt = scanner.nextInt();
        scanner.nextLine();
        return opt;
    }
}
