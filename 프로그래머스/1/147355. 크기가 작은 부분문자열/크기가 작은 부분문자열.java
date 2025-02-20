class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        for(int i=0;i<=t.length()-p.length();i++){
            Long f=Long.parseLong(t.substring(i,i+p.length()));
            Long n =Long.parseLong(p);
            if(f<=n){
                answer++;
            }
        }
        return answer;
    }
}