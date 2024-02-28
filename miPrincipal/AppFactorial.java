package miPrincipal;

class AppFactorial {
    public static void menu() {
        // Calcular factorial de un numero
        int f = 5;
        System.out.println("Factorial del " + f + "! = " + factorialIte(f));
    }

    public static long factorialIte(int n) {
        // VERSION ITERATIVA
        int f = 5;
        long fact = 1;

        for (int i = f; i > 0; i--) {
            fact = fact * i;
            ;
        }
        return fact;
    }

    public static long factorialRecu(int n) {

        if (n == 0)
            return 1;
        else
            return factorialRecu(n - 1) * n;
    }
}