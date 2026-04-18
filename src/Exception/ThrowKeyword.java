package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowKeyword {
    public static void main(String[] args) throws FileNotFoundException {
        method2();
    }
    public static void method2() throws FileNotFoundException{
        method1();
    }

    public static void method1() throws FileNotFoundException{
        try{
            FileReader fileReader = new FileReader("s.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            throw new FileNotFoundException("There is no file named a.txt");
        }
    }
}
