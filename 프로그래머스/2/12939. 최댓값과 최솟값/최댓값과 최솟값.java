import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int arr[]=Arrays.stream(s.split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        
        Arrays.sort(arr);
        if(arr[0]>arr[arr.length-1]){
            sb.append(arr[arr.length-1]+" "+arr[0]);
        }else{
            sb.append(arr[0]+" "+arr[arr.length-1]);
        }
        
        
        return sb.toString();
    }
}