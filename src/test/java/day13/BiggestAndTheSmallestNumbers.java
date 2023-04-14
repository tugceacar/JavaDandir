package day13;

import org.openqa.selenium.json.JsonOutput;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Scanner;

public class BiggestAndTheSmallestNumbers {

    public static void main(String[] args) {


    /*
	 	Create a function that takes an array and
	 	returns the difference between the biggest and the smallest numbers.
	    Ask user to enter array elements.
	*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter array length.");
        int length = scan.nextInt();

        int array[] = new int[length];

        System.out.println("Please enter the array elements");
        for (int i=0; i < length; i++){
            array[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int differrent = array[array.length -1] - array[0];
        System.out.println(differrent);

        scan.close();

    }


}
