class Solution {
    public int[] solution(int n) {
        
        int[] answer = new int[(int) Math.ceil(n / 2.0)];
        
        for(int i = 0, odd = 1; i < answer.length; i++, odd += 2) {
            answer[i] = odd;
        }
        
        return answer;
    }
}