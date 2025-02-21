import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        Queue<Integer> que = new LinkedList<>();
        
        for(Integer pri : prices){
            que.add(pri);
        }
        
        int number=0;
        while(!que.isEmpty()){
            int num= que.poll();
            answer[number]=0;
            
            for(Integer next: que){
                answer[number]++;
                if(next<num){
                    break;
                }
            }
            number++;
        }
        return answer;
    }
}