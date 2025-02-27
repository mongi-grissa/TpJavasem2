import java.util.Scanner;

public class tp7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        $ù
        int nl, nc;
        do {
            System.out.print("Entrez le nombre de lignes ");
            nl = sc.nextInt();
        } while (nl <= 0 || nl >= 50);
        do {
            System.out.print("Entrez le nombre de colonnes ");
            nc = sc.nextInt();
        } while (nc <= 0 || nc >= 50);
        int[][] M = new int[nl][nc];
        System.out.println("Entrez les elements de la matrice");
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                int value;
                do {
                    System.out.print("M[" + i + "][" + j + "] : ");
                    value = sc.nextInt();
                    if (value % 2 != 0) {
                        System.out.println("entier doi etre paire");
                    }
                } while (value % 2 != 0);
                M[i][j] = value;
            }
        }
        int X;
        do {
            System.out.print("Entrez entier pair ");
            X = sc.nextInt();
            if (X % 2 != 0) {
                System.out.println("entier doit être pair");
            }
        } while (X % 2 != 0);
        boolean trouve = false;
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                if (M[i][j] == X) {
                    trouve = true;
                    break;
                }
            }
            if (trouve) break;
        }
        if (trouve) {
            System.out.println(X + "existe");
        } else {
            System.out.println(X + "n'existe pas");
        }
        
        sc.close();
    }
}