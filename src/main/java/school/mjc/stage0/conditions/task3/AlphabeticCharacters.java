package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
            System.out.println("Vowel");
        } else if (character >= 'b' && 'd' <= character || character >= 'f' && 'h' <= character ||
                character >= 'j' && 'n' <= character || character >= 'p' && 't' <= character ||
                character >= 'v' && 'z' <= character) {
            System.out.println("Consonant");
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}
