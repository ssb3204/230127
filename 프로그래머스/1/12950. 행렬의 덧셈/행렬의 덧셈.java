class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                int num=arr2[i][j];
                arr1[i][j]+=num;
            }
        }
        return arr1;
    }
}