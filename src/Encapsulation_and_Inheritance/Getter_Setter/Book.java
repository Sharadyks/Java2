package Encapsulation_and_Inheritance.Getter_Setter;

public class Book {
    private String author;
    private String title;
    private long noOfPages;
    private String dateOfPublication;

    public Book(String author,String title){
        this.author = author;
        this.title = title;
    }
    public void setNoOfPages(long noOfPages){
        this.noOfPages = noOfPages;
    }
    public void setDateOfPublication(String dateOfPublication){
        this.dateOfPublication = dateOfPublication;
    }

    public String getAuthor(){
        return author;
    }
    public String getTitle(){
        return title;
    }
    public long getNoOfPages(){
        return noOfPages;
    }
    public String getDateOfPublication(){
        return dateOfPublication;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("author='").append(author).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", noOfPages=").append(noOfPages);
        sb.append(", dateOfPublication='").append(dateOfPublication).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
