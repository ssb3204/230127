class Solution {
    public int solution(int[] array) {
        
        int[] count = new int[1001];
        
        
        for (int num : array) {
            count[num]++;
        }
        
        int max = 0; 
        int num = -1;
        boolean duplicate = false;
        
        for (int i = 0; i <= 1000; i++) {
            if (count[i] > max) {
                max = count[i];
                num = i;
                duplicate = false;
            } else if (count[i] == max && count[i] > 0) {
                duplicate = true; 
            }
        }
        return duplicate ? -1 : num;
    }
}
