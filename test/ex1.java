import java.util.Scanner;

public class ex1 {
    public static int lire() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("entre un entier : ");
            while (!sc.hasNextInt()) {
                System.out.println("pas valide");
                System.out.print("entrez un entier : ");
                sc.next();
            }
            n = sc.nextInt();
        } while (n <= 0);
        return n;
    }
    
    public static int compter(int nbr) {
        if (nbr == 0) {
            return 1;
        }
        
        int c = 0;
        while (nbr != 0) {
            nbr /= 10;
            c++;
        }
        return c;
    }
    
    public static void main(String[] args) {
        int nombre = lire();
        int nbChiffres = compter(nombre);
        
        System.out.println("Le nombre " + nombre + " contient " + nbChiffres + " chiffre(s).");
    }
}