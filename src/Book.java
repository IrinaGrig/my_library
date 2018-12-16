

public class Book {
   public Book(String name, String author, String genre){
        bookName = name;
        bookAuthor = author;
        bookGenre = genre;
    }

    private String bookName;
    private String bookGenre;
    private String bookAuthor;

    public void info(){
        System.out.println("Name: " + bookName + ", Author: " + bookAuthor + ", Genre: " + bookGenre );
    }
    public String getBookName(){
        return bookName;
    }

}

