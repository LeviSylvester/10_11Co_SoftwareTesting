public class Impartire {
    public double impartire(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("nu se poate imparti la 0");
        }

        return a / b;
    }
}
