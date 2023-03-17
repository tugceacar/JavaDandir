package day09;

public class Fridge {

    Fridge() {
        // Constructor Method
        // default constructor

    }

    Fridge(int n, int m) {
       int x = n + m;
    }

    String beer = "Coors";
    String beerStatus = "cold";

    int items = 20;

    void vegetable() {
        System.out.println("tomato: " + 10);
        System.out.println("cucmber: " + 20);
        System.out.println("potato: " + 50);
    }

    int beer() {
        return 15;
    }


}
