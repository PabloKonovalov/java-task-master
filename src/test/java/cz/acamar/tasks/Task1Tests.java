package cz.acamar.tasks;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1Tests {

    private final Task1 task1 = new Task1();

    @ParameterizedTest
    @MethodSource("stringsAndLastWordLength")
    void test_lastWordLength(String str, int lastWordLength) {
        assertEquals(lastWordLength, task1.lengthOfLastWord(str));
    }

    private static Stream<Arguments> stringsAndLastWordLength() {
        return Stream.of(
                Arguments.of("Hello world", 5),
                Arguments.of("   fly me   to   the moon  ", 4),
                //FIXME max value is 11 (s(1) h(2) a(3) k(4) e(5) s(6) p(7) e(8) a(9) r(10) e(11))
                Arguments.of("William Shakespeare was an English   playwright", 11)
        );
    }
}
