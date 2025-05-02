import java.util.Scanner;
public class les_methods {
    public static int lecturN(int n) {
        Scanner scanner = new Scanner(System.in);
        
        
        while (true) {
            System.out.print("Donner un entier positif n = ");
            
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 0) {
                    return n;
                }
            } else {
                scanner.next();
            }
        }
    }

    public static  double  Somme(double [] Tab){

        double S=0;

        for (int i = 0; i <= Tab.length; i++) {
            S=S+i ;
            
        }  
        return S;


    }
    public static double   incrementer(double [] Tab , double x){
        double K=x+Tab[0];
        for (int i = 1; i <= Tab.length; i++) {
            K=K+i ;
            
        }
        return  K ;

        




    }

    
}
