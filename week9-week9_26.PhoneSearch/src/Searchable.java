import java.util.Set;

public interface Searchable {
    void addEntry(String name, String entry);
    Set<String> findEntry(String name);
    void removeEntry(String name);
}
