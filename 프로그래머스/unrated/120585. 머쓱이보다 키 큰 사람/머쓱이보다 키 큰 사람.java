class Solution {
    public int solution(int[] array, int height) {
        int counter = 0;
        for(int h : array) if(h > height) counter++;
        return counter;
    }
}