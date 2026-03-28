import java.util.ArrayList;
import java.util.Scanner;

public class lists {
    static Scanner input = new Scanner(System.in);
    static ArrayList<String> list = new ArrayList<>();
    static ArrayList<Integer> list1 = new ArrayList<>();
    public static void main(String[] args) {
//        exercise1();
//        exercise2();
//        exercise3();
//        exercise4();
//        exercise5();
//        exercise6();
//        exercise7();
//        exercise8();
//        exercise9();
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(63);
        list2.add(-9);
        list2.add(21);
        list2.add(48);
        list2.add(12);
        list2.add(6);
        list2.add(96);
        list2.add(108);
        printNumbersInRange(list2,36,64);

    }


//    EXERCISE 1- In the exercise template there is a program that reads inputs from the user and adds them to a list. Reading is stopped once the user enters an empty string.Your task is to modify the method to print the last read value after it stops reading. Print the value that was read last from the list. Use the method that tells the size of a list to help you.
    static void exercise1(){
        while (true){
            String words = input.nextLine();
            if (words.isEmpty()){
                break;
            }
            list.add(words);
        }
        int index = list.size()-1;
        System.out.println(list.get(index));
    }

//    EXERCISE 2- In the exercise template there is a program that reads inputs from the user and adds them to a list. Reading is stopped once the user enters an empty string.Modify the program to print both the first and the last values after the reading ends. You may suppose that at least two values are read into the list.
    static void exercise2(){
        while (true){
            String chars = input.nextLine();
            if (chars.isEmpty()){
                break;
            }
            list.add(chars);
        }
        int index1 = 0;
        int index2 = list.size()-1;
        if (list.size()==1){
            System.out.println("Method cannot work properly!");
        } else
            System.out.println("The first string is: "+ list.get(index1) + "\nThe last string is: " + list.get(index2));
    }

//    EXERCISE 3- The exercise template contains a base that reads numbers from the user and adds them to a list. Reading is stopped once the user enters the number -1.Expand the functionality of the program so that after reading the numbers, it prints all the numbers received from the user. The number used to indicate stopping should not be printed.
    static void exercise3(){
        while (true){
            int num = input.nextInt();
            if (num==-1){
                break;
            }
            list1.add(num);
        }
        int i=0;
        while (i<list1.size()){
            System.out.println(list1.get(i));
            i++;
        }
    }

//    EXERCISE 4- The exercise template contains a base that reads numbers from the user and adds them to a list. Reading is stopped once the user enters the number -1.Expand the program to ask for a start and end indices once it has finished asking for numbers. After this the program shall prints all the numbers in the list that fall in the specified range (between the indices given by the user, inclusive). You may assume that the user gives indices that match some numbers in the list.
   static void exercise4(){
        while (true){
            int num = input.nextInt();
            if (num==-1){
                break;
            }
            list1.add(num);
        }
       System.out.print("From where: ");
        int start = input.nextInt();
       System.out.println("To where: ");
        int end = input.nextInt();
        for (int i=start; i<end; i++){
            System.out.println(list1.get(i));
        }
   }

//   EXERCISE 5- The exercise template contains a base that reads numbers from the user and adds them to a list. Reading is stopped once the user enters the number -1.Continue developing the program so that it finds the greatest number in the list and prints its value after reading all the numbers. The programming should work in the following manner.
    static void exercise5(){
        while (true){
            int num = input.nextInt();
            if (num==-1){
                break;
            }
            list1.add(num);
        }
        int greatest = list1.get(0);
        for (int i=1; i<list1.size(); i++){
           if (list1.get(i)>greatest){
               greatest = list1.get(i);
           }
        }
        System.out.println("The greatest number is :" + greatest);
    }

//    EXERCISE 6- The exercise template contains a base that reads numbers from the user and adds them to a list. Reading is stopped once the user enters the number -1.Expand the program by adding a functionality that asks the user for a number, and reports that number's index in the list. If the number is not found, the program should not print anything.
    static void exercise6(){
        while (true){
            int num = input.nextInt();
            if (num==-1){
                break;
            }
            list1.add(num);
        }
        System.out.print("Give the number: ");
        int a = input.nextInt();
        for (int i=0; i<list1.size(); i++){
            if (a==list1.get(i)){
                System.out.println("The number is at index:" + i);
            }
        }
    }

//    EXERCISE 7- Write a program that reads numbers from the user. When number 9999 is entered, the reading process stops. After this the program will print the smallest number in the list, and also the indices where that number is found. Notice: the smallest number can appear multiple times in the list.
    static void exercise7(){
        while (true){
            int num = input.nextInt();
            if (num==9999){
                break;
            }
            list1.add(num);
        }
        int smallest = list1.get(0);
        int count = 0;
        for (int i=1; i<list1.size(); i++){
            if (list1.get(i)<smallest){
                smallest = list1.get(i);
            }
        }
        System.out.println("The smallest number is :" + smallest);
        for (int i=0; i<list1.size(); i++){
            if (smallest == list1.get(i)){
                System.out.println(smallest + " is found at " + i);
            }
        }
    }

//    EXERCISE 8- The exercise template contains a base that reads numbers from the user and adds them to a list. Reading is stopped once the user enters the number -1.Modify the program so that after reading the numbers it calculates and prints the sum of the numbers in the list.
    static void exercise8(){
        while (true){
            int num = input.nextInt();
            if (num==-1){
                break;
            }
            list1.add(num);
        }
        int sum = 0;
        for (Integer i : list1){
            sum += i;
        }
        System.out.println("The sum of all numbers are: " + sum);
    }

//    EXERCISE 9- The exercise template contains a base that reads numbers from the user and adds them to a list. Reading is stopped once the user enters the number -1.When reading ends, calculate the average of the numbers in it, and then print that value.
    static  void exercise9(){
        while (true){
            int num = input.nextInt();
            if (num==-1){
                break;
            }
            list1.add(num);
        }
        int sum=0;
        int count=0;
        for (Integer i : list1){
            count++;
            sum += i;
        }
        double avg = (double) sum /count;
        System.out.println("The average is "+ avg);
    }

//    EXERCISE 10- Create the method public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) in the exercise template. The method prints the numbers in the given list whose values are in the range [lowerLimit, upperLimit]. A few examples of using the method are supplied below.
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        for (int i=0; i<numbers.size(); i++){
            if (numbers.get(i)>=lowerLimit && numbers.get(i)<=upperLimit){
                System.out.println(numbers.get(i));
            }
        }
    }
}
