public class Calculator {
    public static void main(String[] args) {
        Complex a = new Complex(5.0, 6.0);
        Complex b = new Complex(-3.0, 4.0);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a + b = " + a.plus(b));
        System.out.println("a - b = " + a.minus(b));
        System.out.println("a * b = " + a.times(b));
        System.out.println("a / b = " + a.divides(b));
    }
}