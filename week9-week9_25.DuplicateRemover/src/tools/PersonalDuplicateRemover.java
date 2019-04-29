package tools;

import java.util.HashSet;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover{
    private int duplicates;
    private Set<String> entires;

    public PersonalDuplicateRemover() {
       duplicates = 0;
       entires = new HashSet<String>();
    }

    @Override
    public void add(String characterString) {
        if (!entires.add(characterString)) duplicates++;
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return duplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return entires;
    }

    @Override
    public void empty() {
        entires.clear();
        duplicates = 0;
    }
}
