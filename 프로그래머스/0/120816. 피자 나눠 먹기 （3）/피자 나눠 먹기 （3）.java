class Solution {
    public int solution(int slice, int n) {
        int pizza = 1;
        while(true){
            if(slice*pizza>=n){
                break;
            }else{
                pizza++;
            }
        }
        return pizza;
    }
}