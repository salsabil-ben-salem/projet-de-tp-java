package tp3ex1;
import java.util.Scanner;
import java.util.Arrays;
public class tp3ex1tableau {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] tableau = new int[5];

    System.out.println("Entrez 5 nombres :");
    for (int i = 0; i < tableau.length; i++) {
    System.out.print("Nombre " + (i + 1) + " : ");
    tableau[i] = input.nextInt();
    }
    System.out.println("\nContenu du tableau :");
    for (int i = 0; i < tableau.length; i++) {
    System.out.print(tableau[i] + " ");
    }
for (int i = 0; i < tableau.length - 1; i++) {
    for (int j = 0; j < tableau.length - 1 - i; j++) {
    if (tableau[j] > tableau[j + 1]) {
    int temp = tableau[j];
    tableau[j] = tableau[j + 1];
    tableau[j + 1] = temp;
    }
    }
    }
    System.out.println("\nTableau trié :");
    for (int i = 0; i < tableau.length; i++) {
    System.out.print(tableau[i] + " ");
    }
    
    System.out.println("\n Entrez un nombre à rechercher dans le tableau : ");
    int nombre = input.nextInt();

    int indice = -1;

    for (int i = 0; i < tableau.length; i++) {
        if (tableau[i] == nombre) {
            indice = i;
        }
    }

    if (indice != -1) {
        System.out.println("Le nombre " + nombre + " : indice " + indice + ".");
    } else {
        System.out.println("Le nombre " + nombre + " n’existe pas dans le tableau.");
    }
}
}
