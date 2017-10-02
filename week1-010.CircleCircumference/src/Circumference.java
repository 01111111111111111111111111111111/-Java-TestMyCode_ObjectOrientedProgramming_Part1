/*
Directions:
The circumference of a circle is calculated using the formula 2 * pi * radius.
Create a program that asks the user for the radius and then calculates the circumference using the given radius.
Java already contains the value of pi in the Math.PI variable, which you can use in your calculation.

Output:
"Type the radius: 20

Circumference of the circle: 125.66370614359172"

 */
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Program your solution here
        System.out.print("Enter the radius: "); //prompt for user radius
                                                //using double cause user can input more specific radii
        double userRadius = Double.parseDouble(reader.nextLine()); //similar to Int userRadius = Integer.parseInt...
                                                                   //parses user string into manipulable double in our formula
        double userCircum = 2 * Math.PI * userRadius; //Math.PI pre-exists, use within formula, define new Circum placeholder to print
        System.out.println("Circumference of the circle: " + userCircum); //final solution to be calculated & printed

    }
}
