package day09;

public class CallOtherClass {

    public static void main(String[] args) {

        // object
        Fridge objectFridge = new Fridge();

        System.out.println(objectFridge.beer);

        Fridge obj2 = new Fridge(20,10);

        System.out.println(obj2);


    }
}
