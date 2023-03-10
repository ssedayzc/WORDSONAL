import java.util.HashMap;
import java.util.Map;

public class Kelimeler {
    private String ingKelime;
    private String turkceKelime;
    Map<String,String> kelimeler = new HashMap<String,String>();

    public Kelimeler(String ingKelime,String turkceKelime){
        this.ingKelime=ingKelime;
        this.turkceKelime=turkceKelime;
        kelimeler.put(ingKelime,turkceKelime);
    }

    public String quiz(int index){
        int i = 1;
        String kelime=null;
        for(String key : kelimeler.keySet()){
            if(i== index){
                kelime = kelimeler.get(key);
                break;
            }else{
                i++;
            }
        }
        return kelime;

    }






}
