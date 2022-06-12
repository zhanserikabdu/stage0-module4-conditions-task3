package school.mjc.stage0.conditions.task3;

import school.mjc.stage0.base.BaseIOTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlphabeticCharactersTest extends BaseIOTest {

    @Test
    void vowelDeterminerPrintVowelWhenVowel() {
        AlphabeticCharacters characters = new AlphabeticCharacters();

        characters.vowelDeterminer('o');

        assertEquals("Vowel\n", updateLineSpliterators(outContent.toString()));
    }

    @Test
    void vowelDeterminerPrintConsonantWhenConsonant() {
        AlphabeticCharacters characters = new AlphabeticCharacters();

        characters.vowelDeterminer('B');

        assertEquals("Consonant\n", updateLineSpliterators(outContent.toString()));
    }

    @Test
    void vowelDeterminerPrintWrongWhenNotEnglish() {
        AlphabeticCharacters characters = new AlphabeticCharacters();

        characters.vowelDeterminer('ł');

        assertEquals("wrong alphabet!\n", updateLineSpliterators(outContent.toString()));
    }
}