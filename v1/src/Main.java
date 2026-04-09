public class Main {

    public static void main(String[] args) {

        sayHello();

        int result = add(5, 3);
        System.out.println(result); // 8

        String message = greet("Алибек");
        System.out.println(message); // Hello, Алибек!
    }

    public static void sayHello() {
        System.out.println("Привет1!");
    }

    public static int add(int a, int b) {
        return a * b;
    }

    public static String greet(String name) {
        return "Hello, " + name + "!";
    }
}