package Loops;

import java.util.Scanner;

public class forLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        EXERCISE 1 - Write a program that reads an integer from the user. Next, the program prints numbers from 0 to the number given by the user. You can assume that the user always gives a positive number. Below are some examples of the expected functionality.
//        int num = input.nextInt();
//        for (int i =0; i<=num; i++){
//            System.out.println(i);
//        }


//        EXERCISE 2 - Write a program, which reads an integer from the user. Then the program prints numbers from that number to 100. You can assume that the user always gives a number less than 100. Below are some examples of the expected functionality.
//        int num = input.nextInt();
//        for (int i=num; i<=100; i++){
//            System.out.println(i);
//        }


//        EXERCISE 3 : Ask the user for the starting point as well.
//        System.out.println("Where to?: ");
//        int num1 = input.nextInt();
//        System.out.println("Where from?: ");
//        int num2 = input.nextInt();
//
//        for (int i=num2; i<=num1; i++){
//            System.out.println(i);
//        }


//        EXERCISE 4 - Implement a program, which calculates the sum 1+2+3+...+n where n is given as user input.
//        System.out.print("Give a number: ");
//        int num = input.nextInt();
//        int sum = 0;
//        for (int i = 0; i<=num; i++){
//            sum += i;
//        }
//        System.out.println(sum);


//      EXERCISE 5 - Implement a program which calculates the sum of a closed interval, and prints it. Expect the user to write the smaller number first and then the larger number.You can base your solution to this exercise to the solution of last exercise — add the functionality for the user to enter the starting point as well.
//        System.out.println("In this program we will add values of a closed interval");
//        System.out.print("Enter the First number: ");
//        int num1 = input.nextInt();
//        System.out.print("Enter the Last number: ");
//        int num2 = input.nextInt();
//        int sum = 0;
//
//        for (int i = num1; i<=num2; i++){
//            sum += i;
//        }
//        System.out.println("The sum is: " + sum);


//        EXERCISE 6 - Implement a program which calculates the factorial of a number given by the user.
//        System.out.println("Welcome to the factorial calculator!");
//        System.out.print("Enter the number: ");
//        int num = input.nextInt();
//        int a = 1;
//        int fact = 1;
//        for (int i =1; i<=num; i++){
//            fact = fact*i;
//        }
//        when i = 1 , fact = 1*1 = 1
//        when i = 2 , fact = 1*2 = 2
//        when i = 3 , fact = 2*3 = 6
//        when i = 4 , fact = 6*4 = 24
//        when i = 5 , fact = 24*5= 120
//        System.out.println("The facorial of " + num + " is : " + fact);


        System.out.print("Write numbers, negative numbers are invalid: ");
        int sum = 0;
        int validNumbers = 0;
        int invalidNumbers = 0;

        while (true) {
            int num = Integer.valueOf(input.nextLine());

            if (num == 0) {
                System.out.println("Sum of valid numbers: " + sum);
                System.out.println("Valid numbers: " + validNumbers);
                System.out.println("Invalid numbers: " + invalidNumbers);
                break;
            }

            if (num < 0) {
                invalidNumbers++;
                continue;
            }

            sum += num;
            validNumbers++;
        }
    }
}
