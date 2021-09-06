package FindTheOdd;

public class FindOdd {
    public static int findIt(int[] a){
        int xor = 0;
        for (int i = 0; i < a.length; i++) {
            xor ^= a[i];
        }
        return xor;
    }

}
