 package miPrincipal;

public class AppLadrillos {
    public static void menu() {
        for (int i = 0; i < 10; i++) {
            dibujarHilera();
        }
        int n =10;

        dibujarPared(n);
    }
    public static void dibujarPared(int n){
        if (n<10) {
            dibujarPared(n+1);
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXX");
        }
        dibujarPared(n-1);
       
    }

    public static void dibujarHilera(){
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXX");
    }

    
}