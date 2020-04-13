import java.io.File;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FileSearcher {
    public void searchFiles(String regularExp, String path) {
        try{
            File f = new File(path);
            File[] fileList = f.listFiles();
            if(fileList == null) return;
            for (File file : fileList) {
                if(file.isDirectory()) {
                    searchFiles(regularExp, file.getAbsolutePath());
                } else {
                    String fileName = file.getName();
                    if(Pattern.matches(regularExp, fileName)) {
                        System.out.println(file.getAbsolutePath());
                    }
                }
            }
        } catch (NullPointerException n) {
            n.printStackTrace();

        }
    }

    public void testFileSearcher() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of times");
        int numOfTimes = s.nextInt();
        while(numOfTimes>=0) {
            System.out.println("Enter the regular expression");
            String regularExp = s.nextLine();
            searchFiles(regularExp, "/home/rub");
            numOfTimes--;
        }
    }

    public static void main(String[] args) {
        FileSearcher f = new FileSearcher();
        f.testFileSearcher();
    }
}
