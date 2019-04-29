import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook implements Searchable {
    private Map<String, Set<String>> entries;

    public PhoneBook() {
        entries = new HashMap<String, Set<String>>();
    }

    public String findEntryByPerson(String number) {
        for(Map.Entry<String, Set<String>> entry : entries.entrySet()) {
            if(entry.getValue().contains(number)) {
                return entry.getKey();
            }
        }
        return null;
    }

    @Override
    public void addEntry(String name, String phoneNo) {
            Set<String> st;
        if(entries.containsKey(name)) {
            st = entries.get(name);
            st.add(phoneNo);
        } else {
            st = new HashSet<String>();
            st.add(phoneNo);
            entries.put(name, st);
        }
    }

    @Override
    public Set<String> findEntry(String name) {
        Set<String>finding = entries.get(name);
        return finding;
    }

    @Override
    public void removeEntry(String name) {
        entries.remove(name);
    }
}
