package Aufgabe4;

public class RechteckListe {
    public static void main(String[] args) {
        int quadrate = 0;
        int flaeche = 0;
        Rechteck[] rechtecke = new Rechteck[1000];
        for (int i = 0; i < rechtecke.length; i++) {
            rechtecke[i] = new Rechteck((int) (Math.random() * 10), (int) (Math.random() * 10));
            if (rechtecke[i].istQuadrat())
                quadrate++;
            flaeche += rechtecke[i].flaeche();
        }
        flaeche = flaeche / 1000;
        System.out.println("Durchschnittliche Fläche: " + flaeche);
        System.out.println("Anzahl der Quadrate: " + quadrate);
    }
}