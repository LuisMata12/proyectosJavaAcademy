package servicios;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {
    private List<String> books = new ArrayList<>();

    @Override
    public void addBook(String title) {
        books.add(title);
    }

    @Override
    public List<String> getBooks() {
        return books;
    }
}
