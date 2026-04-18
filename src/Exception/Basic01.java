package Exception;

public class Basic01 {
    public static void main(String[] args) {
        int[] numerators = {36,42,30,45};
        int[] denominator = {12,7,0,9};
        for (int i=0; i<8;i++){
            try {
                System.out.println(divide(numerators[i],denominator[i]));
            } catch (IndexOutOfBoundsException e){
                System.out.println("Exception found!!!");
            }
        }
        System.out.println("Good job");
    }
    static int divide(int a, int b){
        try {
             return a/b;
        } catch (ArithmeticException e){
            return -1;
        } catch (Exception e) { // This class is parent class of many exception classes
            return -1;
        }

    }
}
