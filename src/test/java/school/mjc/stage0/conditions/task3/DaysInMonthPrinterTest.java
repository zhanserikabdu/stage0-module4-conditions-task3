package school.mjc.stage0.conditions.task3;

import school.mjc.stage0.base.BaseIOTest;
import org.junit.jupiter.api.Test;

class DaysInMonthPrinterTest extends BaseIOTest {

    @Test
    void amountOfDaysPrintDaysInJune() {
        DaysInMonthPrinter daysPrinter = new DaysInMonthPrinter();

        daysPrinter.amountOfDays(6);

        assertOutEquals("30\n");
    }

    @Test
    void amountOfDaysPrintDaysInFeb() {
        DaysInMonthPrinter daysPrinter = new DaysInMonthPrinter();

        daysPrinter.amountOfDays(2);

        assertOutEquals("28\n");
    }

    @Test
    void amountOfDaysPrintWrong() {
        DaysInMonthPrinter daysPrinter = new DaysInMonthPrinter();

        daysPrinter.amountOfDays(-2);

        assertOutEquals("wrong number!\n");
    }

}