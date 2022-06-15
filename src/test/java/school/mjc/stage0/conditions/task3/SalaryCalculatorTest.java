package school.mjc.stage0.conditions.task3;

import school.mjc.stage0.base.BaseIOTest;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class SalaryCalculatorTest extends BaseIOTest {
    @Test
    public void calculateSalaryLess10_000() {
        SalaryCalculator calculator = new SalaryCalculator();

        calculator.calculateSalary(5000);

        assertEquals("4250.0\n", updateLineSpliterators(outContent.toString()));
    }

    @Test
    public void calculateSalaryLess20_000() {
        SalaryCalculator calculator = new SalaryCalculator();

        calculator.calculateSalary(15000);

        assertEquals("12300.0\n", updateLineSpliterators(outContent.toString()));
    }

    @Test
    public void calculateSalaryMore20_000() {
        SalaryCalculator calculator = new SalaryCalculator();

        calculator.calculateSalary(35000);

        assertEquals("28000.0\n", updateLineSpliterators(outContent.toString()));
    }

    @Test
    public void calculateSalaryNegative() {
        SalaryCalculator calculator = new SalaryCalculator();

        calculator.calculateSalary(-1);

        assertEquals("wrong input!\n", updateLineSpliterators(outContent.toString()));
    }


    @Test
    void notContainsImports() throws IOException {
        Path path = Paths.get("src/main/java/school/mjc/stage0/conditions/task3/SalaryCalculator.java");
        List<String> strings = Files.readAllLines(path);
        List<String> result = strings.stream()
                .filter(line -> line.contains("import"))
                .collect(Collectors.toList());

        assertEquals(0, result.size());
    }
}