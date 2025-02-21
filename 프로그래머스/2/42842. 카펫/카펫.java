class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum=brown+yellow;
        
        for(int i=1;i<=Math.sqrt(sum);i++){
            if(sum%i==0){
                int j=sum/i;
                
                if(2*i+2*j-4==brown){
                    answer[0]=j;
                    answer[1]=i;
                }
            
            }
            
        }
        return answer;
    }
}