import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileWordDao implements WordDao {

    public void add( Word word){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("words.txt"));
            String line = word.ingKelime+"-"+word.turkceKelime;
            writer.write(line);
            System.out.println(line);
            System.out.println("Kelimeler dosyaya eklendi...");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
