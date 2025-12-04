package java6_1.Model;

import java.util.HashMap;

public class Dictionary {

    private HashMap<String, String> hashDictionary;

    public Dictionary() {
        hashDictionary = new HashMap<>();
    }

    public boolean addWord(String word, String meaning) {
        if (!hashDictionary.containsKey(word)) {
            hashDictionary.put(word, meaning);
            return true;
        }
        return false;
    }

    public String searchWord(String word) {
        return hashDictionary.get(word);
    }
}
