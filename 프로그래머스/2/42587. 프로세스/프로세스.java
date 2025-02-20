import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue <int[]> queeu =new LinkedList<>();
        
        for(int i=0;i<priorities.length;i++){
            queeu.add(new int[]{priorities[i],i});
        }
        
        while(!queeu.isEmpty()){
            int num[]=queeu.poll();
            boolean pri =false;
            
            for(int[] pro: queeu){
                if(pro[0]>num[0]){
                    pri=true;
                    break;
                }  
            }
            
            if(pri){
                queeu.add(num);
            }else{
                answer++;
                if(num[1]==location){
                    return answer;
                }
            }
        }
        
        return answer;
    }
}