package helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// >>>> Mockito test available at >>>>  "src/test/java/mokito/business/TodoBusinessImplMockTest.java"

public class StringHelperTest {
    private StringHelper helper = new StringHelper();

    @Test
    void test01() {
        assertEquals("BC", helper.truncateAInFirst2Positions("AABC"));
    }

    @Test
    void test02() {
        assertEquals("BC", helper.truncateAInFirst2Positions("BC"));
    }

    @Test
    void test03() {
        assertEquals("BC", helper.truncateAInFirst2Positions("ABC"));
    }

    @Test()
    void test04() {
        assertEquals("BAC", helper.truncateAInFirst2Positions("BAAC"));

    }
}
