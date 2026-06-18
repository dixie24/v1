import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;

        System.out.println("Добро пожаловать в консольный калькулятор!");
        System.out.println("----------------------------------------");

        while (continueCalculating) {
            // Ввод первого числа
            System.out.print("Введите первое число: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Ошибка! Введите корректное число.");
                scanner.next();
            }
            double num1 = scanner.nextDouble();

            // Ввод оператора
            System.out.print("Введите операцию (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            // Ввод второго числа
            System.out.print("Введите второе число: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Ошибка! Введите корректное число.");
                scanner.next();
            }
            double num2 = scanner.nextDouble();

            double result = 0;
            boolean validOperation = true;

            // Вычисление результата
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Ошибка: Деление на ноль невозможно!");
                        validOperation = false;
                    } else {
                        result = num1 / num2;
                    }
                    break;
                default:
                    System.out.println("Ошибка: Неверный оператор!");
                    validOperation = false;
                    break;
            }

            // Вывод результата
            if (validOperation) {
                System.out.printf("Результат: %.2f %c %.2f = %.2f\n", num1, operator, num2, result);
            }

            // Проверка на продолжение работы
            System.out.print("\nХотите продолжить? (y/n): ");
            char choice = scanner.next().toLowerCase().charAt(0);
            if (choice != 'y') {
                continueCalculating = false;
            }
            System.out.println("----------------------------------------");
        }

        System.out.println("Спасибо за использование! До свидания.");
        scanner.close();
    }
}