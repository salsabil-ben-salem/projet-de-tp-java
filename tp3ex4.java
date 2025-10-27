package tp3ex4;
import java.util.Scanner;
public class tp3ex4 {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Entrez le nombre d'élèves : ");
	        int n = input.nextInt();
	        double[] notes = new double[n];
	        for (int i = 0; i < n; i++) {
	            System.out.print("Entrez la note de l'élève " + (i + 1) + " /20 : ");
	            notes[i] = input.nextDouble();
	        }

	        double somme = 0;
	        double max = notes[0];
	        double min = notes[0];

	        for (int i = 0; i < n; i++) {
	            somme += notes[i]; 

	            if (notes[i] > max) {
	                max = notes[i];
	            }
	            if (notes[i] < min) {
	                min = notes[i]; 
	            }
	        }

	        double moyenne = somme / n;

	        System.out.println("\n Résultats de la classe ");
	        System.out.println("Somme des notes : " + somme);
	        System.out.println("Note la plus élevée : " + max);
	        System.out.println("Note la plus faible : " + min);
	        System.out.println("Moyenne de la classe : " + moyenne);

	    }
	}
