//Создать проект калькулятора комплексных чисел (достаточно сделать сложение, умножение и деление).
//        Применить при создании программы архитектурные паттерны, добавить логирование калькулятора.
//        Соблюдать принципы SOLID, паттерны проектирования.


import java.util.logging.*;

public class Main {
    public static void main(String[] args) {
        ComplexNum num1 = new ComplexNum(6, 9);
        ComplexNum num2 = new ComplexNum(3, 6);
        Calculator calc = new Calculator();

        Logger logger = Logger.getLogger(Main.class.getName());
        logger.setLevel(Level.ALL);
        calc.setViewer(new Additional());

        calc.setViewer(new Additional());
        ComplexNum address = calc.complexNum(num1,num2);
        logger.info("Additional Result: " + address);

        calc.setViewer(new Multiple());
        ComplexNum multi = calc.complexNum(num1,num2);
        logger.info("Multiplication Result: " + multi);

        calc.setViewer(new Division());
        ComplexNum division = calc.complexNum(num1,num2);
        logger.info("Division Result: " + division);

    }
}
