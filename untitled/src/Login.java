import java.util.Scanner;

public class LoginSystem {

    private String validUsername = "admin#";
    private String validPassword = "password1212";

    public boolean authenticate(String username, String password) {
        return validUsername.equals(username) && validPassword.equals(password);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoginSystem login = new LoginSystem();

        System.out.print("Введите имя пользователя: ");
        String user = scanner.nextLine();

        System.out.print("Введите пароль: ");
        String pass = scanner.nextLine();

        if (login.authenticate(user, pass)) {
            System.out.println("Успешный вход!");

            // Запрос возраста
            System.out.print("Пожалуйста, введите ваш возраст: ");
            int age = scanner.nextInt();

            System.out.println("Спасибо! Ваш возраст: " + age + " лет");
        } else {
            System.out.println("Ошибка: неверное имя пользователя или пароль.");
        }

        scanner.close();
    }
}