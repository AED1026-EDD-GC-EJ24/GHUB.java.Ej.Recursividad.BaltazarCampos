package miPrincipal;

import java.util.Scanner;

public class AppNaturales {

    public static void menu() {
        System.out.println("********************");
        System.out.println("NUMEROS NATURALES");
        System.out.println("********************");
        Scanner scaner = new Scanner(System.in);
        int n = scaner.nextInt();
        System.out.println("Version iterativa");
        muestraNaturalesIte(n);
    }

    public static void muestraNaturalesIte(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void muestraNaturalesRec(int n) {
        System.out.println(n);//cuando esta antes de la invocacion recursiva se imprime de forma descendente
        if (n > 0)
            muestraNaturalesRec(n - 1);
        System.out.println(n);
    }
}