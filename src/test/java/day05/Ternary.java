package day05;

import java.util.Scanner;

public class Ternary {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please tell me about your daily step count: ");
        int stepCount = scan.nextInt();

       /* if (stepCount > 10000) {
            System.out.println("\"Number is definitely enough!\"");
        } else {
            System.out.println("Mr., you should do it more! ");
        }
*/


        //Ternary : variable = (condition) ? expressionTrue :  expressionFalse;


        String msg = (stepCount > 10000) ? "Number is definitely enough!" : "Mr., you should do it more! ";
        System.out.println(msg);


        //Nested Ternary :

        int n1 = 2, n2 = 9, n3 = -11;

        // to find the largest number

        int largest = (n1 >= n2) ? ((n1 >= n3) ? n1 : n3) : ((n2 >= n3) ? n2 : n3); //9
        System.out.println("Largest Number: " + largest);
    }
}
