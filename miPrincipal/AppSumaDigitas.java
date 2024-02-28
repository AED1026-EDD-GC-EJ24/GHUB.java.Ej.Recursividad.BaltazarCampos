package miPrincipal;

import java.util.Scanner;

public class AppSumaDigitas {
    public static void menu() {
        System.out.println("********************");
        System.out.println("SUMA DIGITOS");
        System.out.println("********************");
        Scanner scaner = new Scanner(System.in);
        System.out.println("Propororciona numero");
        int n = scaner.nextInt();
        System.out.println("Version iterativa");
    }

    public static int sumaDigitosIte(int n) {
        int suma = 0;
        while (n > 0) {
            suma = suma + n % 10;
            n = n / 10;
        }
        return suma + n;

    }

    public static int sumaDigitosRec(int n) {
        if (n <= 9)
            return n;
        else
            return sumaDigitosRec(n / 10) + n % 10;

    }
}
