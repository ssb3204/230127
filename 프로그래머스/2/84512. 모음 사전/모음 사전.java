class Solution {
    public int solution(String word) {
        int answer = 0;
        int num[]={781,156,31,6,1};
        String alp="AEIOU";
        
        for(int i=0;i<word.length();i++){
            int n=alp.indexOf(word.charAt(i));
            answer+=n*num[i]+1;
        }
        
        return answer;
    }
}