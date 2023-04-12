package day11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsAndHandle {
    public static void main(String[] args) throws FileNotFoundException {

        //Exceptions:
        // Checked and Unchecked
         int a = 10;
         int b = 0;


        try{
            System.out.println(a / b);
        } catch (ArithmeticException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Her turlu calisir");
        }
       // System.out.println("Kod calisti");


        String dosyaYolu = "src/ExceptionsFileInoutStream/dosya";
        FileInputStream fis = new FileInputStream(dosyaYolu);

        System.out.println("Code is running");









    }
}
