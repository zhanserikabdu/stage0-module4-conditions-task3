package school.mjc.stage0.conditions.task3;

import school.mjc.stage0.base.BaseIOTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsEnglishSymbolDeterminerTest extends BaseIOTest {

    @Test
    void isEnglishSymbolPrintsTrueWhenLowercaseEngSymbol() {
        IsEnglishSymbolDeterminer englishDeterminer = new IsEnglishSymbolDeterminer();

        englishDeterminer.isEnglishSymbol('r');

        assertEquals("English\n", updateLineSpliterators(outContent.toString()));
    }

    @Test
    void isEnglishSymbolPrintsTrueWhenUppercaseEngSymbol() {
        IsEnglishSymbolDeterminer englishDeterminer = new IsEnglishSymbolDeterminer();

        englishDeterminer.isEnglishSymbol('R');

        assertEquals("English\n", updateLineSpliterators(outContent.toString()));
    }

    @Test
    void isEnglishSymbolPrintsFalseWhenUppercasePolishSymbol() {
        IsEnglishSymbolDeterminer englishDeterminer = new IsEnglishSymbolDeterminer();

        englishDeterminer.isEnglishSymbol('Ł');

        assertEquals("Non English\n", updateLineSpliterators(outContent.toString()));
    }

    @Test
    void isEnglishSymbolPrintsFalseWhenLowercasePolishSymbol() {
        IsEnglishSymbolDeterminer englishDeterminer = new IsEnglishSymbolDeterminer();

        englishDeterminer.isEnglishSymbol('ł');

        assertEquals("Non English\n", updateLineSpliterators(outContent.toString()));
    }
}
