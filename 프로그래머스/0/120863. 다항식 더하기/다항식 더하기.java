import java.util.StringTokenizer;

class Solution {
    public String solution(String polynomial) {
        StringTokenizer st=new StringTokenizer(polynomial, " + ");
        int numx=0;
        int num=0;

        while (st.hasMoreTokens()) {
            String token=st.nextToken();

            if (token.contains("x")) {
                if (token.equals("x")) {
                    numx++;
                } else {
                    numx+=Integer.parseInt(token.replace("x", ""));
                }
            } else {
                num+=Integer.parseInt(token);
            }
        }

        StringBuilder sb = new StringBuilder();
        if (numx!=0) {
            if (numx==1) {
                sb.append("x");
            } else {
                sb.append(numx).append("x");
            }
        }
        if (num!=0) {
            if (sb.length()>0) {
                sb.append(" + ");
            }
            sb.append(num);
        }

        return sb.length() > 0 ? sb.toString() : "0";
    }
}
