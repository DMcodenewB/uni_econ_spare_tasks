import java.util.ArrayList;

public class ForbiddenWords {

    private ArrayList<String> words;

    public ArrayList<String> getWords() {
        return words;
    }

    ForbiddenWords(){
        String[] bad_words = {"zagrożenie","terrorysta","bomba","sejm","zabiję","zamorduję","morderstwo","nóż","lotnisko","łapówka","napad"};
        this.words = new ArrayList<>();
        for(String s : bad_words){
            words.add(s);
        }
    }
}
