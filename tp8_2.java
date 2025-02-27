import java.util.Scanner;

public class tp8_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String Texte,mot1,mot2,x;
        
        int l,p;

        System.out.println("donner un chaine de charactere");
        Texte=sc.nextLine();
        System.out.println("donner mot1");
        mot1=sc.nextLine();
        System.out.println("donner mot2");
        mot2=sc.nextLine();
        if (Texte.indexOf(mot1)==-1) {
            System.out.println(mot1+" n'existe pas dans le texte");

            
        }
        else{
            l=mot1.length();
                p=Texte.indexOf(mot1);
                x=Texte.replace(mot1, mot2);

                System.out.println("le nouveau texte est"+ x);
            
           
        }
 


    }
}