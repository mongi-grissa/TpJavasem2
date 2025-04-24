public class app4 {
    public static void main(String[] args) {
        System.out.println("Nombre de lignes (n1):");
        int n1 = methode.lectureN();
        System.out.println("Nombre de colonnes (n2):");
        int n2 = methode.lectureN();
        
        double[][] M = new double[n1][n2];
        methode.RemplirTab(M);
        
        System.out.println("Sommes des lignes:");
        for (int i = 0; i < n1; i++) {
            double somme = methode.CalculSomme(M, n2, i);
            System.out.println("Ligne " + i + " : " + somme);
        }
    }
}