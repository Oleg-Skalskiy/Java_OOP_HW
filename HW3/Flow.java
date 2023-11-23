
// — Создать класс Поток, содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable;
// — Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Поток;
// — Создать класс ПотокСервис, добавив в него метод сортировки списка потоков, используя созданный StreamComparator;
// — Модифицировать класс Контроллер, добавив в него созданный сервис;
// — Модифицировать класс Контроллер, добавив в него метод, сортирующий список потоков, путём вызова созданного сервиса.

import java.util.*;

public class Flow implements Iterable<ArrayList> {
    @Override
    public Iterator iterator() {
        return null;
    }

    public static void main(String[] args) {

        List<String> studentlist = new ArrayList<>();
        studentlist.add("Maria");
        studentlist.add("Ivan");
        studentlist.add("Petr");
        studentlist.add("Stepan");
        studentlist.add("Valeria");
        studentlist.add("Vitaliy");
        studentlist.add("Olga");
        System.out.println("Before Sorting:");
        Iterator iterator = studentlist.iterator();
        while (iterator.hasNext()) {
            System.out.print("| " + iterator.next() + " |");
        }
        System.out.println("");
        studentlist.sort(Comparator.naturalOrder());
        System.out.println("After Sorting:" + "\n" + studentlist);
    }
}
