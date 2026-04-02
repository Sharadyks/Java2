package Encapsulation_and_Inheritance.Getter_Setter;

public class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book("Sharad Sharma","The War of Stars");

        book1.setNoOfPages(5202);
        book1.setDateOfPublication("23rd October 2028");

        System.out.println(book1.getAuthor());
        System.out.println(book1.getTitle());
        System.out.println(book1.getNoOfPages());
        System.out.println(book1.getDateOfPublication());

        System.out.println(book1);
    }
}
