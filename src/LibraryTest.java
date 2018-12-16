public class LibraryTest {
    public static void main(String[] args) {
        Library myLibrary = new Library();
        myLibrary.Add(new Book("Where is no Gud", "Max Kidruk", "thriller"));
        myLibrary.Add(new Book("Inferno", "Den Brown", "detective"));
        myLibrary.Add(new Book("Collectioner", "John Fowles", "thriller"));



        myLibrary.info();
        myLibrary.SortByName();
        myLibrary.info();
          }
}
