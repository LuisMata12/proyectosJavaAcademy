package servicios;
import java.util.List;
public class InventoryService {
    public int getBookCount(List<String> books) {
        return books.size();
    }
}
