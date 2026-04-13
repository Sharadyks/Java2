package Exception;

public class Basic01 {
    public static void main(String[] args) {
        int[] numerators = {36,42,30,45};
        int[] denominator = {12,7,0,9};
        for (int i=0; i<numerators.length;i++){
            System.out.println(divide(numerators[i],denominator[i]));
        }
    }
    static int divide(int a, int b){
        try {
             return a/b;
        } catch (Exception e){
            System.out.println("Denominator cannot be zero");
            return -1;

        }

    }
}
