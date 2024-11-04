package org.dcistudent;

public class Math {
    /**
     * Adds two integers together.
     *
     * @param a The first integer to add.
     * @param b The second integer to add.
     * @return The sum of the two integers.
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts one integer from another.
     *
     * @param a The integer to subtract from.
     * @param b The integer to subtract.
     * @return The result of subtracting b from a.
     */
    public static int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers together.
     *
     * @param a The first integer to multiply.
     * @param b The second integer to multiply.
     * @return The product of the two integers.
     */
    public static int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides one integer by another.
     *
     * @param a The integer to divide.
     * @param b The integer to divide by.
     * @return The result of dividing a by b.
     */
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }

        return a / b;
    }
}
