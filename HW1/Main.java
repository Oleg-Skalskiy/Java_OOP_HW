// Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм

//     Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
//     Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный 
//     метод getProduct(int name, int volume, int temperature), выдающий продукт соответствующий имени, объёму и температуре
//     В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику, заложенную в программе
//     Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре

// Формат сдачи:
// Ссылка на гитхаб проект
// Подписать фамилию и номер группы

package HW1;

public class Main {

    public static void main(String[] args) {
        Drink hotdrink1 = new Drink("Amaretto", 100, "Almond+Milk");
        Drink hotdrink2 = new Drink("BlackCoffee", 50, "");
        Drink hotdrink3 = new Drink("CoffeWithMilk", 80, "Milk");
        Drink hotdrink4 = new Drink("Mokka", 100, "Cocoa");
        Drink hotdrink5 = new Drink("Cappuccino", 100, "HotMilk");
        System.out.println(hotdrink1);
        System.out.println(hotdrink2);
        System.out.println(hotdrink3);
        System.out.println(hotdrink4);
        System.out.println(hotdrink5);
        Drink tea = new Drink("Tea", 50, "");
        System.out.println(tea);
    }
}
