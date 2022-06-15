package school.mjc.stage0.conditions.task3;

import school.mjc.stage0.base.BaseIOTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DividerTest extends BaseIOTest {

    @Test
    void isDividableBy5And11WhenDividable() {
        Divider divider = new Divider();

        divider.isDividableBy5And11(55);

        assertEquals("Dividable\n", updateLineSpliterators(outContent.toString()));
    }

    @Test
    void isDividableBy5And11WhenNotDividable() {
        Divider divider = new Divider();

        divider.isDividableBy5And11(67);

        assertEquals("Non-dividable\n", updateLineSpliterators(outContent.toString()));
    }

    @Test
    void isDividableBy5And11WhenZero() {
        Divider divider = new Divider();

        divider.isDividableBy5And11(0);

        assertEquals("cannot divide by zero\n", updateLineSpliterators(outContent.toString()));
    }
}