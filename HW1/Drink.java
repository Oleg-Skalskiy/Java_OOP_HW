package HW1;

public class Drink {
    public String name;
    public Integer price;
    public String addon;
    public Drink(String name,Integer price,String addon){
        this.name = name;
        this.price = price;
        this.addon = addon;
    }
    public void product(){
        System.out.println("Мелочь есть?");
    }
}
