class Solution {
    public int solution(int angle) {
        switch(angle){
            case 90:
                return 2;
            case 180:
                return 4;
            default:
                if(angle>0 && angle<90){
                    return 1;
                }else if(angle>90 && angle<180){
                    return 3;
                }else{
                    return 0;
                }
        }
    }
}