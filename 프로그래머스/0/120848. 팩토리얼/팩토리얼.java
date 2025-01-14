class Solution {
    public static int fec(int num){
        if(num>1){
            return num*=fec(num-1);
        }
        return 1;
    }
    
    public int solution(int n) {
        int answer = 1;
        while(fec(answer)<=n){
            answer++;
        }
        return answer-1;
    }
    
    
}