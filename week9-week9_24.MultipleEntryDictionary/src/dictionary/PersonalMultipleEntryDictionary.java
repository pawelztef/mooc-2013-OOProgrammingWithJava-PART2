package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
    private Map<String, Set<String>> entires;

    public PersonalMultipleEntryDictionary() {
        this.entires = new HashMap<String, Set<String>>();
    }

    @Override
    public void add(String word, String entry) {
        Set<String> translations = new HashSet<String>();
        if(entires.containsKey(word)) {
            translations = entires.get(word);
            translations.add(entry);
            entires.replace(word, translations);
        } else {
            translations.add(entry);
            entires.put(word, translations);
        }
    }

    @Override
    public Set<String> translate(String word) {
        return entires.get(word);
    }

    @Override
    public void remove(String word) {
        entires.remove(word);
    }
}
