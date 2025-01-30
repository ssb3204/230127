import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        Integer arr[]= new Integer[answer.length];

        for(int i=0;i<score.length;i++){
            arr[i]=score[i][0]+score[i][1];
        }
        
        Integer sum[]= arr.clone();     
        Arrays.sort(sum, Collections.reverseOrder());
        
        for(int i=0;i<answer.length;i++){
            int rank=1;
            for(int j=0;j<answer.length;j++){
                if(arr[i]<sum[j]){
                    rank++;
                }else if(arr[i].equals(sum[j])){
                    rank=rank;
                }
            }
            answer[i]=rank;
        }
        return answer;
    }
}