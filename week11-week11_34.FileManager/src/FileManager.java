
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    public List<String> read(String file) throws FileNotFoundException {
        List<String> list = new ArrayList<String>();
        File rFile = new File(file);
        Scanner reader = new Scanner(rFile);
        while(reader.hasNextLine()) {
            list.add(reader.nextLine());
        }
        return list;
    }

    public void save(String file, String text) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(text);
        fileWriter.close();
    }

    public void save(String file, List<String> texts) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        for(String line : texts) {
            fileWriter.append(line + '\n');
        }
        fileWriter.close();
    }
}
