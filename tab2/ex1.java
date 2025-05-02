import java.util.Scanner;
public class ex1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = les_methods.lecturN(10);
        double[] tableau = new double [n];
            
        System.out.println("Remplissage du tableau:");
        for (int i = 0; i < n; i++) {
            System.out.print("Entrez l'élément " + (i+1) + ": ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Veuillez entrer un nombre valide!");
                scanner.next(); // Pour vider le buffer
                System.out.print("Entrez l'élément " + (i+1) + ": ");
            }
                tableau[i] = scanner.nextDouble();
        }
        System.out.println("donner x");
        System.out.println("les somme de tabelau est"+ les_methods.Somme(tableau));
        double x =scanner.nextDouble();
        System.out.println(les_methods.incrementer(tableau, x));


        
    }
}