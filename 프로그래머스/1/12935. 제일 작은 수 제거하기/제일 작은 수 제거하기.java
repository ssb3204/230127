import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        int array[]= new int[arr.length-1];
        if(arr.length==1){
            answer=new int[]{-1};
        }else{
            int copy[]=Arrays.copyOf(arr,arr.length);
            Arrays.sort(copy);
            int num=copy[0];
            
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=num){
                    list.add(arr[i]);
                }
            }
            
            answer = new int[list.size()];
            for(int i=0;i<list.size();i++){
                answer[i]=list.get(i);
            }
            
        }
        return answer;
    }
}   