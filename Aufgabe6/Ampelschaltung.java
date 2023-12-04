package Aufgabe6;

import java.util.Objects;
import java.util.Scanner;

public class Ampelschaltung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ampel ampel = new Ampel(0);
        boolean run = true;
        while (run) {
            if (scanner.hasNextLine())
                System.out.println(ampel.schalteGetFarbe());
            if (Objects.equals(scanner.nextLine(), "stop"))
                run = false;
        }
    }
}

