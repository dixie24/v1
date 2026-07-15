public class Complex {
    private final double re; // Real part
    private final double im; // Imaginary part

    public Complex(double real, double imag) {
        this.re = real;
        this.im = imag;
    }

    public Complex plus(Complex b) {
        return new Complex(this.re + b.re, this.im + b.im);
    }

    public Complex minus(Complex b) {
        return new Complex(this.re - b.re, this.im - b.im);
    }

    public Complex times(Complex b) {
        double real = this.re * b.re - this.im * b.im;
        double imag = this.re * b.im + this.im * b.re;
        return new Complex(real, imag);
    }

    public Complex divides(Complex b) {
        double denominator = b.re * b.re + b.im * b.im;
        double real = (this.re * b.re + this.im * b.im) / denominator;
        double imag = (this.im * b.re - this.re * b.im) / denominator;
        return new Complex(real, imag);
    }

    @Override
    public String toString() {
        return String.format("%.2f %s %.2fi", re, (im >= 0 ? "+" : "-"), Math.abs(im));
    }
}
