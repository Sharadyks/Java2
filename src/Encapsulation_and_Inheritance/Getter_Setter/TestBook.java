package Encapsulation_and_Inheritance.Getter_Setter;

public class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        book1.setAuthor("Sharad Sharma");
        book1.setTitle("War of Stars");
        book1.setNoOfPages(5202);
        book1.setDateOfPublication("23rd October 2028");

        book2.setAuthor("Shivam");
        book2.setTitle("Moment of Joy");
        book2.setNoOfPages(6300);
        book2.setDateOfPublication("24th July 2030");

        System.out.println(book1.getAuthor());
        System.out.println(book1.getTitle());
        System.out.println(book1.getNoOfPages());
        System.out.println(book1.getDateOfPublication());

        System.out.println(book1);
        System.out.println(book2);
    }
}
