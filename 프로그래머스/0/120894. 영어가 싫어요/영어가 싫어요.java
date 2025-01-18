class Solution {
    public long solution(String numbers) {
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i<numbers.length()){
            for(int j=0;j<num.length;j++){
                if(numbers.startsWith(num[j],i)){
                    sb.append(j);
                    i+=num[j].length();
                    break;
                }
            }
        }
        return Long.parseLong(sb.toString());
    }
}