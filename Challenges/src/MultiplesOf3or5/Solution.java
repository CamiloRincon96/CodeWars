package MultiplesOf3or5;

public class Solution {
    public static int solution(int number) {
        int count = 0;

        for (int i = 0; i < number; i++) {
            if(i%3 == 0){
                count += i;
            }else if (i%5 == 0 && i%3 != 0){
                count += i;
            }
        }
        return count;
    }
}
