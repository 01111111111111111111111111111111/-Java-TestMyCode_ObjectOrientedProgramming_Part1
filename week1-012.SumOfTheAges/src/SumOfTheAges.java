/*
Exercise #12 SumOfTheAges
Directions: Create a program that asks for the names and ages of two users.
After that the program prints the sum of their ages.

Desired output:
_____________________
Type your name: Matti
Type your age: 14

Type your name: Arto
Type your age: 12

Matti and Arto are 26 years old in total.
*/



import java.util.Scanner; //import Scanner class

public class SumOfTheAges {

    public static void main (String[] args){

       Scanner reader = new Scanner (System.in); //calls Scanner class into main method of program SumOfTheAges

            System.out.print("Type your name: "); //asking user #1 string prompt

            String firstName = reader.nextLine(); //parses string input; firstName

            System.out.print("Type your age: ");

            int firstAge = Integer.parseInt(reader.nextLine());

            System.out.println(""); //print blank space after name and age of first person

                System.out.print("Type your name: "); //asking user #2 string prompt

                String secondName = reader.nextLine(); //parses string input; secondName

                System.out.print("Type your age: ");

                int secondAge = Integer.parseInt(reader.nextLine());

                System.out.println(""); //print blank space after name and age of second person

        int totalAge = firstAge + secondAge;  //declare int totalAge as sum of ages together to output

        System.out.print(firstName + " and " + secondName + " are " + totalAge + " years old in total."); //concatenation of int vars and string for full total in names and ages.
    }

}

//committ changes to GitHub for 1st iteration