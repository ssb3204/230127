import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int[] num_list) {
        int rev[] = new int [num_list.length];
        for(int i=0;i<=num_list.length-1;i++){
            rev[i]=num_list[num_list.length-i-1];
        }
        
        return rev;
    }
}