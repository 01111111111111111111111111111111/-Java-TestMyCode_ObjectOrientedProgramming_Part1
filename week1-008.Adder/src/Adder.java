
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user

        System.out.println("Type a number:");
        int firstInt = Integer.parseInt(reader.nextLine());

        System.out.println("Type another number:");
        int secondInt = Integer.parseInt(reader.nextLine());

        int sumInt = firstInt + secondInt;

        System.out.println("Sum of the numbers: " + sumInt);
    }
}
