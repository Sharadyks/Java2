package OOPS;

class Calculator{
int a;
int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int sum(int a, int b){
//        this.a = a;
//        this.b = b;
        return a+b;
    }
    int product(int a, int b){
//        this.a = a;
//        this.b = b;
        return a*b;
    }
}
public class Demo {
    public static void main(String[] args) {
        Calculator cal1 = new Calculator(14,15);
        System.out.println(cal1.sum(4, 5));
        System.out.println(cal1.sum(6, 10));
    }

}
