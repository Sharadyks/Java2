package Exception;


import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test2 {
    public static void main(String[] args) throws FileNotFoundException{
        method2();
        System.out.println("Hello");
    }

    public static void method2() throws FileNotFoundException{
        method1();
    }

    public static void method1() throws FileNotFoundException{
        FileReader fileReader = new FileReader("hello.txt");
        //        try{
//            FileReader fileReader = new FileReader("a.txt");
//        } catch (Exception e) {
//
//        }
        // Or instead of this, I can use throws keyword
    }
}
