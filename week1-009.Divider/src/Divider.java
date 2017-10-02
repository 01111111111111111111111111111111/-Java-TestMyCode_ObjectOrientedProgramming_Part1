//Trying to use GitHub with IntelliJ
//Committing changes
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        System.out.println("Type a number: "); //scanner prompt asking user to input
        int firstNum = Integer.parseInt(reader.nextLine()); //actual assigning to user input using reader

        //Important aspect of this exercise is:
        //1. "parseInt" method to convert
            //user inputted string --> parse --> int so that no compatibility errors
        //2. string or int cannot be used to calculate and print a float value like 0.5
            //Need to type-cast for desired decimal value

        System.out.println("Type another number: ");
        int secondNum = Integer.parseInt(reader.nextLine());

        //double divided = (double)firstNum / secondNum;
        //above works just as well as below--both a form of type casting double for compatibility

        double divided = 1.0 * firstNum / secondNum;

        //Trick to compatible float is multiplying string by a float using 1.0
        //or type cast operation (double)

        System.out.println("");
        System.out.println("Division: " + firstNum + " / " + secondNum + " = " + divided); //print end after calculating numbers

    }
}
