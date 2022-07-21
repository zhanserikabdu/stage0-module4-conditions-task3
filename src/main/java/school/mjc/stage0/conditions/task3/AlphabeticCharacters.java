package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
    if(character == 'a' || character == 'e' || character == 'i'|| character == 'o' || character == 'u'){
        System.out.println("Vowel");
    }else if(character >= 'b' || character <= 'd' && character >= 'f' || character <= 'h' &&
            character >= 'j' || character <= 'n'
            && character >= 'p' || character <= 't' && character >= 'v' || character <= 'z' ){
        System.out.println("Consonant");
    }else{
        System.out.println("wrong alphabet!");
    }
    }
}
