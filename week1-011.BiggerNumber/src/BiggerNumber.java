/* Directions:
Create a program that asks the user for two integers and then prints the larger of the two.

Tip: When you write Math.
(that is, Math followed by a dot) in NetBeans, it shows you a bunch of available mathematical calculations.
For example, Math.cos(10) calculates the cosine of the number 10. Try to find a suitable tool in Math to complete this exercise!
If you cannot find anything suitable or do not know how to complete the exercise, skip the exercise for now.
We will return to the matter later on.

Desired output:
________________________
Type a number: 20
Type another number: 14

The bigger number of the two numbers given was: 20
 */

import java.util.Scanner; //import Scanner class to call later and parse user input (primitives like double, int, string)

public class BiggerNumber { //name of program same as .java, class

    public static void main (String [] args) { //main method where majority of program will be written under

        Scanner reader = new Scanner (System.in); //calls for new Scanner within main method

        System.out.print("Type a number: "); //1st number to be received set up comparison--user string/prompt asking for input

        int firstNum = Integer.parseInt(reader.nextLine()); //uses .nextLine to read input by user, accepts integer

        System.out.print("Type another number: "); //similar set up as firstNum; now compare 2 integers to each other

        int secondNum = Integer.parseInt(reader.nextLine());

        /*compare function here; comparing firstNum and secondNum
        need to look up a math method to compare
        maybe    java.lang.Math.max(firstNum, secondNum);
        */

        System.out.println("");
        System.out.println("The bigger number of the two numbers given was: " + Math.max(firstNum, secondNum));//whateverComparedVarOutput after string
    }


}

//2nd iteration to github, committing changes--still figuring out how to to use Intellij --> Github smoothly