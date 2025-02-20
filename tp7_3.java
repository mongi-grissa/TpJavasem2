import java.util.Scanner;

public class tp7_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nl, nc;
        do {
            System.out.print("Entrez ligne");
            nl = sc.nextInt();
        } while (nl <= 0 || nl > 20);
        do {
            System.out.print("Entrez colpne ");
            nc = sc.nextInt();
        } while (nc <= 0 || nc > 30);
        int[][] M = new int[nl][nc];
        System.out.println("Entrez les éléments de la matrice :");
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                System.out.print("M[" + i + "][" + j + "] = ");
                M[i][j] = sc.nextInt();
            }
        }
        int[] T = new int[nl];
        for (int i = 0; i < nl; i++) {
            int sum = 0;
            for (int j = 0; j < nc; j++) {
                sum += M[i][j];
            }
            T[i] = sum;
        }
        int min = T[0];
        int max = T[0];
        for (int i = 1; i < nl; i++) {
            if (T[i] < min) {
                min = T[i];
            }
            if (T[i] > max) {
                max = T[i];
            }
        }
        System.out.println("\nRésultats :");
        System.out.println("Somme minimale parmi les lignes : " + min);
        System.out.println("Somme maximale parmi les lignes : " + max);
        
        sc.close();
    }
}