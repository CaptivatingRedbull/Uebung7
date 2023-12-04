package Aufgabe1;

public class Kontofuehrung {
    public static void main(String[] args) {
        Konto Maier = new Konto("Maier", 923923191);
        Konto Mueller = new Konto("Mueller", 923923198);

        for (int i = 0; i < 12; i++) {
            if (Math.random() * 2 > 1) {     //Mueller oder Maier
                Mueller.nameGeben();
                if (Math.random() * 2 > 1)    //Ein oder auszahlung
                    Mueller.einzahlen((float) (Math.random() * 200));
                else
                    Mueller.abheben((float) (Math.random() * 200));
            } else {
                Maier.nameGeben();
                if (Math.random() * 2 > 1)    //Ein oder auszahlung
                    Maier.einzahlen((float) (Math.random() * 200));
                else
                    Maier.abheben((float) (Math.random() * 200));
            }
        }

        Mueller.kontoauszug();
        Maier.kontoauszug();
    }
}
