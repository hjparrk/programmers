class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        
        int idx = 0;
		
		for (int i = 0; i < k; i++) {
			if(idx > numbers.length-1) {
				idx -= numbers.length;
			}
			answer = numbers[idx];
			idx += 2;
		}
        
        return answer;
    }
}