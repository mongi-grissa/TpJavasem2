import java.util.Scanner;

public class ex3 {
    
    public static int Groupe(String verbe) {
        if (verbe.endsWith("er")) {
            if (verbe.equals("aller")) {
                return 3; 
            }
            return 1;
        } else if (verbe.endsWith("ir")) {
            String pp = verbe.substring(0, verbe.length() - 2) + "issant";
            if (pp.equals(pp(verbe))) {
                return 2;
            } else {
                return 3;
            }
        } else {
            return 3;
        }
    }
    
    private static String pp(String verbe) {
        if (verbe.endsWith("ir")) {
            return verbe.substring(0, verbe.length() - 2) + "issant";
        }
        return ""; 
    }
    
    public static boolean estInf(String verbe) {
        return verbe.matches(".*(er|ir|re|oir)$");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String verbe;
        
        do {
            System.out.print("verbe a l'inf : ");
            verbe = sc.nextLine().trim().toLowerCase();
            
            if (!estInf(verbe)) {
                System.out.println("ress");
            }
        } while (!estInf(verbe));
        
        int groupe = Groupe(verbe);
        System.out.println("Le verbe \"" + verbe + "\" appartient au " + groupe + "ème groupe.");
        
        sc.close();
    }
}