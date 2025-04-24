import java.util.Scanner;

public class app1 {
    public static void main(String[] args) {
        int n = methode.lectureN();
        int[] T = new int[n];
        
        methode.RemplirTab(T);
        
        Scanner sc = new Scanner(System.in);
        System.out.print("X1 à remplacer : ");
        int X1 = sc.nextInt();
        System.out.print("X2 de remplacement : ");
        int X2 = sc.nextInt();
        
        methode.Remplacer(T, X1, X2);
        System.out.println("Tableau après remplacement :");
        methode.AfficheTab(T);
    }
}