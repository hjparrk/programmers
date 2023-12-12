import java.math.BigInteger;

class Solution {
    
    public int solution(int balls, int share) {
        BigInteger[] memo = new BigInteger[balls+1];
        memo[0] = BigInteger.ONE;
        for(int i = 1; i < memo.length; i++) {
            memo[i] = memo[i-1].multiply(new BigInteger(String.valueOf(i)));
        }
        BigInteger bigintAnswer = memo[balls].divide((memo[balls - share].multiply(memo[share])));
        int answer = bigintAnswer.intValue();
        return answer;
    }
}