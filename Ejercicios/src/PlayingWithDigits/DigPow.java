package PlayingWithDigits;

import java.util.LinkedList;

public class DigPow {
    public static long digPow(int n, int p) {
        int count = 0;
        int n2 = n;
        LinkedList<Integer> stack = new LinkedList<>();
        while (n2 > 0) {
            stack.push(n2 % 10);
            n2 = n2 / 10;
        }

        for (Integer i : stack) {
            count += Math.pow(i, p);
            p++;
        }

        double k = (double)count / n;

        return (k > 0 && k%1 == 0) ? (long)k : -1;

    }
}
