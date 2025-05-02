public class ex5 {

    static void affiche(double[][] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean regulier(double[][] t) {
        int taille = t[0].length;
        for (int i = 1; i < t.length; i++) {
            if (t[i].length != taille)
                return false;
        }
        return true;
    }

    static double[] sommeLignes(double[][] t) {
        double[] resultats = new double[t.length];
        for (int i = 0; i < t.length; i++) {
            double somme = 0;
            for (int j = 0; j < t[i].length; j++) {
                somme += t[i][j];
            }
            resultats[i] = somme;
        }
        return resultats;
    }

    static double[][] somme(double[][] t1, double[][] t2) {
        if (!regulier(t1) || !regulier(t2)) return null;
        if (t1.length != t2.length || t1[0].length != t2[0].length) return null;

        double[][] res = new double[t1.length][t1[0].length];
        for (int i = 0; i < t1.length; i++) {
            for (int j = 0; j < t1[i].length; j++) {
                res[i][j] = t1[i][j] + t2[i][j];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        double[][] t1 = {
            {1.2, 2.5, 3.1},
            {4.0, 5.3, 6.7},
            {7.8, 8.9, 9.0}
        };

        double[][] t2 = {
            {0.8, 0.5, 0.9},
            {1.0, 1.1, 1.2},
            {1.3, 1.4, 1.5}
        };

        System.out.println("Tableau t1 :");
        affiche(t1);

        System.out.println("Est régulier : " + regulier(t1));

        double[] sommes = sommeLignes(t1);
        System.out.print("Sommes des lignes : ");
        for (double s : sommes) System.out.print(s + " ");
        System.out.println();

        System.out.println("Somme t1 + t2 :");
        double[][] sommeTotale = somme(t1, t2);
        if (sommeTotale != null) {
            affiche(sommeTotale);
        } else {
            System.out.println("Addition impossible !");
        }
    }
}