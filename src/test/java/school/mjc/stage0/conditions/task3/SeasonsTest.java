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

class SeasonsTest extends BaseIOTest {

    @Test
    void tellTheSeasonByMonthNumberPrintsSpringWhen4or5or3() {
        Seasons seasonDeterminer = new Seasons();

        seasonDeterminer.tellTheSeasonByMonthNumber(5);

        assertEquals("Spring\n", updateLineSpliterators(outContent.toString()));
    }

    @Test
    void tellTheSeasonByMonthNumberPrintsSummerWhen6or7or8() {
        Seasons seasonDeterminer = new Seasons();

        seasonDeterminer.tellTheSeasonByMonthNumber(6);

        assertEquals("Summer\n", updateLineSpliterators(outContent.toString()));
    }

    @Test
    void tellTheSeasonByMonthNumberPrintsPrintsWinterWhen1or12or2() {
        Seasons seasonDeterminer = new Seasons();

        seasonDeterminer.tellTheSeasonByMonthNumber(1);

        assertEquals("Winter\n", updateLineSpliterators(outContent.toString()));
    }

    @Test
    void tellTheSeasonByMonthNumberPrintsWrongWhenNumberIsWrong() {
        Seasons seasonDeterminer = new Seasons();

        seasonDeterminer.tellTheSeasonByMonthNumber(-1);

        assertEquals("wrong number!\n", updateLineSpliterators(outContent.toString()));
    }

    @Test
    void notContainsSwitch() throws IOException {
        Path path = Paths.get("src/main/java/school/mjc/stage0/conditions/task3/Seasons.java");
        List<String> strings = Files.readAllLines(path);
        List<String> result = strings.stream()
                .filter(line -> line.contains("switch"))
                .collect(Collectors.toList());

        assertEquals(0, result.size());
    }
}
