class Solution {
    
    public int getGCD(int a, int b) {
        return a % b == 0 ? b : getGCD(b, a % b);
    }
    
    public int solution(int n) {
        
        int gcd = getGCD(n, 6);
        
        return n / gcd;
    }
}