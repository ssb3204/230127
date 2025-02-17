import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> result= new ArrayList<>();
        for(int i=0;i<commands.length;i++){
            int f=commands[i][0];
            int e=commands[i][1];
            int n=commands[i][2];
            
            int arr[]=Arrays.copyOfRange(array,f-1,e);
            Arrays.sort(arr);
            result.add(arr[n-1]);
        }
        
        
        return result.stream().mapToInt(i->i).toArray();
    }
}