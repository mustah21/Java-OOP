package java6_1.Controller;


import java6_1.Model.Dictionary;
import java6_1.View.DictionaryView;

public class DictionaryController {

    private Dictionary dictionary;
    private DictionaryView view;

    public DictionaryController(DictionaryView gui, Dictionary dictionary) {
        this.view = gui;
        this.dictionary = dictionary;
    }

    public void handleAdd(String word, String meaning) {
        boolean added = dictionary.addWord(word, meaning);
        if (added) {
            view.showMessage(word + " added!");
        } else {
            view.showMessage(word + " already exists in the dictionary!");
        }
    }
    public void handleSearch(String word) {
        String result = dictionary.searchWord(word);
        if (result == null || result.isEmpty()) {
            view.showMessage("Please type the correct word!");
        } else {
            view.updateResult("Word: " + word + "    meaning: " + result);
        }
    }
}
