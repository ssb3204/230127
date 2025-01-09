class Solution {
    public String solution(String my_string) {
        StringBuilder rev=new StringBuilder();
        for(int i=my_string.length()-1;i>=0;i--){
            rev.append(my_string.charAt(i));
        }
        return rev.toString();
    }
}