class Solution {
    public String solution(String my_string) {
        String answer = "";
        String no="aeiuo";
        for(int i=0;i<my_string.length();i++){
            if(no.indexOf(my_string.charAt(i))==-1){
                answer+=my_string.charAt(i);
            }
        
        }
        return answer;
    }
}