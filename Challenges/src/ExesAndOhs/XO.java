package ExesAndOhs;

public class XO {
    public static boolean getXO (String str) {
        int xs = 0;
        int os = 0;
        String strM = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (strM.charAt(i) == 'o'){
                os++;
            }else if (strM.charAt(i)== 'x'){
                xs++;
            }
        }
        return xs == os;
    }
}
