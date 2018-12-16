import java.util.Comparator;

public class SortBooksByName implements Comparator<Book>{
    public int compare(Book left, Book right){
        return left.getBookName().toLowerCase().compareTo(right.getBookName().toLowerCase());
    }
}
