import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class GeneratorTest {
    private final Password password = new Password("Secret");
    private final Alphabate firsAlphabate = new Alphabate(true, false, false, false);
    private final Alphabate secondAlphabate = new Alphabate(false, true, true, true);
    private final Generator generator = new Generator(true, false, false, false);

    @Test
    void test1() {
        assertEquals("Secret", password.toString);

    }

    @Test
    void test2() {
        assertEquals(firsAlphabate.getAlphabate(), Alphabate.UPPERCASE_LETTERS);
    }

    @Test
    void test3() {
        assertEquals(secondAlphabate.getAlphabate(),
                Alphabate.LOWERCASE_LETTERS + Alphabate.NUMBERS + Alphabate.SYMBOLS);
    }

    @Test
    void test4() {
        assertEquals(generator.alphabate.getAlphabate(), Alphabate.UPPERCASE_LETTERS);
    }

    @Test
    void test5() {
        assertEquals(generator.alphabate.getAlphabate().length(), 26);
    }

}
