package methods;

import java.util.Scanner;

public class Caluclater {

    Scanner sc = new Scanner(System.in);

    double add(double a, double b) {
        return a + b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    double division(double a, double b) {
        return a / b;
    }

    void calculate() {

        System.out.println("Enter first number:");
        double a = sc.nextDouble();

        System.out.println("Enter second number:");
        double b = sc.nextDouble();

        System.out.println("Addition: " + add(a, b));
        System.out.println("Subtraction: " + subtract(a, b));
        System.out.println("Multiplication: " + multiply(a, b));
        System.out.println("Division: " + division(a, b));
    }

    public static void main(String[] args) {

        Caluclater me = new Caluclater();

        me.calculate();
    }
}