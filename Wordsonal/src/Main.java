import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String ingilizce =null;
        String turkce=null;
        boolean dongu = true;


        while(dongu){
            System.out.println("İngilizce/Türkçe kelimeleri sırasıyla giriniz..");
            Scanner scan = new Scanner(System.in);
            ingilizce= scan.next();
            String temp = ingilizce;
            if(ingilizce.equals("q") || ingilizce.equals("Q")){
                ingilizce=temp;
                dongu = false;
                break;
            }
            turkce= scan.next();
            temp = turkce;
            if( turkce.equals("q") ||  turkce.equals("Q") ){
                turkce=temp;
                dongu = false;
                break;
            }

        }

        Word kelime = new Word(ingilizce,turkce);
        WordManager manager = new WordManager(new FileWordDao());
        manager.addWord(kelime);




        // System.out.println(kelime.startQuiz()+" : ");


    }
}