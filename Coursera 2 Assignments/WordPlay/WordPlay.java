import edu.duke.*;

public class WordPlay {
    public boolean isVowel(char ch) {
        String vowels = "aeiou";
        char lowerCh = Character.toLowerCase(ch);
        return vowels.indexOf(lowerCh) != -1;
    }

    public String replaceVowels(String phrase, char ch) {
        StringBuilder newPhrase = new StringBuilder(phrase);
        for (int i=0; i<newPhrase.length(); i++) {
            char currentCharacter = newPhrase.charAt(i);
            if(isVowel(currentCharacter)) {
                newPhrase.setCharAt(i, ch);
            }
        }
        return newPhrase.toString();
    }

    public String emphasize(String phrase, char ch) {
        StringBuilder emphasizedPhrase = new StringBuilder(phrase);
        for (int i=0; i<emphasizedPhrase.length(); i++) {
            if(emphasizedPhrase.charAt(i) == ch || emphasizedPhrase.charAt(i) == Character.toUpperCase(ch)) {
                if(i % 2 == 0) {
                    emphasizedPhrase.setCharAt(i, '*');
                } else {
                    emphasizedPhrase.setCharAt(i, '+');
                }
            }
        }
        return emphasizedPhrase.toString();
    }

    public void testEmphasize() {
        String phrase = "Mary Bella Abracadabra";
        System.out.println(emphasize(phrase, 'a'));
    }

    public void testReplaceVowels() {
        String phrase = "Hello world";
        System.out.println(replaceVowels(phrase, '*'));
    }

    public static void main(String[] args) {
        WordPlay w = new WordPlay();
        //w.testReplaceVowels();
        w.testEmphasize();
    }
}
