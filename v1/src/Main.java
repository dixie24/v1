public class Main {

    public static void main(String[] args) {

        sayHello();

        int result = add(2, 3);
        System.out.println(result); // 8

        String message = greet("Али");
        System.out.println(message); // Hello, Алибек!
    }

    public static void sayHello() {
        System.out.println("Привет!2!");
    }

    public static int add(int a, int b) {
        return (a + a) / (b + b);
    }

    public static String greet(String name) {
        return "Hello!!, " + name + "!";
    }
}