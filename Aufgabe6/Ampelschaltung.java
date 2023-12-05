package Aufgabe6;

import java.util.Objects;
import java.util.Scanner;

public class Ampelschaltung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ampel ampel = new Ampel(0);

        System.out.println(ampel.getFarbe());
        do {
            if (scanner.hasNextLine())
                System.out.println(ampel.schalteGetFarbe());
        } while (!Objects.equals(scanner.nextLine(), "stop"));
    }
}

