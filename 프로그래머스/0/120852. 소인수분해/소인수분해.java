import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public int[] solution(int n) {  
        int[] num = new int[n];
        int index = 0;
        for (int i=2;i<=n;i++) {
            while (n%i== 0) {
                num[index++] = i;
                n /= i;
            }
        }
        return Arrays.stream(num, 0, index).distinct().toArray();  
    }
}