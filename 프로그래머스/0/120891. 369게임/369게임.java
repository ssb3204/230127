class Solution {
    public int solution(int order) {
        String num = Integer.toString(order);
        int cnt=0;
        for(int i=0;i<num.length();i++){
            if(num.charAt(i)=='3'||num.charAt(i)=='6'||num.charAt(i)=='9'){
                cnt++;
            }
        }
        return cnt;
    }
}