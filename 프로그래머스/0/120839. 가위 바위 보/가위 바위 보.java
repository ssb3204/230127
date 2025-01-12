class Solution {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<rsp.length();i++){
            int num= rsp.charAt(i) - '0';
            if(num==2){
                sb.append(0);
            }else if(num==0){
                sb.append(5);            
            }else{
                sb.append(2);
            }
        }
        return sb.toString();
    }
}