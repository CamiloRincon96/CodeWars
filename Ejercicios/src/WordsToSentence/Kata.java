package WordsToSentence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kata {
    public static String formatWords(String[] words) {


            if (words == null || words.length == 0)
                return "";
            List<String> clearWords = new ArrayList<>(Arrays.asList(words));
            clearWords.removeIf(String::isEmpty);
            if (clearWords.isEmpty())
                return "";
            if (clearWords.size() == 1)
                return clearWords.get(0);
            String start = String.join(", ", clearWords.subList(0, clearWords.size() - 1));
            return start + " and " + clearWords.get(clearWords.size() - 1);
    }
}
