package Exception;

public class CustomExceptions {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(5000);
        try{
            acc.withdraw(5500);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
