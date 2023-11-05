package HW2;

public class Market implements QueueBehaviour, MarketBehaviour {
    @Override
    public void takeQueue() {
        System.out.println("Человек приходит в очередь...");
    }

    @Override
    public void giveOrder() {
        System.out.println("Человек принимает заказ...");
    }

    @Override
    public void releaseQueue() {
        System.out.println("Человек уходит на...");
    }

    public void addPerson() {
        System.out.println("Человек принимает гранаты и патроны...");
    }

    @Override
    public void remPirson() {
        System.out.println("Чедлвека убивают...");
    }

    @Override
    public void updPerson() {
        System.out.println("Человека заменяют...");
    }
}