package exercice1TP2;

public class rectangle {
	double longueur;
    double largeur;
    public rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }
    public double surface() {
        return longueur * largeur;
}}
