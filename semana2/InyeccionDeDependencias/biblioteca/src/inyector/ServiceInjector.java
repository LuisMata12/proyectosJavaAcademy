package inyector;

import servicios.BookService;
import servicios.BookServiceImpl;
import servicios.InventoryService;

public class ServiceInjector {
    private static BookService bookService;
    private static InventoryService inventoryService;

    public static BookService getBookService() {
        if (bookService == null) {
            bookService = new BookServiceImpl();
        }
        return bookService;
    }

    public static InventoryService getInventoryService() {
        if (inventoryService == null) {
            inventoryService = new InventoryService();
        }
        return inventoryService;
    }
}
