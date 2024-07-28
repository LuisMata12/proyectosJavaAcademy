package servicios;

import java.util.List;

public interface BookService {
    void addBook(String title);
    List<String> getBooks();
}
