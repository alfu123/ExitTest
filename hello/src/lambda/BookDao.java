package lambda;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookDao {
    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(101, "Core Java", 400, Arrays.asList(12,19)));
        books.add(new Book(363, "Hibernate", 180,Arrays.asList(23,12)));
        books.add(new Book(275, "Spring", 200,Arrays.asList(25,10)));
        books.add(new Book(893, "WebService", 300,Arrays.asList(22,10)));
        return books;
    }
}
