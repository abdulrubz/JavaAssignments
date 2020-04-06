import edu.duke.*;

public class WordLengths {
    public void countWordLengths(FileResource fr, int[] counts) {
        int lastIndex = counts.length - 1;
        for (String word : fr.words()) {
            int wordLength = word.length();
            if(word.isEmpty()) {
                break;
            }
            if(!Character.isLetter(word.charAt(0))) {
                wordLength -= 1;
            }
            if(!Character.isLetter((word.charAt(wordLength - 1)))) {
                wordLength -= 1;
            }
            if (wordLength > lastIndex) {
                counts[lastIndex]++;
            } else {
                counts[wordLength]++;
            }
        }
    }

    public void testCountWordLengths(){
        int[] counts = new int[31];
        FileResource resource = new FileResource();
        countWordLengths(resource,counts);
    }

    public static void main(String[] args) {
        WordLengths w = new WordLengths();
        w.testCountWordLengths();
    }
}
