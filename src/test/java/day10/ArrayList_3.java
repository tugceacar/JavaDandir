package day10;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_3 {
    public static void main(String[] args) {

        System.out.println("Array List'e toplu bir sekilde element eklemenin yontemi : ");
        System.out.println("Once bir Array olusturmak, sonra bos bir Array List yaparak degerleri for loop ile eklemek.");
        System.out.println("  ");

        int[] arr = {2, 5, 6, 6, 9, 7, 0, 8, 4, 1, 4, 8, 7, 9, 6, 3, 1, 5, 5, 6, 4, 4, 5};

        List<Integer> arr2 = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            arr2.add(arr[i]);
        }
        System.out.println(arr2);
        System.out.println(" ");
        System.out.println("Contains Method: ");

        System.out.println(arr2.contains(3));//true

        System.out.println(" ");
        System.out.println("Clear Method: ");

        arr2.clear();
        System.out.println(arr2);

        System.out.println(" ");
        System.out.println("List elementlerinin yerlerini degistirme: : ");

        //2. index teki element ile 5. index teki yer degistirsin.
        List<Integer> change = new ArrayList<>();
        change.add(2);
        change.add(5);
        change.add(23);
        change.add(222);
        change.add(25);
        change.add(12);

        //once bir tanesi temp variable a atansin.
        System.out.println(change);
        int temp = change.get(2);

        //2. index yerine 5. index teki elementi atayalim
        change.set(2, change.get(5));
        // 5. index e temp deger atayalim

        change.set(5,temp);
        System.out.println(change);

    }
}
