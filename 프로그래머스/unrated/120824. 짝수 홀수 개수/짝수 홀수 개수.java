class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[] {0, 0};
        for(int number : num_list) {
            if(number % 2 == 0) answer[0] += 1;
            else answer[1] += 1;
        }
        return answer;
    }
}