import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String ingilizce =null;
        String turkce=null;
        boolean dongu = true;
        Quiz kelime = new Quiz(ingilizce,turkce);

      while(dongu){
          System.out.println("İngilizce/Türkçe kelimeleri sırasıyla giriniz..");
          Scanner scan = new Scanner(System.in);
          ingilizce= scan.next();
          if(ingilizce.equals("q") || ingilizce.equals("Q")){
              dongu = false;
              break;
          }
          turkce= scan.next();
          if( turkce.equals("q") ||  turkce.equals("Q") ){
              dongu = false;
              break;
          }

          kelime.kelimeler.put(ingilizce,turkce);


      }



        //System.out.println("**** QUIZ ****");
        System.out.println(kelime.startQuiz()+" : ");


    }
}