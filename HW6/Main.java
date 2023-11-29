import java.util.ArrayList;
//Мы использовали принцип 'Single responsibility'. Один класс равен одной задаче. Првели декомпозицию программы путём разбивки на классы Box и Pair.
// Улучшили читаемость кода и повысили корректность её работы.
// Так же использовали принцип 'Dependency inversion'. Один класс независит от другого.
public class Main {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>(1, "Glitter");
        Box.printBoxContents(box);
        box.setThings(4);
        System.out.println(box);
        ArrayList<Pair<String, Integer>> sP = new ArrayList<>();
        sP.add(new Pair<>(999, "Яху...."));
        sP.add(new Pair<>(666, "Ура...."));
        sP.add(new Pair<>(777, "Пупсик...."));
        System.out.println(sP);
        swapPairs(sP);
        System.out.println(sP);
    }
    public static <GB, T> void swapPairs (ArrayList<Pair<GB, T>> sP) {

        for (Pair<GB, T> pair:sP){
            T tempSwap =pair.getObject1();
            pair.setObject1((T) pair.getObject2());
            pair.setObject2((GB) tempSwap);
        }
    }
}
