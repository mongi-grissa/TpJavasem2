import java.util.Scanner;

public class tp7_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        do {
            System.out.print("Entrez le nombre de lignes ");
            n1 = sc.nextInt();
        } while (n1 <= 30);
        do {
            System.out.print("Entrez le nombre de colonnes ");
            n2 = sc.nextInt();
        } while (n2 <= 30);
        int[][] M = new int[n1][n2];
        System.out.println("Entrez les elements de la matrice");
        
        
        sc.close();
    }
}