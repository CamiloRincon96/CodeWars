package GetTheMiddleCharacter;

public class Kata {
    public static String getMiddle(String word) {

        if(word.length() > 1) {
            String odd = String.valueOf(word.charAt(word.length() / 2));
            String even = word.substring(word.length() / 2 - 1, word.length() / 2 + 1);
            return word.length()%2 == 0 ? even : odd;}

        else return word;
        }
    }

