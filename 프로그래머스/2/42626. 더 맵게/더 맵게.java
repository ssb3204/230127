import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int n: scoville){
            pq.add(n);
        }
        
        int answer=0;
        
        while(pq.size()>1&&pq.peek()<K){
            int f=pq.poll();
            int n=pq.poll();
            int sum= f+(n*2);
            
            pq.add(sum);
            answer++;
        }
        
        if(pq.peek()<K){
            answer=-1;    
        }
        return answer;
    }
}