import java.util.ArrayList;

public class DRoot {
    public static int digital_root(int n) {
        ArrayList<Integer> stack = new ArrayList<Integer>();

        do{
            while (n > 0) {
                stack.add(n % 10);
                n = n / 10;
            }
            n = 0;
            for (Integer i : stack) {
                n += i;
            }
            stack.clear();
        } while(n >= 10);
        return n;
    }
}

