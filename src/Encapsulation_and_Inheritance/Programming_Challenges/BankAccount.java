package Encapsulation_and_Inheritance.Programming_Challenges;

public class BankAccount {
    private String accountNumber;

    private String accountHolderName;

    private double balance;

    BankAccount(String accountNumber, String accountHolderName){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;

    }

    String getBalance(){
        return "Rs. "+balance;
    }
    public void deposit(double credit){
        if (credit>0){
            balance +=credit;
            System.out.println("The money has been credited to your bank account");
        } else {
            System.out.println("Invalid amount!, please enter valid amount of rupees");
        }
    }
    public void withdrawal(double debit){
        if (debit<=balance){
            balance -= debit;
            System.out.println("The withdrawal is succesfully done");
        } else if (debit<=0) {
            System.out.println("Invalid amount!, please enter valid amount of rupees");
        } else {
            System.out.println("Amount insufficient in your bank account!");
        }
    }
}
