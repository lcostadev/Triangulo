import entities.Triangle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("---- Triangle Perimeter Calculator ----\n");

            Triangle t1 = readValidTriangle(sc, "A");
            Triangle t2 = readValidTriangle(sc, "B");
            Triangle t3 = readValidTriangle(sc, "C");

            System.out.println("\n================ RESULTS ================");
            printResult("A", t1);
            printResult("B", t2);
            printResult("C", t3);
        }
    }

    private static Triangle readValidTriangle(Scanner sc, String label) {
        while (true) {
            try {
                System.out.print("Enter 3 measures for triangle " + label + ": ");
                return new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            } catch (IllegalArgumentException e) {
                System.out.println("[DOMAIN ERROR] " + e.getMessage() + " Please try again.\n");
            } catch (InputMismatchException e) {
                System.out.println("[INPUT ERROR] You must enter numeric values. Please try again.\n");
                sc.nextLine();
            }
        }
    }

    private static void printResult(String label, Triangle t) {
        System.out.println("Triangle " + label + " -> " + t);
        System.out.printf("Perimeter: %.2f%n", t.getPerimeter());
        System.out.println("----------------------------------------");
    }
}
