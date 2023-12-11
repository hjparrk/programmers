class Solution {
    public int solution(int n) {
        int sum = 0;
        for(char c : ("" + n).toCharArray()) sum += Character.getNumericValue(c);
        return sum;
        
        // int answer = 0;
        // while(n != 0){
        //     answer += (n%10);
        //     n = n/10;
        // }
        // return answer;
    }
}