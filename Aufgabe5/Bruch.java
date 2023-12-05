package Aufgabe5;

public class Bruch {
    private final int zaehler;
    private final int nenner;

    public Bruch(int zaehler, int nenner) {
        if (nenner == 0) {
            throw new RuntimeException("Bitte für Nenner nicht 0 einsetzen");
        }
        if (nenner < 0) {
            nenner = Math.abs(nenner);
            zaehler = (-zaehler);
        }
        if (zaehler == 0) nenner = 1;

        int rest = 0;
        int kleinere = Math.min(nenner, zaehler);
        int groessere = Math.max(nenner, zaehler);
        int ggt = 1;

        do {
            rest = groessere % kleinere;
            ggt = rest == 0 ? kleinere : 1;
            groessere = kleinere;
            kleinere = rest;
        } while (rest != 0);


        this.zaehler = zaehler / ggt;
        this.nenner = nenner / ggt;
    }

    public static Bruch addition(Bruch summand1, Bruch summand2) {
        int zaehlerNeu = summand1.zaehler * summand2.nenner + summand2.zaehler * summand1.nenner;
        int nennerNeu = summand1.nenner * summand2.nenner;

        return new Bruch(zaehlerNeu, nennerNeu);
    }

    public static Bruch subtraktion(Bruch minuend, Bruch subtrahend) {
        int zaehlerNeu = minuend.zaehler * subtrahend.nenner - subtrahend.zaehler * minuend.nenner;
        int nennerNeu = minuend.nenner * subtrahend.nenner;

        return new Bruch(zaehlerNeu, nennerNeu);
    }

    public static Bruch multiplikation(Bruch faktor1, Bruch faktor2) {
        int zaehlerNeu = faktor1.zaehler * faktor2.zaehler;
        int nennerNeu = faktor1.nenner * faktor2.nenner;

        return new Bruch(zaehlerNeu, nennerNeu);
    }

    public static Bruch division(Bruch dividend, Bruch divisor) {
        return multiplikation(dividend, new Bruch(divisor.nenner, divisor.zaehler));
    }

    public String toString() {
        return (zaehler + "/" + nenner);
    }

}