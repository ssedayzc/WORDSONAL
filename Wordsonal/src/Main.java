import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String ingilizce =null;
        String turkce=null;

      while(ingilizce != "q"){
          System.out.println("İngilizce/Türkçe kelimeleri sırasıyla giriniz..");
          Scanner scan = new Scanner(System.in);
          ingilizce= scan.nextLine();
          turkce= scan.nextLine();
          if(ingilizce=="q" || turkce=="q")
              break;
      }

        Kelimeler kelime = new Kelimeler(ingilizce,turkce);

        //System.out.println("**** QUIZ ****");
        System.out.println(kelime.quiz(2)+" : ");


    }
}