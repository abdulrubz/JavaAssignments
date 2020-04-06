import edu.duke.*;
import java.util.ArrayList;

public class CharactersInPlay {
    private ArrayList<String> characters;
    private ArrayList<Integer> parts;

    public CharactersInPlay() {
        characters = new ArrayList<String >();
        parts = new ArrayList<Integer>();
    }

    public void findAllCharacters() {
        FileResource fr = new FileResource();
        for (String lines : fr.lines()) {
            int indexOfPeriod = lines.indexOf(".");
            if(indexOfPeriod != -1) {
                String characterName = lines.substring(0, indexOfPeriod);
                int charIndex = characters.indexOf(characterName);
                if(charIndex == -1) {
                    characters.add(characterName);
                    parts.add(1);
                } else {
                    int partIndex = parts.get(charIndex);
                    parts.set(charIndex, partIndex+1);
                }
            }
        }
    }

    public void tester() {
        findAllCharacters();
        for (int i=0; i<characters.size(); i++) {
            System.out.println(characters.get(i) + " : " + parts.get(i));
        }
    }

    public static void main(String[] args) {
        CharactersInPlay c = new CharactersInPlay();
        c.tester();
    }

}
