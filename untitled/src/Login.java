public class Login {

    private String validUsername = "admin";
    private String validPassword = "password123";

    /**
     * Метод для проверки данных пользователя
     *
     * @param username введенное имя
     * @param password введенный пароль
     * @return true, если данные верны, иначе false
     */
    public boolean authenticate(String username, String password) {
        return validUsername.equals(username) && validPassword.equals(password);

    }
    public static void main(String[] args) {
        LoginSystem login = new LoginSystem();

        // Пример использования
        String inputUser = "admin";
        String inputPass = "password123";

        if (login.authenticate(inputUser, inputPass)) {
            System.out.println("Успешный вход!");
        } else {
            System.out.println("Ошибка: неверное имя пользователя или пароль.");
        }
    }
}