package Aufgabe1;

public class Konto {
    private final String kontoinhaber;
    private float kontostand;
    private final long kontonummer;

    public Konto(String initName, long initKontonummer) {
        kontoinhaber = initName;
        kontostand = 0f;
        kontonummer = initKontonummer;
    }

    public void nameGeben() {
        System.out.println(kontoinhaber);
    }

    public void abheben(float betrag) {
        if (kontostand >= betrag) {
            kontostand -= betrag;
            System.out.println("Es wurden " + betrag + "€ Abgehoben.");
            System.out.println("Ihr neuer kontostand beträgt " + kontostand + "€.");
        } else
            System.out.println("Es ist nicht genug Geld auf ihrem Konto.");
    }

    public void einzahlen(float betrag) {
        kontostand += betrag;
        System.out.println("Es wurden " + betrag + "€ eingezahlt.");
        System.out.println("Ihr neuer kontostand beträgt " + kontostand + "€.");
    }

    public void kontoauszug() {
        System.out.println("Kontoinhaber: \t" + kontoinhaber);
        System.out.println("Kontonummer: \t" + kontonummer);
        System.out.println("Kontostand: \t" + kontostand);
    }
}
