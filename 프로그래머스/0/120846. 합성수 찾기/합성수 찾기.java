class Solution {
    public int solution(int n) {
        
        if (n < 4) {
            return 0;
        }
        
        int answer = 0;
        for (int i = 4; i <= n; i++) {
            int counter = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) counter ++;
            }
            if (counter > 2) answer ++;
        }
        
        return answer;
    }
}