
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    public List<String> read(String file) throws FileNotFoundException{
        List<String> list = new ArrayList<String>();
        Scanner reader = new Scanner(new File(file));
        
        while(reader.hasNextLine()){
            list.add(reader.nextLine());
        }
        return list;
    }

    public void save(String file, String text) throws IOException {
        FileWriter fw = new FileWriter(file);
        fw.write(text);
        fw.close();
    }

    public void save(String file, List<String> texts) throws IOException {
        FileWriter fw = new FileWriter(file);
        for (String str : texts){
            fw.write(str + "\n");
        }
        fw.close();
    }

}
