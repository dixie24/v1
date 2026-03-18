
    public static void sayHello() {
        System.out.println("Привет!");
    }
    public static void main(String[] args) {
        // вызываем методы
        sayHello();

        int result = add(5, 3);
        System.out.println(result); // 8

        String message = greet("Алибек");
        System.out.println(message); // Hello, Алибек!
    }
        public static String greet(String name) {
            return "Hello, " + name + "!";
        }

}