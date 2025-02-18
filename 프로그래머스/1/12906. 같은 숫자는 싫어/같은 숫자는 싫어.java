import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        Stack<Integer> s =new Stack<>();
        
        for(int i: arr){
            if(s.isEmpty()||s.peek()!=i){
                s.push(i);
            }
        }
        int[] answer = new int[s.size()];
        for(int i=0;i<s.size();i++){
            answer[i]=s.get(i);
        }

        return answer;
    }
}