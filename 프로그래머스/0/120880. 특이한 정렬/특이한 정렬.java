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
        int arr[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}