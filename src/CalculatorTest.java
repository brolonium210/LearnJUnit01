import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    void add() {
        //basic test
        int result = calculator.add(1, 2);
        Assertions.assertEquals(3, result);
        //test one negative number
        result = calculator.add(-1, 2);
        Assertions.assertEquals(1, result);
        //test two negative numbers
        result = calculator.add(-1, -2);
        Assertions.assertEquals(-3, result);
        //test big numbers
        result = calculator.add(10000, 20000);
        Assertions.assertEquals(30000, result);
    }

    @Test
    void subtract() throws IOException {
        int result = calculator.subtract(1, 2);
        Assertions.assertEquals(-1, result);
        result = calculator.subtract(-1, 2);
        Assertions.assertEquals(-3, result);
        result = calculator.subtract(-1, 2);
        Assertions.assertNotNull(result);
    }

    @Test
    void multiply() {
    }

    @Test
    void divide() {
    }

    @Test
    void absolute() {
        int result = calculator.absolute(10);
        Assertions.assertEquals(10, result);
        result = calculator.absolute(-10);
        Assertions.assertEquals(10, result);
//        result = calculator.absolute("abc");
        Assertions.assertEquals(-1, result);
//        Assertions.assertThrows(IOException.class, () -> calculator.absolute('b'));
    }

    @Test
    void max() {
    }

    @Test
    void min() {
    }
}