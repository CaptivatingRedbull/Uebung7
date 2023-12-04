package Aufgabe3;

public class Zeit {
    private final int h;
    private final int min;

    public Zeit() {
        h = min = 0;
    }

    public Zeit(int h, int min) {
        if (0 > h || 0 > min || 24 < h || 59 < min) {
            this.h = this.min = 0;
            System.out.println("Sie haben eine unmögliche Uhrzeit eingegeben.");
            System.out.println("Die Uhrzeit wurde Automatisch auf 00:00 gesetzt");
        } else {
            this.h = h;
            this.min = min;
        }
    }

    public void print() {
        System.out.printf("%02d:%02d\n", h, min);
    }
}
