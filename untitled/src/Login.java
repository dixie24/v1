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
}
