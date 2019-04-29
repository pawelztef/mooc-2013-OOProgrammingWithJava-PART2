import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Printer {
    private ArrayList<String> lines;

    public Printer(String file) throws Exception {
        Scanner reader = new Scanner(new File(file));
        lines = new ArrayList<String>();
        while(reader.hasNextLine()) {
            lines.add(reader.nextLine());
        }
        reader.close();
    }

    public void printLinesWhichContain(String word) {
        for(String line : this.lines) {
            if(word.isEmpty() || line.contains(word)){
                System.out.println(line);
            }
        }
    }
}
