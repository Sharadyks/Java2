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
}
