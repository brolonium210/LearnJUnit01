import java.io.IOException;

public class Calculator {

    // Adds two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Subtracts second number from first number
    public int subtract(int a, int b) throws ArithmeticException,NullPointerException, IOException
    {
        return a - b;
    }

    // Multiplies two numbers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Divides first number by second number (throws an exception if division by zero)
    public int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    // Returns the absolute value of a number
    public int absolute(int a) {
        try{
            return a < 0 ? -a : a;
            }catch(NumberFormatException e){
            return -1;
        }
    }

    // Returns the maximum of two numbers
    public int max(int a, int b) {
        return a > b ? a : b;
    }

    // Returns the minimum of two numbers
    public int min(int a, int b) {
        return a < b ? a : b;
    }
}
