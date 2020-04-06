import edu.duke.*;

import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class WordInFiles {
    private HashMap<String, ArrayList<String>> wordMap;

    public WordInFiles() {
        wordMap = new HashMap<String, ArrayList<String>>();
    }

    private void addWordsFromFile(File f) {
        FileResource fr = new FileResource(f);
        for (String word : fr.words()) {
            if(!wordMap.containsKey(word)) {
                ArrayList<String> fileList = new ArrayList<String>();
                fileList.add(f.getName());
                wordMap.put(word, fileList);
            } else if(wordMap.containsKey(word) && (!(wordMap.get(word).contains(f.getName())))) {
                ArrayList<String> currentList = wordMap.get(word);
                currentList.add(f.getName());
                wordMap.put(word, currentList);
            }
        }
    }

    public void buildWordFileMap() {
        wordMap.clear();
        DirectoryResource dr = new DirectoryResource();
        for (File file : dr.selectedFiles()) {
            addWordsFromFile(file);
        }
    }

    private int maxNumber() {
        int max = 0;
        for (String word : wordMap.keySet()) {
            ArrayList<String> currentList = wordMap.get(word);
            int currentSize = currentList.size();
            if (currentSize > max) {
                max = currentSize;
            }
        }
        return max;
    }

    private ArrayList<String> wordsInNumFiles(int number) {
        ArrayList<String> listOfWords = new ArrayList<String>();
        for (String word : wordMap.keySet()) {
            ArrayList<String> currentWords = wordMap.get(word);
            int currentSize = listOfWords.size();
            if(currentSize == number) {
                listOfWords.add(word);
            }
        }
        return listOfWords;
    }

    private void printFilesIn(String word) {
        ArrayList<String> fileList = wordMap.get(word);
        for(String w : fileList) {
            System.out.println(w);
        }
    }
}
