public class Pair<GB, T> {
    T object1;
    GB object2;

     Pair(T object1, GB object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    public T getObject1() {
        return object1;
    }

    public void setObject1(T object1) {
        this.object1 = object1;
    }

    public GB getObject2() {
        return object2;
    }

    public void setObject2(GB object2) {
        this.object2 = object2;
    }

    @Override
    public String toString() {
        return "(" + object1 + "," + object2 + ")";
    }
}
