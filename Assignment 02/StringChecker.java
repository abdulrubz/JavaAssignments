import java.util.HashSet;

public class StringChecker {

    public boolean doAllAlphabetExist (String inputString) {
        HashSet<Character> stringLetters = new HashSet<Character>();
        for (int i=0; i<inputString.length(); i++) {
            char currentCharacter = inputString.charAt(i);
            if(Character.isAlphabetic(currentCharacter)) {
                stringLetters.add(currentCharacter);
            }
        }
        return stringLetters.size() == 26;
    }

    public void testDoAllAlphabetExist() {
        String str1 = "abcdefghijklmnopqrstuvwxyz";
        String str2 = "sahsajdhskjhiuyw";

        System.out.println(doAllAlphabetExist(str1)); // Returns true
        System.out.println(doAllAlphabetExist(str2)); // Returns false
    }
}
