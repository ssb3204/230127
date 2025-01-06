class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        
        for(int i=0;i<=str1.length()-str2.length();i++){
            boolean check=true;
            for(int j=0;j<str2.length();j++){
                    if(str1.charAt(i+j)!=str2.charAt(j)){
                       check=false; 
                        break;
                    }
            }
            if(check)
                return 1;
        }
        return 2;
    }
}