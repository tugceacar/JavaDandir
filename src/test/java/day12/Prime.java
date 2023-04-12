package day12;

import java.util.Scanner;

public class Prime {

    // Enter a positive integer to check if it is prime or not?
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer to check if it is prime or not");
        int number = scan.nextInt();
        primeCalculator(number);
        scan.close();

    }
       // 3
    public static void primeCalculator(int number) {
        int count = 0;
        if (number > 0) {
            if (number == 1) {
                System.out.println(number + " is prime number");
            } else {
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        count++;
                    }
                }
                if (count == 0) {
                    System.out.println(number + " is prime");
                } else {
                    System.out.println(number + " is not prime");
                }
            }
        } else {
            System.out.println("Enter a positive integer");
        }

    }
}




