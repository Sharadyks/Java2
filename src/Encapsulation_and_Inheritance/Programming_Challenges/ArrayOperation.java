package Encapsulation_and_Inheritance.Programming_Challenges;

public class ArrayOperation {
    private int[] numbers;

    public ArrayOperation(int[] numbers) {
        this.numbers = numbers;
    }

    class Statistics{
        double mean(){
            double sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            return sum/numbers.length;
        }
        double median(){
            return 0;
        }
    }
}
