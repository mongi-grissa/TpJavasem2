public class app2 {
    public static void main(String[] args) {
        int n = methode.lectureN();
        int[] T = new int[n];

        methode.RemplirTab2(T);

        double moyenne = methode.Calcul_Moy(T);
        System.out.println("La moyenne de la classe est: " + moyenne);

        int nombreNotesSup = methode.NombreNote(T, moyenne);
        System.out.println("Nombre de notes supérieures à la moyenne: " + nombreNotesSup);
    }
}