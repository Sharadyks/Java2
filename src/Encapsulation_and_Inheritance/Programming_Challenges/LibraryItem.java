package Encapsulation_and_Inheritance.Programming_Challenges;

public class LibraryItem {

    private String itemID;

    private String author;

    private String title;

    private boolean isBorrowed;

    public void checkOut(){
        if (isBorrowed){
            System.out.println("This item is already checked out");
        } else {
            isBorrowed = true;
            System.out.println("Thanks");
        }
    }
    public void returnitem(){
        if (!isBorrowed){
            System.out.println("This item is not borrowed");
        } else {
            isBorrowed = false;
            System.out.println("Thanks, kindly give your feedback");
        }
    }

}
