import java.util.*;

public class Stream implements Iterable<StreamComparator> {
    final List<StreamComparator> educationalGroups;

    // Конструктор класса Stream
    public Stream() {
        educationalGroups = new ArrayList<>();
    }

    // Метод для добавления Учебной Группы в поток
    public <EducationalGroup> void addGroup(EducationalGroup group) {
        educationalGroups.add((StreamComparator) group);
    }

    // Переопределение метода iterator() интерфейса Iterable
    @Override
    public Iterator<StreamComparator> iterator() {
        return educationalGroups.iterator();
    }

}