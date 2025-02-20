class Solution {
    public String solution(String s) {
        String answer = "";
        s=s.toLowerCase();
        StringBuilder sb = new StringBuilder(s);
        
        
        if(!Character.isDigit(sb.charAt(0))){
            char f= sb.charAt(0);
            sb.replace(0,1,String.valueOf(Character.toUpperCase(f)));
        }
        
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i) == ' '){
                if(i+1<sb.length()){
                    char n= sb.charAt(i+1);
                sb.replace(i+1,i+2,String.valueOf(Character.toUpperCase(n)));
                }
                
            }
        }
        
        
        return sb.toString();
    }
}