package entities;

public class Triangle {
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("All side measurements must be greater than zero.");
        }

        if (a >= b + c || b >= a + c || c >= a + b) {
            throw new IllegalArgumentException(String.format("Invalid measurements (%.2f, %.2f, %.2f). The sum of any two sides must be strictly greater than the third.", a, b, c));
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public String toString() {
        return String.format("Sides: %.2f | %.2f | %.2f", a, b, c);
    }
}
