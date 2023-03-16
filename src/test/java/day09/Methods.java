package day09;

public class Methods {
    public static void main(String[] args) {

        add();
        add2(10,20);
        int xx = add3(30,40);
        System.out.println(xx);
        System.out.println(add3(40,50));
    }
    public static void add(){
        int yy = 30;
        System.out.println(yy);
    }

    public static void add2(int num, int num2){
        int numb = num  +num2;
        System.out.println("Addition : " + numb);

    }

    public static int add3(int sayi1,int sayi2){

        int tugce = sayi1 + sayi2;
        return tugce;
    }



}
