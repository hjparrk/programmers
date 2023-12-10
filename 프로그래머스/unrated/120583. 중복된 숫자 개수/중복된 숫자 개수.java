class Solution {
    public int solution(int[] array, int n) {
        int counter = 0;
        for(int num : array) {
            if(num == n) counter++;
        }
        return counter;
    }
}