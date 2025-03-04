class Solution {
    public String solution(String s, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                sb.append(' ');
            }else if(Character.isUpperCase(s.charAt(i))){
                sb.append((char)('A'+(s.charAt(i)-'A'+n)%26));
            }else if(Character.isLowerCase(s.charAt(i))){
                sb.append((char)('a'+(s.charAt(i)-'a'+n)%26));
            }
        }
        
        
        return sb.toString();
    }
}