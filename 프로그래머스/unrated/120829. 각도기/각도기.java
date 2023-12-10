class Solution {
    public int solution(int angle) {
        // 예각: 1, 지각: 2, 둔각: 3, 평각: 4
        
        if(angle < 90) {
            return 1;
        } else if(angle == 90) {
            return 2;
        } else if(angle < 180) {
            return 3;
        } else {
            return 4;
        }
        
        
    }
}