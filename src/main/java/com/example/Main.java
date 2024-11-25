package com.example;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the Calculator class
        Calculator calculator = new Calculator();

        // Perform some calculations
        int sum = calculator.add(5, 3);
        int difference = calculator.subtract(5, 3);
        int product = calculator.multiply(5, 3);
        int quotient = 0;

        try {
            quotient = calculator.divide(6, 3);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Output the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
