import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("donner un entier");
        int n = scanner.nextInt();
        int[] t = new int[n];
        remplir(t);
        System.out.println("tableau initial");
        affich(t);
        System.out.println();
        tri(t);
        System.out.println("tableau trie");
        affich(t);
    }
    
    static void remplir(int[] t) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("donner les elements du tableau");
        for (int i = 0; i < t.length; i++) {
            t[i] = scanner.nextInt();
        }
    }
    
    static void tri(int[] t) {
        int aux;
        for (int i = 0; i < t.length - 1; i++) {
            for (int j = i + 1; j < t.length; j++) {
                if (t[i] > t[j]) {
                    aux = t[i];
                    t[i] = t[j];
                    t[j] = aux;
                }
            }
        }
    }
    
    static void affich(int[] t) {
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i] + " ");
        }
        System.out.println();
    }
}