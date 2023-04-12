package day12;

import java.util.Scanner;

public class Fibo {

    public void fibos(int number) {


        int a = 1;
        int b = 1;
        int c = 0;
        System.out.print(a + " ");
        System.out.print(b + " ");

        for (int i = 1; i < number - 1; i++) {

            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");

        }
    }
}

