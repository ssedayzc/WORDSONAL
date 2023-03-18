public class WordManager {

    private WordDao wordDao;
    public WordManager(WordDao wordDao) { //loose adherence

        this.wordDao = wordDao;
    }


    public void addWord(Word word) throws Exception {
        if(word.getMap(word)){
            throw new Exception("Kelime zaten eklendi");
        }
        else{
            WordDao wordDao = new FileWordDao();
            wordDao.add(word);
        }
    }
}
