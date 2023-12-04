package Aufgabe2;

public class RaumBelegung {
    public static void main(String[] args) {
        Raum raum = new Raum();
        raum.reservieren(12);
        raum.reservieren(0, 6);
        raum.reservieren(12);
        raum.reservieren(13);
        raum.reservieren(10, 15);
        System.out.println("Aktueller Belegungsplan: ");
        for (int i = 0; i < raum.belegungsplanAusgeben().length; i++) {
            System.out.print(i + ":00 bis " + (i + 1) + ":00:\t");
            System.out.println(raum.belegungsplanAusgeben()[i] ? "frei" : "reserviert");
        }
    }
}
