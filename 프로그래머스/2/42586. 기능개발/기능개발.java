import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0;i<progresses.length;i++){
            int num=(100-progresses[i])/speeds[i];
            if((100- progresses[i])%speeds[i]!=0){
                num++;
            }
            q.add(num);
        }
        
        
        while(!q.isEmpty()){
            int n=q.poll();
            int cnt=1;
            while(!q.isEmpty()&&q.peek()<=n){
                cnt++;
                q.poll();
            }
            answer.add(cnt);
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}