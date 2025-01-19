import java.util.StringTokenizer;
class Solution {
    public int solution(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string);
        int num1 = Integer.parseInt(st.nextToken());
        
        while(st.hasMoreTokens()){
            String cal = st.nextToken();
            int num2 = Integer.parseInt(st.nextToken());
            
            if(cal.equals("+")){
                num1+=num2;
            }else if(cal.equals("-")){
                num1-=num2;
            }
        }
        
        return num1;
    }
}