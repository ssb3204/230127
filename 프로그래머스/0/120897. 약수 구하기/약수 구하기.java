import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int n) {
        HashSet<Integer> answer = new HashSet<>();

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                answer.add(i);
                answer.add(n / i);
            }
        }
        
        ArrayList<Integer> result = new ArrayList<>(answer);
        Collections.sort(result);
        
        int[] arr = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            arr[i] = result.get(i);
        }
        
        return arr;
    }
}
