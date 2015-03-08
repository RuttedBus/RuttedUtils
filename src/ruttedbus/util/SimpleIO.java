package ruttedbus.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public final class SimpleIO {

    /* Do not allow creation of Utility Class */
    private SimpleIO() throws IllegalAccessException {
        throw new IllegalAccessException("Utility class cannot be instantiated!");
    }

    /**
     * Prompts user to enter an integer, until a valid integer is entered. Uses default radix.
     * @param prompt Prompt printed to console on each attempt to enter integer
     * @return Integer entered in console
     */
    public static int readInt(String prompt) {
        int input;
        Scanner scanner;
        while(true) {
            try {
                scanner = new Scanner(System.in);
                System.out.print(prompt);
                //Getting input, exception occurs here
                input = scanner.nextInt();
                break;
            }
            catch(InputMismatchException e) {
                // Use out stream instead of error stream, since error stream does not allow for consistent printing
                System.out.println("Illegal integer format.");
            }
        }
        scanner.close();
        return input;
    }

}