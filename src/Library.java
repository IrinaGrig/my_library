import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    public void Add(Book book){
        books.add(book);
    }
    public void info(){
        System.out.println("Books list:");
        for(int iter = 0; iter < books.size(); iter++){
            books.get(iter).info();
        }
        System.out.println("Finish Library.");

    }
    public void SortByName(){
        Collections.sort(books,new SortBooksByName());
    }


}
