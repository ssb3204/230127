import java.util.ArrayList;
class Solution {
    public int[] solution(int n, int[] numlist) {

        ArrayList<Integer> answer = new ArrayList<>();
        for(int i: numlist){
            if(i%n==0){
                answer.add(i);
            }      
        }
        
        int result[] = new int[answer.size()];
        for(int i=0;i<result.length;i++){
            result[i]=answer.get(i);
        }
        return result;
    }
}