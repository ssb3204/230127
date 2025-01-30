class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String word[]={"aya", "ye", "woo", "ma"};
        
        for(int i=0;i<babbling.length;i++){
            String s =babbling[i];
            for(String w: word){
                s=s.replace(w," ");
            }
            if(s.trim().isEmpty()){
                answer++;
            }
            
        }
        return answer;
    }
}