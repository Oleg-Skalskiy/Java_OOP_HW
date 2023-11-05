package HW1;

public class HotDrinkMachine implements VendingMachineInterface {
    public String name;
    public Integer price;
    public String addon;

    public HotDrinkMachine(String name, int price, String addon) {
        this.name = name;
        this.price = price;
        this.addon = addon;
    }

    @Override
    public void interfaces() {
        System.out.println("Готовлю...");

    }

    @Override
    public void preparecoffee() {
        System.out.println("Наливаю...");
    }

    @Override
    public void getProduct() {
        throw new UnsupportedOperationException("Unimplemented method 'getProduct'");
    }
}
