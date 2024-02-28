package miPrincipal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws Exception {
        Scanner consola = new Scanner(System.in);
        int opc = 0;
        do {
            System.out.println("*************************");
            System.out.println("TIPOS ABSTRACTOS DE DATOS");
            System.out.println("*************************");
            System.out.println("1) LADRILLOS");
            System.out.println("2) FACTORIAL");
            System.out.println("3) NATURALES");
            System.out.println("        ");
            System.out.println("0) SALIR");
            System.out.print("Selecciona opción:");
            opc = consola.nextInt();

            switch (opc) {
                case 1:
                    AppLadrillos.menu();
                    break;
                case 2:
                    AppFactorial.menu();

                case 3:
                    AppNaturales.menu();

                    case 4:
                    AppSumaDigitas.menu();
                case 0:
                    System.out.println("ADIOS!");
                    consola.close();
                    break;

                default:
                    System.out.println("Valor incorrecto, intente de nuevo!");

            }

        } while (opc != 0);

    }
}