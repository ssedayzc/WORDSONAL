import java.util.HashMap;
import java.util.Map;

public class Word {

     String ingKelime;
     String turkceKelime;
    Map<String,String> kelimeler = new HashMap<String,String>();

    public Word(String ingKelime, String turkceKelime){
        this.ingKelime = ingKelime;
        this.turkceKelime = turkceKelime;
        addMap(ingKelime,turkceKelime);
    }

    public void addMap(String key, String value ){
        kelimeler.put(key,value);
    }
    public boolean getMap(Word word){
        if(kelimeler.containsKey(word))
            return true;
        else
            return false;

    }
}
