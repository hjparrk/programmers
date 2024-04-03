class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        char[] chars = Integer.toString(num).toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.getNumericValue(chars[i]) == k) {
                return i + 1;
            }
        }
        return answer;
    }
}