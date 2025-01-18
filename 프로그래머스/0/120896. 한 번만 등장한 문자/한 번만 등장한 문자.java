import java.util.Arrays;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<s.length();i++) {
            char n=s.charAt(i);
            boolean mul= true;
            for (int j=0;j<s.length();j++) {
                if (i!=j&&n==s.charAt(j)) {
                    mul = false;
                }
            }
            if (mul) {
                sb.append(n);
            }
        }
        char arr[] = sb.toString().toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}