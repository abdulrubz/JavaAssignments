import edu.duke.*;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class WordFrequencies {
    private ArrayList<String> myWords;
    private ArrayList<Integer>myFreqs;

    public WordFrequencies() {
        myWords = new ArrayList<String>();
        myFreqs = new ArrayList<Integer>();
    }

    public void findUnique() {
        FileResource fr = new FileResource();
        for(String s : fr.words()) {
            s = s.toLowerCase();
            int index = myWords.indexOf(s);
            if (index == -1) {
                myWords.add(s);
                myFreqs.add(1);
            } else {
                int value = myFreqs.get(index);
                myFreqs.set(index, value+1);
            }
        }
    }

    public int findIndexOfMax() {
        int maxValue=0;
        int maxIndex = 0;
        for (int i=0; i<myFreqs.size(); i++) {
            if(myFreqs.get(i) > maxValue) {
                maxValue = myFreqs.get(i);
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public void testing() {
        findUnique();
        System.out.println("Number of words is "+myWords.size());
        for (int i=0; i<myWords.size(); i++) {
            System.out.println(i+" : "+myWords.get(i) + " : " + myFreqs.get(i) );
        }
        System.out.println("Maximum index is "+findIndexOfMax());
    }

    public static void main(String[] args) {
        WordFrequencies w = new WordFrequencies();
        w.testing();
    }
}
