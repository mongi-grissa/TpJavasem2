public class app3 {
    public static void main(String[] args) {
        int n = methode.lectureN();
        int[] T = new int[n];
        
        methode.RemplirTab(T);
        
        int[] T_pair = methode.CréerTpair(T);
        int[] T_impair = methode.CréerTimpair(T);
        
        System.out.println("Tableau T:");
        methode.AfficheTab(T);
        
        System.out.println("Tableau des pairs:");
        methode.AfficheTab(T_pair);
        
        System.out.println("Tableau des impairs:");
        methode.AfficheTab(T_impair);
    }
}