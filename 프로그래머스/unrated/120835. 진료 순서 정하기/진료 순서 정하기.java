class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        for(int i = 0; i < emergency.length; i++) {
            answer[i]++;
            for(int j = 0; j < emergency.length; j++) {
                if(emergency[j] > emergency[i]) {
                    answer[i]++;
                }
            }
        }
        return answer;
    }
}