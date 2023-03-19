package src.test.org.scientificCalculator.basicFunctions.baseFeatures;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial not defined for negative integers");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

}
