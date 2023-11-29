import java.util.*;
public class StreamComparator implements Comparator<Stream> {
    // Переопределение метода compare() интерфейса Comparator
    @Override
    public int compare(Stream stream1, Stream stream2) {
// Сравниваем количество Учебных Групп в потоках и возвращаем результат сравнения
        return Integer.compare(stream1.educationalGroups.size(), stream2.educationalGroups.size());
    }
}