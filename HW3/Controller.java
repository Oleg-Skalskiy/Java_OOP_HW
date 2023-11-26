import java.util.*;

public class Controller {
    private StreamService streamService;

    // Конструктор класса Controller
    public Controller() {
        streamService = new StreamService();
    }

    // Метод для сортировки списка потоков через StreamService
    public void sortingGroup(List<Stream> streams) {
        streamService.sortingGroup(streams);
    }

}