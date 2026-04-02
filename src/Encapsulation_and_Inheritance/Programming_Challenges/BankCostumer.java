package Encapsulation_and_Inheritance.Programming_Challenges;

public class BankCostumer {
    public static void main(String[] args) {
        BankAccount costumer1 = new BankAccount("SBIxxxx4359","Sharad Sharma");

        costumer1.deposit(50000);
        System.out.println(costumer1.getBalance());
        costumer1.deposit(-5230);
        costumer1.withdrawal(50000);
        System.out.println(costumer1.getBalance());
    }
}
