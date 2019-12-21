
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {
    private Scanner sc;
    
    public List<String> read(String file) throws FileNotFoundException {
        ArrayList<String> lines = new ArrayList<String>();
        File f = new File(file);
        sc = new Scanner(f);
        
        while(sc.hasNextLine()){
            lines.add(sc.nextLine());
        }
        return lines;
    }

    public void save(String file, String text) throws IOException {
        FileWriter f = new FileWriter(file);
        f.write(text);
        f.close();
    }

    public void save(String file, List<String> texts) throws IOException {
        FileWriter fw = new FileWriter(file);
        for(String s:texts){
            fw.write(s+"\n");
        }
        fw.close();
    }
}
