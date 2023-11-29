package Calculator;

public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void runCalculator() {
        int num1 = view.getUserInput("Введите первое число: ");
        int num2 = view.getUserInput("Введите второе число: ");

        int choice;
        do {
            System.out.println("Выберите операцию:");
            System.out.println("1. Сложение");
            System.out.println("2. Вычитание");
            System.out.println("3. Умножение");
            System.out.println("4. Деление");
            System.out.println("0. Выход");

            choice = view.getUserInput("Введите номер операции: ");

            switch (choice) {
                case 1:
                    int sum = model.add(num1, num2);
                    view.displayResult(sum);
                    break;
                case 2:
                    int difference = model.subtract(num1, num2);
                    view.displayResult(difference);
                    break;
                case 3:
                    int product = model.multiply(num1, num2);
                    view.displayResult(product);
                    break;
                case 4:
                    try {
                        double quotient = model.divide(num1, num2);
                        view.displayResult(quotient);
                    } catch (ArithmeticException e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;
                case 0:
                    System.out.println("Программа завершена.");
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте еще раз.");
            }
        } while (choice != 0);
    }
}