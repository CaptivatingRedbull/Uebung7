package Aufgabe6;

public class Ampel {
    int farbe;
    String[] farben = {"ROT", "ROT-GELB", "GRUEN", "GELB"};

    public Ampel() {
        farbe = 0;
    }

    public Ampel(int farbe) {
        this.farbe = farbe;
    }

    public String getFarbe() {
        return farben[farbe];
    }

    public void schalte() {
        if (farbe < 3)
            farbe++;
        else
            farbe = 0;
    }

    public String schalteGetFarbe() {
        schalte();
        return getFarbe();
    }


}
