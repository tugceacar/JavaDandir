package day10;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_2 {
    public static void main(String[] args) {

        System.out.println("Object ile Remove Methodu: ");

        List<String> letters = new ArrayList<>();
        letters.add("A");
        letters.add("B");
        letters.add("K");
        System.out.println(letters);

        System.out.println(letters.remove("B"));// true
        System.out.println(letters);//[A, K]

        System.out.println("index vererek Remove Method: ");

        System.out.println(letters.remove(0));//A
        System.out.println(letters);//[K]

        System.out.println("");
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(150);

        System.out.println(numbers);
        System.out.println(" ");
        System.out.println("Sayi listesi icinden spesifik bir rakami silebilmek : ");
        // Ilgili rakam icin atama yap, sonra remove method icinde kullan

        Integer look = 150;
        numbers.remove(look);
        System.out.println(numbers);

        System.out.println(" ");

        System.out.println("Get Methodu: ");
        System.out.println(" ");
        List<Integer> numnum = new ArrayList<>();

        numnum.add(1);
        numnum.add(2);
        numnum.add(3);
        numnum.add(5);

        System.out.println(numnum);//[1, 2, 3, 5]
        System.out.println(numnum.get(2));//3
        System.out.println("Son karakteri getirmek: ");
        System.out.println(numnum.get(numnum.size()-1));//5
        System.out.println(" ");

        System.out.println("Set Methodu: ");
        System.out.println(" ");
        System.out.println("Bir elementi baska bir element ile degistirebilmek: ");
        System.out.println(numnum.set(1,12));
        System.out.println(numnum);





    }


}
