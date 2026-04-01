package OOPS.Programming_Challenges;
public class Book {

    static int totalBooks;

    String title;

    String author;

    String isbn;

    boolean isBorrowed;

    static{
        totalBooks=0;
    }

    {
        totalBooks++;
    }

    Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    Book(String isbn){
        this("unknown","unknown",isbn);
    }

    static int getTotalBooks(){
        return totalBooks;
    }

    void borrowBook(){
        if (isBorrowed){
            System.out.println("The book has already borrowed\n");
        } else {
            this.isBorrowed = true;
            System.out.println("The book has borrowed, Enjoy the book!!\n");
        }
    }

    void returnBook(){
       if (isBorrowed){
           System.out.println("The book has returned, Thanks for considering us!!\n");
           isBorrowed = false;
       } else {
           System.out.println("The book has already returned\n");
       }
    }

    public static void main(String[] args){
        Book book1 = new Book("Harry Potter","JK Rowlings","JK4026");
        Book book2 = new Book("The Lord of the Rings","JRR Tolkien","JRR2021");
        Book book3 = new Book("The Little Princess","Antoine","A0052");
        Book book4 = new Book("A9680");
        Book book5 = new Book("SY5026");

        book1.borrowBook();
        book1.borrowBook();
        System.out.println(book1.title+"\n");
        book2.borrowBook();
        book3.borrowBook();
        System.out.println(book4.author+"\n");
        book4.author = "Jane Austen";
        System.out.println(book4.author+"\n");
        book4.borrowBook();
        book5.borrowBook();

        book1.returnBook();
        book2.returnBook();
        book3.returnBook();
        book4.returnBook();
        book5.returnBook();
    }
}
