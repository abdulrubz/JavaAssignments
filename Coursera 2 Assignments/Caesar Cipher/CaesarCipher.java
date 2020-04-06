import edu.duke.*;

public class CaesarCipher {
    public String encrypt(String input, int key) {

        StringBuilder encrypted = new StringBuilder(input);
        String alphabetUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabetLower = "abcdefghijklmnopqrstuvwxyz";
        String shiftedAlphabetUpper = alphabetUpper.substring(key)+
                alphabetUpper.substring(0,key);
        String shiftedAlphabetLower = alphabetLower.substring(key)+
                alphabetLower.substring(0,key);

        for(int i = 0; i < encrypted.length(); i++) {

            char currentCharacter = encrypted.charAt(i);

            if(alphabetUpper.indexOf(currentCharacter) != -1){
                int index = alphabetUpper.indexOf(currentCharacter);
                char newCharacter = shiftedAlphabetUpper.charAt(index);
                encrypted.setCharAt(i, newCharacter);
            }

            if (alphabetLower.indexOf(currentCharacter) != -1){
                int index = alphabetLower.indexOf(currentCharacter);
                char newCharacter = shiftedAlphabetLower.charAt(index);
                encrypted.setCharAt(i, newCharacter);
            }
        }
        return encrypted.toString();
    }

    public String encryptTwoKeys(String input, int key1, int key2) {

        StringBuilder encrypted = new StringBuilder(input);
        String alphabetUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabetLower = "abcdefghijklmnopqrstuvwxyz";

        String shidtedAlphabetUpperA = alphabetUpper.substring(key1)+
                alphabetUpper.substring(0,key1);
        String shiftedAlphabetUpperB = alphabetUpper.substring(key2)+
                alphabetUpper.substring(0,key2);
        String shiftedAlphabetLowerA = alphabetLower.substring(key1)+
                alphabetLower.substring(0,key1);
        String shiftedAlphabetLowerB = alphabetLower.substring(key2)+
                alphabetLower.substring(0,key2);

        for(int i = 0; i < encrypted.length(); i++) {
            char currentCharacter = encrypted.charAt(i);
            if (i % 2 == 0) {
                if (alphabetUpper.indexOf(currentCharacter) != -1) {
                    int index = alphabetUpper.indexOf(currentCharacter);
                    char newCharacter = shidtedAlphabetUpperA.charAt(index);
                    encrypted.setCharAt(i, newCharacter);
                }

                if (alphabetLower.indexOf(currentCharacter) != -1) {
                    int index = alphabetLower.indexOf(currentCharacter);
                    char newCharacter = shiftedAlphabetLowerA.charAt(index);
                    encrypted.setCharAt(i, newCharacter);
                }
            } else {
                if (alphabetUpper.indexOf(currentCharacter) != -1) {
                    int index = alphabetUpper.indexOf(currentCharacter);
                    char newCharacter = shiftedAlphabetUpperB.charAt(index);
                    encrypted.setCharAt(i, newCharacter);
                }

                if (alphabetLower.indexOf(currentCharacter) != -1) {
                    int index = alphabetLower.indexOf(currentCharacter);
                    char newCharacter = shiftedAlphabetLowerB.charAt(index);
                    encrypted.setCharAt(i, newCharacter);
                }
            }
        }
        return encrypted.toString();
    }

    public void testCaesar() {
        System.out.println(encrypt("First Legion", 17));
        System.out.println(encryptTwoKeys("First Legion", 23, 17));
    }

    public static void main(String[] args) {
        CaesarCipher c = new CaesarCipher();
        c.testCaesar();
    }
}