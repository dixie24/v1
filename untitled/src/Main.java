public class CombinationsGenerator {

    public static void main(String[] args) {
        String alphabet = "abc"; // Набор символов для перебора
        int length = 3;          // Длина комбинации

        System.out.println("Начинаем перебор всех комбинаций...");
        generate("", alphabet, length);
    }

    // Рекурсивный метод для перебора
    private static void generate(String current, String alphabet, int length) {
        // Если достигли нужной длины — выводим результат
        if (current.length() == length) {
            System.out.println(current);
            return;
        }

        // Перебираем каждый символ из алфавита и уходим в рекурсию
        for (int i = 0; i < alphabet.length(); i++) {
            generate(current + alphabet.charAt(i), alphabet, length);
        }
    }
}