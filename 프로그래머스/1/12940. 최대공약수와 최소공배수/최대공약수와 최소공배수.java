class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0]=gcd(n,m);
        answer[1]=n*m/gcd(n,m);
        return answer;
    }
    
    public int gcd(int a,int b){
        while(b!=0){
            int tmp=b;
            b=a%b;
            a=tmp;
        }
        return a;
    }
}