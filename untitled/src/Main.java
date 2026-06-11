import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = 10;

        do {
            System.out.println("This will print at least once.");
            number++;
        } while (number < 5);
    }
// Condition is false, but the block above already ran once.

