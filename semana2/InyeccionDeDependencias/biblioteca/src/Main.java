import inyector.ServiceInjector;
import servicios.BookService;
import servicios.InventoryService;

public class Main {
    public static void main(String[] args) {
        BookService bookService = ServiceInjector.getBookService();
        InventoryService inventoryService = ServiceInjector.getInventoryService();

        bookService.addBook("1984");
        bookService.addBook("To Kill a Mockingbird");
        bookService.addBook("The Great Gatsby");

        System.out.println("Books in library:");
        for (String book : bookService.getBooks()) {
            System.out.println(book);
        }

        System.out.println("Total number of books: " + inventoryService.getBookCount(bookService.getBooks()));
    }
}