package day14;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {



    /*
	 	Create a program checks if a String is palindrome or not.
	 	If a word, phrase, or sequence that reads the same backward as forward then it is called "Palindrome",
	    For example, "madam" or "nurses run".
	 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string.");
        String str = scan.nextLine().replace(" ", "").toLowerCase();


        boolean isPalindrome = true;
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) == str.charAt(j))
                continue;

                isPalindrome = false;
                break;
        }
        System.out.println(isPalindrome ? "palindrome" : "isNotPalindrome");


    }
//        palindrome(str);
//    }
//
//
//    public static void palindrome(String str){
//
//        String rev = "";
//        for (int i = str.length()-1; i >= 0;i--){
//            rev = rev + str.charAt(i);
//        }
//        System.err.println(rev);
//            if(str.equals(rev)) {
//                System.out.println(str + " is palindrome");
//                return;
//            }
//                System.out.println(str + " is not palindrome");
//            }


}
