package day09;

public class Teacher {

    String name = "Unknown name";
    String lastName = "Unknown lastName";
    String subject = "Unknown subject";


    public static void main(String[] args) {

        Teacher teach = new Teacher("Osman","Acar","Math");

        System.out.print(teach.name + " ");
        System.out.print(teach.lastName + " ");
        System.out.print(teach.subject);

    }

    public Teacher(){


    }

    public Teacher(String isim, String soyad, String bolum){
        this.name = isim;
        this.lastName = soyad;
        this.subject = bolum;

    }



}
