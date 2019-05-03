package dictionary;

import javax.sound.midi.MidiChannel;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MindfulDictionary {
    private Map<String, String> dict;
    private String filePath;
    private File file;

    public MindfulDictionary() {
        this.dict = new HashMap<String, String>();
    }

    public MindfulDictionary(String file) {
       this();
       this.filePath = file;
    }

    public void add(String word, String translation) {
        if(!(dict.containsKey(translation) || dict.containsValue(translation) ||
        dict.containsKey(word) || dict.containsValue(word))) {
            this.dict.put(word, translation);
        }
    }

    public String translate(String word) {
        String translated = null;
        for (Map.Entry entry : dict.entrySet()) {
            if (entry.getKey().equals(word)) {
                translated = (String) entry.getValue();
            } else if (entry.getValue().equals(word)) {
                translated = (String) entry.getKey();
            }
        }
        return translated;
    }

    public void remove(String word) {
        String keyToRemove = null;
        for(Map.Entry entry : dict.entrySet()) {
            if(entry.getValue().equals(word) || entry.getKey().equals(word)) {
              keyToRemove = (String)entry.getKey();
            }
        }
        if(keyToRemove != null) {
            dict.remove(keyToRemove);
        }
    }

    public boolean load() {
        Scanner reader;
        String[] words;
        String line;
        try {
            file = new File(filePath);
            reader = new Scanner(file);
            while(reader.hasNextLine()) {
                line = reader.nextLine();
                words = line.split(":");
                add(words[0], words[1]);
            }
            reader.close();
        } catch ( Exception ex) {
            return false;
        }
        return true;
    }

    public boolean save() {
        FileWriter writer;
        String line = "";
        try {
            writer = new FileWriter(filePath);
            for(Map.Entry entry : dict.entrySet()) {
               line += (String)entry.getKey() + ":" + (String)entry.getValue() + "\n";
            }
            writer.write(line);
            writer.close();
        } catch (Exception ex) {
            return false;
        }
        return true;
    }
}
