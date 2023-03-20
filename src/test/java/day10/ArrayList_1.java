package day10;

import java.util.List;

public class ArrayList_1 {

    public static void main(String[] args) {

        // Wrapper Cl kullanilabiliyor, primitive degil.

        System.out.println("Harf ekleme: ");
        List<String> letters = new java.util.ArrayList<>();
        letters.add("e,g,h");
        System.out.println(letters);//[e,g,h]

        System.out.println("Sayi ekleme: ");

        List<Integer> numbers = new java.util.ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        System.out.println(numbers);//[3, 5, 7]

        System.out.println("Istedigin index e deger eklme: ");

        numbers.add(1,10);
        System.out.println(numbers);// Istedigin index e deger eklme : [3, 10, 5, 7]

        System.out.println("Tum list'leri birlestirip getirme: ");

        List<Integer> ekler = new java.util.ArrayList<>();
        ekler.add(4);
        ekler.add(6);
        System.out.println(ekler);

        numbers.addAll(ekler);// boyle yazarsan tum list'leri birlestirip getirir.
        System.out.println(numbers);//[3, 10, 5, 7, 4, 6]

        System.out.println("Iki index arasinda bir baska listeyi ekleme: ");

        //5 iel 7 arasinda ekler i ekle

        numbers.addAll(3,ekler);
        System.out.println(numbers);//[3, 10, 5, 4, 6, 7, 4, 6]



    }
}
