import java.util.*;

public class Stream implements Iterable<EducationalGroup> {
    private List<EducationalGroup> educationalGroups;

    // Конструктор класса Stream
    public Stream() {
        educationalGroups = new ArrayList<>();
    }

    // Метод для добавления Учебной Группы в поток
    public void addGroup(EducationalGroup group) {
        educationalGroups.add(group);
    }

    // Переопределение метода iterator() интерфейса Iterable
    @Override
    public Iterator<EducationalGroup> iterator() {
        return educationalGroups.iterator();
    }

}