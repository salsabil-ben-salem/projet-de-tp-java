package exercice1TP2;

public class cercle {
	double rayon;
    final double PI=3.14;
    public cercle(double rayon) {
        this.rayon = rayon;
    }
    public double surface() {
        return PI * rayon * rayon;
    }


}
