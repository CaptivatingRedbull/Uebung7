package Aufgabe5;

public class BruchTest {
    public static void main(String[] args) {
        Bruch bruch1 = new Bruch(4, 1);
        Bruch bruch2 = new Bruch(8, 2);
        bruch1 = Bruch.division(bruch1, bruch2);
        System.out.println(bruch1);
    }
}
