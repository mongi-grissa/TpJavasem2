import java.util.Scanner;

public class methode {

    public static int lectureN() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Entrez la taille: ");
            n = sc.nextInt();
        } while (n <= 0);
        return n;
    }

    public static void RemplirTab(int[] T) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Remplissage du tableau :");
        for (int i = 0; i < T.length; i++) {
            System.out.print("Entrez l'élément " + (i + 1) + " : ");
            T[i] = sc.nextInt();
        }
    }

    public static void Remplacer(int[] T, int X1, int X2) {
        for (int i = 0; i < T.length; i++) {
            if (T[i] == X1) {
                T[i] = X2;
            }
        }
    }

    public static void AfficheTab(int[] T) {
        for (int val : T) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void RemplirTab2(int[] T) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisie des notes (0 <= note <= 20) :");
        for (int i = 0; i < T.length; i++) {
            do {
                System.out.print("Note " + (i + 1) + " : ");
                T[i] = sc.nextInt();
                if (T[i] < 0 || T[i] > 20) {
                    System.out.println("Erreur : la note doit être entre 0 et 20.");
                }
            } while (T[i] < 0 || T[i] > 20);
        }
    }

    public static double Calcul_Moy(int[] T) {
        double somme = 0;
        for (int note : T) {
            somme += note;
        }
        return somme / T.length;
    }

    public static int NombreNote(int[] T, double moyenne) {
        int count = 0;
        for (int note : T) {
            if (note > moyenne) {
                count++;
            }
        }
        return count;
    }
     
    public static int[] CréerTpair(int[] T) {
        int count = 0;
        for (int num : T) {
            if (num % 2 == 0) count++;
        }
        
        int[] T_pair = new int[count];
        int index = 0;
        for (int num : T) {
            if (num % 2 == 0) {
                T_pair[index++] = num;
            }
        }
        return T_pair;
    }
    
    public static int[] CréerTimpair(int[] T) {
        int count = 0;
        for (int num : T) {
            if (num % 2 != 0) count++;
        }
        
        int[] T_impair = new int[count];
        int index = 0;
        for (int num : T) {
            if (num % 2 != 0) {
                T_impair[index++] = num;
            }
        }
        return T_impair;
    }
    public static void RemplirTab(double[][] M) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Remplissage de la matrice:");
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                System.out.print("M[" + i + "][" + j + "] = ");
                M[i][j] = sc.nextDouble();
            }
        }
    }
    
    public static double CalculSomme(double[][] M, int n2, int i) {
        double somme = 0;
        for (int j = 0; j < n2; j++) {
            somme += M[i][j];
        }
        return somme;
    }
    
}