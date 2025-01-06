class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int answer[] = new int[2];
        int s = numer1 * denom2 + numer2 * denom1;
        int m = denom1 * denom2;
        
        int gcd= gcd(s,m);
        s/=gcd;
        m/=gcd;
            
        answer[0]=s;
        answer[1]=m;
        
        return answer;
    }
    private int gcd(int a,int b){
        while(b!=0){
            int k= a%b;
            a=b;
            b=k;
        }
        return Math.abs(a);
    }
}