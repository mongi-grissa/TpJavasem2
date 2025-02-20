import java.util.Scanner;

public class tp7_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nl, nc;
        do {
            System.out.print("Entrez ligne");
            nl = sc.nextInt();
        } while (nl <= 0 || nl >= 30);
        do {
            System.out.print("Entrez colone ");
            nc = sc.nextInt();
        } while (nc <= 0 || nc >= 30);
        int[][] M = new int[nl][nc];
        System.out.println("Entrez la matrice :");
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                System.out.print("M[" + i + "][" + j + "] = ");
                M[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        long product = 1;
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                sum += M[i][j];
                product *= M[i][j];
            }
        }
        
        int totalElements = nl * nc;
        double average = (double) sum / totalElements;
        System.out.println("\nRésultats :");
        System.out.println("Somme des éléments : " + sum);
        System.out.println("Produit des éléments : " + product);
        System.out.println("Moyenne des éléments : " + average);
        
        sc.close();
    }
}
