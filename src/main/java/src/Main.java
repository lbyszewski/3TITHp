package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {






        System.out.println("Podaj liczbę silni: ");

        Scanner scanner = new Scanner(System.in);

        double n = scanner.nextDouble();

        TestClass testClass = new TestClass();

        double wynik = testClass.Silnia(n);

        System.out.println("silnia z liczby wynosi: " + " " + wynik);




    }
}
