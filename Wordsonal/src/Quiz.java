import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Quiz {
    private String ingKelime;
    private String turkceKelime;
    private int quizIndex = 0;
    Random r = new Random();
    Map<String,String> kelimeler = new HashMap<String,String>();

    public Quiz(String ingKelime,String turkceKelime){
        this.ingKelime=ingKelime;
        this.turkceKelime=turkceKelime;
        kelimeler.put(this.ingKelime,this.turkceKelime);
    }
    public String startQuiz( ) {
        int i = 0;
        setQuizIndex();
        String kelime = null;
        for (String key : kelimeler.keySet()) {
            if (i == getQuizIndex()) {
                kelime = key;

            } else {
                i++;
            }
        }
        return kelime;

    }


    public int getQuizIndex() {
        return quizIndex;
    }

    public void setQuizIndex() {
        this.quizIndex = r.nextInt(kelimeler.size() + 1);
        System.out.println("random index" + quizIndex);

    }


}