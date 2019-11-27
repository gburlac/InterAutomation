package junittask;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestJunit {
    JunituTasku calc = new JunituTasku();


    @Test
    @DisplayName("Divide test positiv")
    void divide() {
        assertEquals(2, calc.divide(4, 2));

    }

    @Test
    @DisplayName("Substract test positiv")
    void substract() {
        assertEquals(6, calc.subtract(8, 2));

    }


    @DisplayName("Substract parametrized test negativ")
    @ParameterizedTest(name = "{index} -> firstNumer={0}, secondNumber={1}")
    @CsvSource({"2,5", "6,-8", "9,-7"})
    void substractTest(int a, int b) {
        int expected = -1;
        int actual = calc.subtract(a, b);
        MatcherAssert.assertThat("Assert results: ", actual, is(expected));
    }


    @DisplayName("Multiply parametrized test positive")
    @ParameterizedTest(name = "{index} -> firstNumer={0}, secondNumber={1}")
    @MethodSource("source")
    void multiplyTest(int a, int b) {
        double expected = a * b;
        double actual = calc.multiply(a, b);
        MatcherAssert.assertThat("Asserting results: ", actual, is(expected));
    }

    private static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of(88, 2),
                Arguments.of(22, 2)
        );
    }

    @DisplayName("Divide parametrized test positiv")
    @ParameterizedTest(name = "{index} -> firstNumer={0}, secondNumber={1}")
    @CsvSource({"9,3", "80,4", "60,3"})
    void divideTest(int a, int b) {
        double expected = a / b;
        double actual = calc.divide(a, b);
        MatcherAssert.assertThat("Assert results: ", actual, is(expected));
    }

    @DisplayName("Assert Throw example")
    @Test
    void assrtTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Integer.parseInt("one");
        });
    }

    @Test
    void assThrowexamlpe() {
        assertThrows(NullPointerException.class, () -> {
            calc.divide(11, 0);
        });
    }

}
