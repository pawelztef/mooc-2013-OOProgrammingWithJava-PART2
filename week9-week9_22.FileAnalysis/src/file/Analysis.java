package file;
import java.io.File;
import java.util.Scanner;

public class Analysis {
    private File file;

    public Analysis(File file){
        this.file = file;
    }

    public int lines() {
        int i = 0;
        try {
            Scanner rd = new Scanner(file);
            while(rd.hasNextLine()) {
                rd.nextLine();
                i++;
            }
            rd.close();
            return i;
        } catch(Exception e) {
            return -1;
        }
    }

    public int characters() {
       int chr = 0;
       try {
           Scanner rd = new Scanner(file);
           while(rd.hasNextLine()) {
              String ln = rd.nextLine();
              chr += ln.length()+1;
           }
       } catch (Exception e ) {
           return -1;
       }
       return chr;

    }

}
