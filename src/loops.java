import com.sun.jdi.IntegerValue;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {


//        INFINITE LOOP
//        while (true){
//            System.out.println("Sharad");
//
//        }


//        USING BREAK STATEMENT
//        int number  = 1;
//        while(true){
//            System.out.println(number);
//            if (number>=10){
//                break;
//            }
//            number += 1;
//        }
//        System.out.println("its done");


//        USER INPUT LOOP
        Scanner scanner = new Scanner(System.in);
//        while (true){
//            System.out.println("If you want to exit say y");
//            String input = scanner.nextLine();
//            if (input.equals("y")){
//                break;
//            }
//            System.out.println("OK let's carry on");
//        }
//        System.out.println("So you are out of that program now");


//      EXERCISE - Write a program by using the loop example that asks "Shall we carry on?" until the user inputs the string "no".
//        while (true){
//            System.out.println("Shall we carry on?");
//            String input = scanner.nextLine();
//            if (input.equals("no")){
//                break;
//            }
//        }
//        System.out.println("Ok lets move further!");


//        USING CONTINUE KEYWORD - EXERCISE
//        Write a program that asks the user for numbers. If the number is negative (smaller than zero), the program prints for user "Unsuitable number" and asks the user for a new number. If the number is zero, the program exits the loop. If the number is positive, the program prints the number to the power of two.
//        while (true){
//            System.out.println("Provide a number please");
//            double number = scanner.nextDouble();
//            if (number<0){
//                System.out.println("Unsuitable number!");
//                continue;
//            } else if (number==0) {
//                break;
//            } else {
//                System.out.println(Math.pow(number, 2));
//            }
//        }


//        EXERCISE-Write a program that reads values from the user until they input a 0. After this, the program prints the total number of inputted values. The zero that's used to exit the loop should not be included in the total number count.
        int count = 0;
        while (true){
            System.out.println("Enter a number: ");
            int num = scanner.nextInt();
            if (num!=0){
                count +=1;
                continue;
            } else{
                break;
            }
        }
        System.out.println("Total input values are: " + count);
    }
}
