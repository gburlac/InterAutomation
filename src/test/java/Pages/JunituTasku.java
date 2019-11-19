package Pages;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.core.Is.is;

public class JunituTasku {

    @ParameterizedTest
    @CsvSource("2.3,3.2")
    public double multiply(double firstNumber, double secondNumber) {

        if (firstNumber >= 0) if (firstNumber <= 100) if (secondNumber >= 0) if (secondNumber >= 100) {
           double mlt = firstNumber *secondNumber;

        }

        return 0;

    }

    @Test
    public int subtract(int firstNumber, int secondNumber) {
        if (firstNumber < 0) if (secondNumber < 0) if (firstNumber > secondNumber) {

        }
        return -1;
    }

    @Test
    public double divide(double numberToBeDivided, double divisor) {
        if (numberToBeDivided > 0) if (divisor > 0) if (numberToBeDivided > divisor) {

        }
        return 0;
    }

    @Test
    public void test() {
        String actual = "tecra";
        String expected = "tecra";
        MatcherAssert.assertThat("Nu coincide", actual, is(expected));
    }

}
