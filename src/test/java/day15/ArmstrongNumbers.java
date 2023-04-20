package day15;

import java.util.Scanner;

public class ArmstrongNumbers {
/*
	 	A number is called an Armstrong number if it equals to the sum of the cube of its every digit.
	    For example, 153 is an Armstrong number because of 153= 1 + 125 + 27, which is equal to 1^3+5^3+3^3.
	    You need to write a program to check if the given number is Armstrong number or not.
	    1*1*1=1
	    5*5*5=125
	    3*3*3=27
	    1+125+27 = 153
	*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number");
        int number = scan.nextInt();

        //System.out.println(Math.pow(1, 3));

        int sumOfCubes = 0;
        int temp = number;
        int digit = 0;


//        while(number > 0){
//            digit = number % 10;
//            sumOfCubes = sumOfCubes + digit * digit * digit;
//            number = number / 10;
//        }
//            if(temp == sumOfCubes){
//                System.out.println("This is Armstrong");
//            }else{
//                System.out.println("This is not Armstrong");
//            }

        while(number > 0){
            digit = number % 10;
            System.out.println(digit + "dd");
            sumOfCubes = (int) (sumOfCubes + Math.pow(digit,3));
            number = number / 10;
            System.out.println(number + "nn");
        }
            if(temp == sumOfCubes){
                System.out.println("This is Armstrong");
            }else{
                System.out.println("This is not Armstrong");
            }


    }

}
