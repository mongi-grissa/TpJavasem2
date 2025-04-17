import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1 Addition");
        System.out.println("2 Soustraction");
        System.out.println("3 Multiplication");
        System.out.println("4 Division");
        System.out.print("Choisissez une opération 1..4 : ");
        
        int choix = sc.nextInt();
        
        System.out.print("entrez le premier nombre : ");
        double nombre1 = sc.nextDouble();
        
        System.out.print("entrez le second nombre : ");
        double nombre2 = sc.nextDouble();
        
        double resultat = 0;
        boolean Valide = true;
        
        switch (choix) {
            case 1:
                resultat = addition(nombre1, nombre2);
                break;
            case 2:
                resultat = soustraction(nombre1, nombre2);
                break;
            case 3:
                resultat = multiplication(nombre1, nombre2);
                break;
            case 4:
                if (nombre2 == 0) {
                    System.out.println("impossible ");
                    Valide = false;
                } else {
                    resultat = division(nombre1, nombre2);
                }
                break;
            default:
                System.out.println("non valide");
                Valide = false;
        }
        
        if (Valide) {
            System.out.println("Le resultat est : " + resultat);
        }
        
        sc.close();
    }
    
    public static double addition(double a, double b) {
        return a + b;
    }
    
    public static double soustraction(double a, double b) {
        return a - b;
    }
    
    public static double multiplication(double a, double b) {
        return a * b;
    }
    
    public static double division(double a, double b) {
        return a / b;
    }
}