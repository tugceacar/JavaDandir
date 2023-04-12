package day12;

import java.util.Scanner;


public class Fibonacci {

    public static void main(String[] args) {


        // => 1 1 2 3 5 8 13...
        //    a b c
        //      a b c
        //        a b c

        Scanner scan = new Scanner(System.in);
        System.out.println("How many fb do you want to see?");
        int number = scan.nextInt();

        Fibo fb = new Fibo();
        fb.fibos(number);

    }
}
