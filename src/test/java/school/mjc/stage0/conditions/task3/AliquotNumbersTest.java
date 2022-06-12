package school.mjc.stage0.conditions.task3;

import school.mjc.stage0.base.BaseIOTest;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AliquotNumbersTest extends BaseIOTest {
    
    @Test
    void isFirstAliquotPrintsTrueWhenAliquot() {
        AliquotNumbers aliquotNumbers = new AliquotNumbers();

        aliquotNumbers.isFirstAliquot(5, 25);

        assertEquals("Aliquot\n", updateLineSpliterators(outContent.toString()));
    }

    @Test
    void isFirstAliquotPrintsFalseWhenNotAliquot() {
        AliquotNumbers aliquotNumbers = new AliquotNumbers();

        aliquotNumbers.isFirstAliquot(25, 5);

        assertEquals("Not aliquot\n", updateLineSpliterators(outContent.toString()));
    }

    @Test
    void notContainsImports() throws IOException {
        Path path = Paths.get("src/main/java/school/mjc/stage0/conditions/task3/AliquotNumbers.java");
        List<String> strings = Files.readAllLines(path);
        List<String> result = strings.stream()
                .filter(line -> line.contains("import"))
                .collect(Collectors.toList());

        assertEquals(0, result.size());
    }

}