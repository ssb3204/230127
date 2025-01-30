import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        List<Integer> list = new ArrayList<>();
        for(int num :numlist){
            list.add(num);
        }
        
        list.sort((a,b)->{
            int ma = Math.abs(a-n);
            int mb = Math.abs(b-n);
            if(ma==mb){
                return b-a;
            }
            return ma-mb;
        });
        return list.stream().mapToInt(i -> i).toArray();
    }
}