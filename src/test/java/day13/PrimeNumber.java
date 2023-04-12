package day13;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive number : ");
        int num = scan.nextInt();

        String emrah = "Denver";
        for(int i =2; i < num; i++){
            if(num % i == 0){
                emrah = "NY";
                break;
            }
        }
        System.out.println(emrah == "Denver" ? "Prime" : "Not Prime");




//        boolean isPrime = true;
//               for (int i = 2; i < num; i++){
//            if(num % i == 0){
//                isPrime = false;
//                break;
//            }

//        }
//        System.out.println(isPrime ? "Prime" : "Not Prime");

//        int some = 1;
//        for(int i =2; i < num; i++){
//            if(num % i == 0){
//                some+= 1;
//            }
//        }
//        System.out.println(some == 1 ? "Prime" : "Not Prime");





//        int count = 0;
//
//        if (num > 0) {
//            if (num == 1) {
//                System.out.println("1 is a prime number.");
//            } else {
//                for (int i = 2; i < num; i++) {
//                    if (num % 2 == 0) {
//                        count++;

//                    }
//                }
//                if (count == 0) {
//                    System.out.println("PRIME");
//
//                } else {
//                    System.out.println("It is not prime");
//                }
//
//
//            }
//        } else {
//            System.out.println("It is not positive number");
//        }
    }
}