class Solution {
    
    public int getGCD(int a, int b) {
        return a % b == 0 ? b : getGCD(b, a % b);
    }
    
    public int solution(int n) {
        return n / getGCD(n, 6);
    }
}