import java.util.ArrayList;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> num = new ArrayList<>();
        
        for(int i=2;i<=n;i++){
            while(n%i==0){
                if(!num.contains(i)){
                    num.add(i);
                }
                n/=i;
            }
        }
        
        int answer[]= new int[num.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=num.get(i);
        }
        return answer;
    }
}