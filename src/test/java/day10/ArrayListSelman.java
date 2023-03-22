package day10;

import java.util.ArrayList;
import java.util.List;


public class ArrayListSelman{
    public static void main(String[] args) {


        //add Method
        List<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(4);
        numbers.add(6);
        numbers.add(9);
        numbers.add(10);

        System.out.println(numbers);

        List<String> name = new ArrayList<>();
        name.add("Ahmet");
        name.add("Mehmet");
        name.add("Can");

        System.out.println(name);

        //Remove Method

        List<String> letters = new ArrayList<>();
        letters.add("Emrah");
        letters.add("Selman");
        letters.add("Tugce");

        System.out.println(letters);

        letters.remove("Emrah");
        System.out.println(letters);

        letters.remove(0);
        System.out.println(letters);

        //Get Method
        List<Object> KaraMurat = new ArrayList<>();
        KaraMurat.add("Deli Dumrul");
        KaraMurat.add(2);
        KaraMurat.add(13.5);
        KaraMurat.add(false);

        System.out.println(KaraMurat);
        System.out.println(KaraMurat.get(2));

        //Set Method:
        KaraMurat.set(2,"USA");
        System.out.println(KaraMurat);


        int[] arr = {2,5,6,9,8,1};

        List<Integer> array = new ArrayList<>();

        for(int i = 0; i < arr.length ; i++){
            array.add(arr[i]);
        }
        System.out.println(array);

        List<Integer> array2 = new ArrayList<>();

        List<Integer> tax = new ArrayList<>();
        tax.add(10);//0
        tax.add(20);//1
        tax.add(30);//2
        tax.add(40);//3

        System.out.println(tax);
        int temp = tax.get(0);// temp'ye 0. index atiyorsun,0. index bosta kaliyor
        tax.set(0,tax.get(2));// Bosalan 0. index'e 2. index atiyorsun
        tax.set(2,temp);// Bosalan 2. index'e de 0. index atiyorsun
        System.out.println(tax);








    }


}
