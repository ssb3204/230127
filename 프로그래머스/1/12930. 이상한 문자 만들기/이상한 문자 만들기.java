import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        s=s.toUpperCase();
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                sb.append(s.charAt(i));
                cnt=0;
            }else if(cnt%2!=0){
                sb.append(Character.toLowerCase(s.charAt(i)));
                cnt++;
            }else{
                sb.append(s.charAt(i));
                cnt++;
            }
        }
        return sb.toString();
    }
}