package wordinspection;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;

public class WordInspection {
    private List<String> words;

    public WordInspection(File file) {
        this.words = new ArrayList<String>();
        Scanner rd;
        try {
            rd = new Scanner(file);
            while (rd.hasNextLine()) {
                words.add(rd.nextLine());
            }
            rd.close();
        } catch (Exception e) {
            System.out.println("File unreacheable.");
            e.printStackTrace();
        }
    }

    public int wordCount() {
        return this.words.size();
    }

    public List<String> wordsContainingZ() {
        List<String> list = new ArrayList<String>();
        for (String word : this.words) {
            if (word.contains("z")) {
                list.add(word);
            }
        }
        return list;
    }

    public List<String> wordsEndingInL() {
        List<String> list = new ArrayList<String>();
        for (String word : words) {
            if (word.endsWith("l")) {
                list.add(word);
            }
        }
        return list;
    }

    public List<String> palindromes() {
        List<String> list = new ArrayList<String>();
        for (String word : words) {
            if (word.equals(String.valueOf(new StringBuilder(word).reverse()))) {
                list.add(word);
            }
        }
        return list;
    }

    public List<String> wordsWhichContainAllVowels() {
        List<String> list = new ArrayList<String>();
        String vowels[] = {"a", "e", "i", "o", "u", "y", "ä", "ö"};
        int h = 0;
        for (String word : this.words) {
            // all Finnish vowels aeiouyäö
            for (String vowel : vowels) {
                if (word.contains(vowel)) {
                    h++;
                }
            }
            if (h == vowels.length) {
                System.out.println(word);
                list.add(word);
            }
            h = 0;
        }
        return list;
    }
}
