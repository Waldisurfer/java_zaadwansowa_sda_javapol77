package exceptions;

import java.util.Scanner;

public class ExceptionApp {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        try {
            greet(userInput);
        } catch (IllegalArgumentException exception) {
            System.out.println("Wyswietl blad, imie jest puste");
            System.out.println(exception.getMessage());
        }
        System.out.println("Zamykam program.");
    }

    static void greet(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name is empty");
        }
        System.out.println("Hello " + name);
    }
}



