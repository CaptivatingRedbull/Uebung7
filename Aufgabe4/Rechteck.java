package Aufgabe4;

public class Rechteck {
    private final int l;      //Länge
    private final int b;      //Breite

    public Rechteck(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public int flaeche() {
        return l * b;
    }

    public boolean istQuadrat() {
        return (l == b);
    }
}