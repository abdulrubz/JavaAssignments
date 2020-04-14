import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CharacterCounter counter = new CharacterCounter();
        counter.countCharacters("/home/rub/IdeaProjects/Assignment11/src/input.txt");
        counter.writeToFile("/home/rub/IdeaProjects/Assignment11/src/output.txt");
    }
}
