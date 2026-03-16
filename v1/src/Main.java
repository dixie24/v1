public class Main {
    public static void main(String[] args) {
        String name = "Алибек";
        int age = 25;

        System.out.println("Привет, " + name + "!");
        System.out.println("Тебе " + age + " лет");
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }
}