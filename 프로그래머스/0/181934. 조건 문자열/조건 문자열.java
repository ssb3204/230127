class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 1;
        if(ineq.equals(">")&&eq.equals("=")){
            if(n-m>=0){
                answer=1;
            }else{
                answer=0;
            }
        }else if(ineq.equals("<")&&eq.equals("=")){
            if(m-n>=0){
                answer=1;
            }else{
                answer=0;
            }
        }else if(ineq.equals(">")&&eq.equals("!")){
            if(n-m>0){
                answer=1;
            }else{
                answer=0;
            }
        }else if(ineq.equals("<")&&eq.equals("!")){
            if(m-n>0){
                answer=1;
            }else{
                answer=0;
            }
        }
        return answer;
    }
}