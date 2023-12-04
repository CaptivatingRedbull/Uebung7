package Aufgabe2;

import java.util.Arrays;

/**
 * codes:
 * 0    wurde erfolgreich reserviert
 * 1    ist bereits reserviert
 * 2    ungültige Uhrzeit
 */

public class Raum {
    private final Boolean[] belegung = new Boolean[24];

    public Raum() {
        Arrays.fill(belegung, true);
    }

    private boolean uhrzeitCheck(int uhrzeit) {
        return uhrzeit > 23 || uhrzeit < 0;
    }

    public int reservieren(int uhrzeit) {
        if (uhrzeitCheck(uhrzeit))
            return 2;
        if (belegung[uhrzeit]) {
            belegung[uhrzeit] = false;
            return 0;
        } else
            return 1;
    }

    public int reservieren(int beginn, int ende) {
        if (uhrzeitCheck(beginn) || uhrzeitCheck(ende))
            return 2;
        for (int i = beginn; i < ende; i++) {
            if (!belegung[i]) {
                return 1;
            }
        }
        for (int i = beginn; i < ende; i++) {
            belegung[i] = false;
        }
        return 0;
    }

    public Boolean[] belegungsplanAusgeben() {
        return belegung;

    }
}
