public class Main {

    public static void main(String[] args) {
        // вызываем методы
        sayHello();

        int result = add(5, 3);
        System.out.println(result); // 8

        String message = greet("Алибек");
        System.out.println(message); // Hello, Алибек!
    }

    public static void sayHello() {
        System.out.println("Привет!");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static String greet(String name) {
        return "Hello, " + name + "!";
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double calculateTax(double price, double rate) {
        return price * rate / 100;
    }

    public static void sayHello() {
        System.out.println("Привет!");
    }
}